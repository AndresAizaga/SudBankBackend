package com.sudamericano.bank.infrastructure.controller.structure.R;

import com.sudamericano.bank.domain.model.catalog.CatalogT29;
import com.sudamericano.bank.domain.model.catalog.CatalogT35;
import com.sudamericano.bank.domain.model.catalog.CatalogT55;
import com.sudamericano.bank.domain.model.catalog.CatalogT218;
import com.sudamericano.bank.domain.model.catalog.CatalogT317;
import com.sudamericano.bank.domain.model.structure.R.R04Dto;
import com.sudamericano.bank.domain.ports.inputs.catalog.*;
import com.sudamericano.bank.domain.ports.inputs.structure.R.R04UseCase;
import com.sudamericano.bank.infrastructure.outputs.ResponseDTO;
import com.sudamericano.bank.infrastructure.outputs.structure.R04ResumeResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Tag(name = "Structure R04", description = "Structure R04 management endpoints")
@RestController
@RequestMapping("/api/structures/R04")
public class R04Controller {
    private final R04UseCase useCase;
    private final CatalogT4UseCase catalogT4UseCase;
    private final CatalogT29UseCase catalogT29UseCase;
    private final CatalogT35UseCase catalogT35UseCase;
    private final CatalogT55UseCase catalogT55UseCase;
    private final CatalogT218UseCase catalogT218UseCase;
    private final CatalogT317UseCase catalogT317UseCase;

    public R04Controller(R04UseCase useCase,
                         CatalogT4UseCase catalogT4UseCase,
                         CatalogT29UseCase catalogT29UseCase,
                         CatalogT35UseCase catalogT35UseCase,
                         CatalogT55UseCase catalogT55UseCase,
                         CatalogT218UseCase catalogT218UseCase,
                         CatalogT317UseCase catalogT317UseCase) {
        this.useCase = useCase;
        this.catalogT4UseCase = catalogT4UseCase;
        this.catalogT29UseCase = catalogT29UseCase;
        this.catalogT35UseCase = catalogT35UseCase;
        this.catalogT55UseCase = catalogT55UseCase;
        this.catalogT218UseCase = catalogT218UseCase;
        this.catalogT317UseCase = catalogT317UseCase;
    }

    @GetMapping
    public List<R04Dto> getAll() {
        return useCase.findAll();
    }

