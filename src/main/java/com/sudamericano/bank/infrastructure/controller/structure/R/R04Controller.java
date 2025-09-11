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
            resume.numeroOperacion = dto.getNumeroOperacion();
            resume.identificacionSujeto = dto.getIdentificacionSujeto();
            resume.diasMorosidad = dto.getDiasMorosidad();
            resume.tasaInteres = dto.getTasaInteres();
            resume.valorPorVencer1a30 = dto.getValorPorVencer1a30();
            resume.valorPorVencer31a90 = dto.getValorPorVencer31a90();
            resume.valorPorVencer91a180 = dto.getValorPorVencer91a180();
            resume.valorPorVencer181a360 = dto.getValorPorVencer181a360();
            resume.valorPorVencerMas360 = dto.getValorPorVencerMas360();
            resume.valorNoDevenga1a30 = dto.getValorNoDevenga1a30();
            resume.valorNoDevenga31a90 = dto.getValorNoDevenga31a90();
            resume.valorNoDevenga91a180 = dto.getValorNoDevenga91a180();
            resume.valorNoDevenga181a360 = dto.getValorNoDevenga181a360();
            resume.valorNoDevengaMas360 = dto.getValorNoDevengaMas360();
            resume.valorVencido1a30 = dto.getValorVencido1a30();
            resume.valorVencido31a90 = dto.getValorVencido31a90();
            resume.valorVencido91a180 = dto.getValorVencido91a180();
            resume.valorVencido181a360 = dto.getValorVencido181a360();
            resume.valorVencidoMas360 = dto.getValorVencidoMas360();
            resume.valorVencido181a270 = dto.getValorVencido181a270();
            resume.valorVencidoMas270 = dto.getValorVencidoMas270();
            resume.valorVencido91a270 = dto.getValorVencido91a270();
            resume.valorVencido271a360 = dto.getValorVencido271a360();
            resume.valorVencido361a720 = dto.getValorVencido361a720();
            resume.valorVencidoMas720 = dto.getValorVencidoMas720();
            resume.gastosRecuperacion = dto.getGastosRecuperacion();
            resume.interesOrdinario = dto.getInteresOrdinario();
            resume.interesSobreMora = dto.getInteresSobreMora();
            resume.valorDemandaJudicial = dto.getValorDemandaJudicial();
            resume.carteraCastigada = dto.getCarteraCastigada();
            resume.provisionRequeridaOriginal = dto.getProvisionRequeridaOriginal();
            resume.provisionRequeridaReducida = dto.getProvisionRequeridaReducida();
            resume.provisionConstituida = dto.getProvisionConstituida();
            resume.primaDescuento = dto.getPrimaDescuento();
            resume.cuotaCredito = dto.getCuotaCredito();
            resume.valorInteresesCuota = dto.getValorInteresesCuota();
            resume.valorSeguro = dto.getValorSeguro();
            resume.saldoCuotaCapitalDiferida = dto.getSaldoCuotaCapitalDiferida();
            resume.valorInteresCapitalDiferido = dto.getValorInteresCapitalDiferido();
            resume.fechaTransferenciaCuentasVencidas = dto.getFechaTransferenciaCuentasVencidas();
            resume.interesesAcumuladosPorCobrar = dto.getInteresesAcumuladosPorCobrar();
            resume.interesesReversados = dto.getInteresesReversados();
            resume.fechaExigibilidadCuota = dto.getFechaExigibilidadCuota();

            // Mapeo de catálogos
            catalogT4UseCase.getAllCatalogT4().stream().filter(x -> x.getId() == (dto.getCodigoTipoIdentificacion()))
                    .findFirst()
                    .ifPresent(catalogT4 -> resume.tipoIdentificacion = 
                            new ResponseDTO(catalogT4.getId(), catalogT4.getDescripcion())
                    );

            // T218 - Metodología de calificación
            catalogT218UseCase.getAllCatalogT218().stream().filter(x -> x.getId() == (dto.getCodigoMetodologiaCalificacion()))
                    .findFirst()
                    .ifPresent(metodologia -> resume.metodologiaCalificacion = 
                            new ResponseDTO(metodologia.getId(), metodologia.getDescripcion())
                    );

            // T29 - Calificación propia
            catalogT29UseCase.getAllCatalogT29().stream().filter(x -> x.getId() == (dto.getCodigoCalificacionPropia()))
                    .findFirst()
                    .ifPresent(calificacionPropia -> resume.calificacionPropia = 
                            new ResponseDTO(calificacionPropia.getId(), calificacionPropia.getDescripcion())
                    );

            // T29 - Calificación homologada
            catalogT29UseCase.getAllCatalogT29().stream().filter(x -> x.getId() == (dto.getCodigoCalificacionHomologada()))
                    .findFirst()
                    .ifPresent(calificacionHomologada -> resume.calificacionHomologada = 
                            new ResponseDTO(calificacionHomologada.getId(), calificacionHomologada.getDescripcion())
                    );

            // T35 - Tipo de operación
            catalogT35UseCase.getAllCatalogT35().stream().filter(x -> x.getId() == (dto.getCodigoTipoOperacion()))
                    .findFirst()
                    .ifPresent(tipoOperacion -> resume.tipoOperacion = 
                            new ResponseDTO(tipoOperacion.getId(), tipoOperacion.getDescripcion())
                    );

            // T55 - Objeto del fideicomiso
            catalogT55UseCase.getAllCatalogT55().stream().filter(x -> x.getId() == (dto.getCodigoObjetoFideicomiso()))
                    .findFirst()
                    .ifPresent(objetoFideicomiso -> resume.objetoFideicomiso = 
                            new ResponseDTO(objetoFideicomiso.getId(), objetoFideicomiso.getDescripcion())
                    );

            catalogT317UseCase.getAllT317().stream().filter(x -> x.getId().equals(Long.valueOf(dto.getCodigoTipoSistemaAmortizacion())))
                    .findFirst()
                    .ifPresent(tipoSistemaAmortizacion -> resume.tipoSistemaAmortizacion = 
                            new ResponseDTO(tipoSistemaAmortizacion.getId().intValue(), tipoSistemaAmortizacion.getDescripcion())
                    );

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