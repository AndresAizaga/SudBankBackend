package com.sudamericano.bank.infrastructure.controller.structure.R;

import com.sudamericano.bank.domain.model.structure.R.R22Dto;
import com.sudamericano.bank.domain.ports.inputs.catalog.CatalogT29UseCase;
import com.sudamericano.bank.domain.ports.inputs.catalog.CatalogT4UseCase;
import com.sudamericano.bank.domain.ports.inputs.structure.R.R22UseCase;
import com.sudamericano.bank.infrastructure.outputs.ResponseDTO;
import com.sudamericano.bank.infrastructure.outputs.structure.R22ResumenResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Structure R22", description = "Structure R22 management endpoints")
@RestController
@RequestMapping("/api/structures/R22")
public class R22Controller {
    private final R22UseCase useCase;
    private final CatalogT4UseCase catalogUseCase;
    private final CatalogT29UseCase catalogT29UseCase;

    public R22Controller(R22UseCase useCase, CatalogT4UseCase catalogUseCase, CatalogT29UseCase catalogT29UseCase) {
        this.useCase = useCase;
        this.catalogUseCase = catalogUseCase;
        this.catalogT29UseCase = catalogT29UseCase;
    }

    @GetMapping
    public List<R22Dto> getAll() {
        return useCase.findAll();
    }

    @GetMapping("/resume")
    public List<R22ResumenResponse> getAllResume(){
        List<R22ResumenResponse> resumes = new java.util.ArrayList<>(List.of());

        for(R22Dto dto : useCase.findAll()){
            R22ResumenResponse resume = new R22ResumenResponse();
            catalogUseCase.getAllCatalogT4().stream().filter(x -> x.getId() == (dto.getCodigoTipoIdentificacion()))
                    .findFirst()
                    .ifPresent(catalogT4 -> resume.setTipoIdentificacion(
                            new ResponseDTO(catalogT4.getId(), catalogT4.getDescripcion())
                    ));
            catalogT29UseCase.getAllCatalogT29().stream().filter(x -> x.getId() == (dto.getCalificacionPropia()))
                    .findFirst()
                    .ifPresent(catalogT29 -> resume.setCalificacionPropia(
                            new ResponseDTO(catalogT29.getId(), catalogT29.getDescripcion())
                    ));
            catalogT29UseCase.getAllCatalogT29().stream().filter(x -> x.getId() == (dto.getCalificacionHomologada()))
                    .findFirst()
                    .ifPresent(catalogT29_1 -> resume.setCalificacionHomologada(
                            new ResponseDTO(catalogT29_1.getId(), catalogT29_1.getDescripcion())
                    ));

            resume.setIdentificacionSujeto(dto.getIdentificacionSujeto());
            resume.setNumeroTarjeta(dto.getNumeroTarjeta());
            resume.setDiasMorasidad(dto.getDiasMorasidad());
            resumes.add(resume);
        }
        return resumes;
    }

    @GetMapping("/{id}")
    public R22Dto getById(@PathVariable Long id) {
        return useCase.findById(id);
    }

    @PostMapping
    public R22Dto create(@RequestBody R22Dto dto) {
        return useCase.create(dto);
    }

    @PutMapping("/{id}")
    public R22Dto update(Long id, R22Dto dto) {
        return useCase.update(id, dto);
    }

    @DeleteMapping("/{id}")
    public void delete(Long id) {
        useCase.delete(id);
    }
    
}