    @GetMapping("/resume")
    public List<R04ResumeResponse> getAllResume() {
        List<R04ResumeResponse> resumes = new java.util.ArrayList<>(List.of());

        for (R04Dto dto : useCase.findAll()) {
            R04ResumeResponse resume = new R04ResumeResponse();
            
            // Mapeo manual de campos básicos
            resume.setNumeroOperacion(dto.getNumeroOperacion());
            resume.setIdentificacionSujeto(dto.getIdentificacionSujeto());
            resume.setDiasMorosidad(dto.getDiasMorosidad());
            resume.setTasaInteres(dto.getTasaInteres());
            resume.setValorPorVencer1a30(dto.getValorPorVencer1a30());
            resume.setValorPorVencer31a90(dto.getValorPorVencer31a90());
            resume.setValorPorVencer91a180(dto.getValorPorVencer91a180());
            resume.setValorPorVencer181a360(dto.getValorPorVencer181a360());
            resume.setValorPorVencerMas360(dto.getValorPorVencerMas360());
            resume.setValorNoDevenga1a30(dto.getValorNoDevenga1a30());
            resume.setValorNoDevenga31a90(dto.getValorNoDevenga31a90());
            resume.setValorNoDevenga91a180(dto.getValorNoDevenga91a180());
            resume.setValorNoDevenga181a360(dto.getValorNoDevenga181a360());
            resume.setValorNoDevengaMas360(dto.getValorNoDevengaMas360());
            resume.setValorVencido1a30(dto.getValorVencido1a30());
            resume.setValorVencido31a90(dto.getValorVencido31a90());
            resume.setValorVencido91a180(dto.getValorVencido91a180());
            resume.setValorVencido181a360(dto.getValorVencido181a360());
            resume.setValorVencidoMas360(dto.getValorVencidoMas360());
            resume.setValorVencido181a270(dto.getValorVencido181a270());
            resume.setValorVencidoMas270(dto.getValorVencidoMas270());
            resume.setValorVencido91a270(dto.getValorVencido91a270());
            resume.setValorVencido271a360(dto.getValorVencido271a360());
            resume.setValorVencido361a720(dto.getValorVencido361a720());
            resume.setValorVencidoMas720(dto.getValorVencidoMas720());
            resume.setGastosRecuperacion(dto.getGastosRecuperacion());
            resume.setInteresOrdinario(dto.getInteresOrdinario());
            resume.setInteresSobreMora(dto.getInteresSobreMora());
            resume.setValorDemandaJudicial(dto.getValorDemandaJudicial());
            resume.setCarteraCastigada(dto.getCarteraCastigada());
            resume.setProvisionRequeridaOriginal(dto.getProvisionRequeridaOriginal());
            resume.setProvisionRequeridaReducida(dto.getProvisionRequeridaReducida());
            resume.setProvisionConstituida(dto.getProvisionConstituida());
            resume.setPrimaDescuento(dto.getPrimaDescuento());
            resume.setCuotaCredito(dto.getCuotaCredito());
            resume.setValorInteresesCuota(dto.getValorInteresesCuota());
            resume.setValorSeguro(dto.getValorSeguro());
            resume.setSaldoCuotaCapitalDiferida(dto.getSaldoCuotaCapitalDiferida());
            resume.setValorInteresCapitalDiferido(dto.getValorInteresCapitalDiferido());
            resume.setFechaTransferenciaCuentasVencidas(dto.getFechaTransferenciaCuentasVencidas());
            resume.setInteresesAcumuladosPorCobrar(dto.getInteresesAcumuladosPorCobrar());
            resume.setInteresesReversados(dto.getInteresesReversados());
            resume.setFechaExigibilidadCuota(dto.getFechaExigibilidadCuota());

            // Mapeo de catálogos
            catalogT4UseCase.getAllCatalogT4().stream().filter(x -> x.getId() == (dto.getCodigoTipoIdentificacion()))
                    .findFirst()
                    .ifPresent(catalogT4 -> resume.setTipoIdentificacion(
                            new ResponseDTO(catalogT4.getId(), catalogT4.getDescripcion())
                    ));

            // T218 - Metodología de calificación
            catalogT218UseCase.getAllCatalogT218().stream().filter(x -> x.getId() == (dto.getCodigoMetodologiaCalificacion()))
                    .findFirst()
                    .ifPresent(metodologia -> resume.setMetodologiaCalificacion(
                            new ResponseDTO(metodologia.getId(), metodologia.getDescripcion())
                    ));

            // T29 - Calificación propia
            catalogT29UseCase.getAllCatalogT29().stream().filter(x -> x.getId() == (dto.getCodigoCalificacionPropia()))
                    .findFirst()
                    .ifPresent(calificacionPropia -> resume.setCalificacionPropia(
                            new ResponseDTO(calificacionPropia.getId(), calificacionPropia.getDescripcion())
                    ));

            // T29 - Calificación homologada
            catalogT29UseCase.getAllCatalogT29().stream().filter(x -> x.getId() == (dto.getCodigoCalificacionHomologada()))
                    .findFirst()
                    .ifPresent(calificacionHomologada -> resume.setCalificacionHomologada(
                            new ResponseDTO(calificacionHomologada.getId(), calificacionHomologada.getDescripcion())
                    ));

            // T35 - Tipo de operación
            catalogT35UseCase.getAllCatalogT35().stream().filter(x -> x.getId() == (dto.getCodigoTipoOperacion()))
                    .findFirst()
                    .ifPresent(tipoOperacion -> resume.setTipoOperacion(
                            new ResponseDTO(tipoOperacion.getId(), tipoOperacion.getDescripcion())
                    ));

            // T55 - Objeto del fideicomiso
            catalogT55UseCase.getAllCatalogT55().stream().filter(x -> x.getId() == (dto.getCodigoObjetoFideicomiso()))
                    .findFirst()
                    .ifPresent(objetoFideicomiso -> resume.setObjetoFideicomiso(
                            new ResponseDTO(objetoFideicomiso.getId(), objetoFideicomiso.getDescripcion())
                    ));

            catalogT317UseCase.getAllT317().stream().filter(x -> x.getId().equals(Long.valueOf(dto.getCodigoTipoSistemaAmortizacion())))
                    .findFirst()
                    .ifPresent(tipoSistemaAmortizacion -> resume.setTipoSistemaAmortizacion(
                            new ResponseDTO(tipoSistemaAmortizacion.getId().intValue(), tipoSistemaAmortizacion.getDescripcion())
                    ));

            resumes.add(resume);
        }
        return resumes;
    }

    @GetMapping("/{id}")
    public R04Dto getById(@PathVariable Long id) {
        return useCase.findById(id);
    }

    @PostMapping
    public R04Dto create(@RequestBody R04Dto dto) {
        return useCase.create(dto);
    }

    @PutMapping("/{id}")
    public R04Dto update(@PathVariable Long id, @RequestBody R04Dto dto) {
        return useCase.update(id, dto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        useCase.delete(id);
    }
}   