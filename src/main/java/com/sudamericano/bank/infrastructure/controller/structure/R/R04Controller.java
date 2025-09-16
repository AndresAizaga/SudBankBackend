package com.sudamericano.bank.infrastructure.controller.structure.R;

import com.sudamericano.bank.domain.model.catalog.CatalogT4;
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

        // Cache de catálogos para optimizar rendimiento
        List<CatalogT4> catalogT4List = catalogT4UseCase.getAllCatalogT4();
        List<CatalogT29> catalogT29List = catalogT29UseCase.getAllCatalogT29();
        List<CatalogT35> catalogT35List = catalogT35UseCase.getAllCatalogT35();
        List<CatalogT55> catalogT55List = catalogT55UseCase.getAllCatalogT55();
        List<CatalogT218> catalogT218List = catalogT218UseCase.getAllCatalogT218();
        List<CatalogT317> catalogT317List = catalogT317UseCase.getAllT317();

        for (R04Dto dto : useCase.findAll()) {
            R04ResumeResponse resume = new R04ResumeResponse();
            
            // Mapeo manual de campos básicos
            resume.setNumeroOperacion(dto.getNumeroOperacion());
            resume.setIdentificacionSujeto(dto.getIdentificacionSujeto());
            resume.setDiasMorosidad(dto.getDiasMorosidad());
            resume.setTasaInteres(dto.getTasaInteres());
            resume.setValorPorVencer1a30(dto.getValorSaldoVencer1a30d());
            resume.setValorPorVencer31a90(dto.getValorSaldoVencer31a90d());
            resume.setValorPorVencer91a180(dto.getValorSaldoVencer91a180d());
            resume.setValorPorVencer181a360(dto.getValorSaldoVencer181a360d());
            resume.setValorPorVencerMas360(dto.getValorSaldoVencerMasde360d());
            resume.setValorNoDevenga1a30(dto.getValorNoDevInteres1a30d());
            resume.setValorNoDevenga31a90(dto.getValorNoDevInteres31a90d());
            resume.setValorNoDevenga91a180(dto.getValorNoDevInteres91a180d());
            resume.setValorNoDevenga181a360(dto.getValorNoDevInteres181a360d());
            resume.setValorNoDevengaMas360(dto.getValorNoDevInteresMasde360d());
            resume.setValorVencido1a30(dto.getValorVencido1a30d());
            resume.setValorVencido31a90(dto.getValorVencido31a90d());
            resume.setValorVencido91a180(dto.getValorVencido91a180d());
            resume.setValorVencido181a360(dto.getValorVencido181a360d());
            resume.setValorVencidoMas360(dto.getValorVencidoMasde360d());
            resume.setValorVencido181a270(dto.getValorVencido181a270d());
            resume.setValorVencidoMas270(dto.getValorVencidoMasde270d());
            resume.setValorVencido91a270(dto.getValorVencido91a270d());
            resume.setValorVencido271a360(dto.getValorVencido271a360d());
            resume.setValorVencido361a720(dto.getValorVencido361a720d());
            resume.setValorVencidoMas720(dto.getValorVencidoMasde720d());
            resume.setGastosRecuperacion(dto.getGastosRecuperaCarteraVencida());
            resume.setInteresOrdinario(dto.getInteresOrdinario());
            resume.setInteresSobreMora(dto.getInteresSobreMora());
            resume.setValorDemandaJudicial(dto.getValorDemandaJudicial());
            resume.setCarteraCastigada(dto.getCarteraCastigada());
            resume.setProvisionRequeridaOriginal(dto.getProvisionRequeridaOriginal());
            resume.setProvisionRequeridaReducida(dto.getProvisionRequeridaReducida());
            resume.setProvisionConstituida(dto.getProvisionConstituida());
            resume.setPrimaDescuento(dto.getPrimaDescuento());
            resume.setCuotaCredito(dto.getCuotaCredito());
            resume.setValorInteresesCuota(dto.getValorInteresCuotaCredito());
            resume.setValorSeguro(dto.getValorSeguro());
            resume.setSaldoCuotaCapitalDiferida(dto.getSaldoCuotaCapitalDiferida());
            resume.setValorInteresCapitalDiferido(dto.getValorInteresCapitalDiferido());
            resume.setFechaTransferenciaCuentasVencidas(dto.getFechaTransferCuentasVencidas());
            resume.setInteresesAcumuladosPorCobrar(dto.getInteresesAcumuladosCobrar());
            resume.setInteresesReversados(dto.getInteresesReservados());
            resume.setFechaExigibilidadCuota(dto.getFechaExigibilidadCuota());

            // Mapeo de catálogos - Usando listas cacheadas para optimizar rendimiento
            // T4 - Tipo de identificación
            if (dto.getCodigoTipoIdentificacion() != null) {
                catalogT4List.stream()
                        .filter(x -> x.getId() == dto.getCodigoTipoIdentificacion())
                        .findFirst()
                        .ifPresent(catalogT4 -> resume.setTipoIdentificacion(
                                new ResponseDTO(catalogT4.getId(), catalogT4.getDescripcion())
                        ));
            }

            // T218 - Metodología de calificación
            if (dto.getCodigoMetodologiaCalificacion() != null) {
                catalogT218List.stream()
                        .filter(x -> x.getId() == dto.getCodigoMetodologiaCalificacion())
                        .findFirst()
                        .ifPresent(metodologia -> resume.setMetodologiaCalificacion(
                                new ResponseDTO(metodologia.getId(), metodologia.getDescripcion())
                        ));
            }

            // T29 - Calificación propia
            if (dto.getCodigoCalificacionPropia() != null) {
                catalogT29List.stream()
                        .filter(x -> x.getId() == dto.getCodigoCalificacionPropia())
                        .findFirst()
                        .ifPresent(calificacionPropia -> resume.setCalificacionPropia(
                                new ResponseDTO(calificacionPropia.getId(), calificacionPropia.getDescripcion())
                        ));
            }

            // T29 - Calificación homologada
            if (dto.getCodigoCalificacionHomologada() != null) {
                catalogT29List.stream()
                        .filter(x -> x.getId() == dto.getCodigoCalificacionHomologada())
                        .findFirst()
                        .ifPresent(calificacionHomologada -> resume.setCalificacionHomologada(
                                new ResponseDTO(calificacionHomologada.getId(), calificacionHomologada.getDescripcion())
                        ));
            }

            // T35 - Tipo de operación
            if (dto.getCodigoTipoOperacion() != null) {
                catalogT35List.stream()
                        .filter(x -> x.getId() == dto.getCodigoTipoOperacion())
                        .findFirst()
                        .ifPresent(tipoOperacion -> resume.setTipoOperacion(
                                new ResponseDTO(tipoOperacion.getId(), tipoOperacion.getDescripcion())
                        ));
            }

            // T55 - Objeto del fideicomiso
            if (dto.getCodigoObjetoFideicomiso() != null) {
                catalogT55List.stream()
                        .filter(x -> x.getId() == dto.getCodigoObjetoFideicomiso())
                        .findFirst()
                        .ifPresent(objetoFideicomiso -> resume.setObjetoFideicomiso(
                                new ResponseDTO(objetoFideicomiso.getId(), objetoFideicomiso.getDescripcion())
                        ));
            }

            // T317 - Tipo de sistema de amortización
            if (dto.getCodigoTipoSistemaAmortizacion() != null) {
                catalogT317List.stream()
                        .filter(x -> x.getId().equals(Long.valueOf(dto.getCodigoTipoSistemaAmortizacion())))
                        .findFirst()
                        .ifPresent(tipoSistemaAmortizacion -> resume.setTipoSistemaAmortizacion(
                                new ResponseDTO(tipoSistemaAmortizacion.getId().intValue(), tipoSistemaAmortizacion.getDescripcion())
                        ));
            }

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