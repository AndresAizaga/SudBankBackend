package com.sudamericano.bank.infrastructure.controller.structure.L;

import com.sudamericano.bank.domain.model.catalog.T9Dto;
import com.sudamericano.bank.domain.model.structure.L.L07Dto;
import com.sudamericano.bank.domain.ports.inputs.catalog.CatalogT4UseCase;
import com.sudamericano.bank.domain.ports.inputs.catalog.CatalogT73UseCase;
import com.sudamericano.bank.domain.ports.inputs.catalog.T9UseCase;
import com.sudamericano.bank.domain.ports.inputs.structure.L.L07UseCase;
import com.sudamericano.bank.infrastructure.outputs.ResponseDTO;
import com.sudamericano.bank.infrastructure.outputs.structure.L07ResumeResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Structure L07", description = "Structure L07 management endpoints")
@RestController
@RequestMapping("/api/structures/l07")
public class L07Controller {
    private final L07UseCase useCase;
    private final CatalogT4UseCase catalogT4UseCase;
    private final CatalogT73UseCase catalogT73UseCase;
    private final T9UseCase t9UseCase;

    public L07Controller(L07UseCase useCase,
                         CatalogT4UseCase catalogT4UseCase,
                         CatalogT73UseCase catalogT73UseCase,
                         T9UseCase t9UseCase) {
        this.useCase = useCase;
        this.catalogT4UseCase = catalogT4UseCase;
        this.catalogT73UseCase = catalogT73UseCase;
        this.t9UseCase = t9UseCase;
    }

    @GetMapping
    public List<L07Dto> getAll() {
        return useCase.findAll();
    }

    @GetMapping("/resume")
    public List<L07ResumeResponse> getAllResume() {
        List<L07ResumeResponse> resumes = new java.util.ArrayList<>(List.of());

        for (L07Dto dto : useCase.findAll())  {
            L07ResumeResponse resume = new L07ResumeResponse();

            catalogT4UseCase.getAllCatalogT4().stream().filter(x -> x.getId() == (dto.getTipoIdentificacionEmisor()))
                    .findFirst()
                    .ifPresent(catalogT4 -> resume.setTipoIdentificacionEmisor(
                            new ResponseDTO(catalogT4.getId(), catalogT4.getDescripcion())
                    ));

            resume.setIdentificacionEmisor(dto.getIdentificacionEmisor());

            T9Dto nacionalidad = t9UseCase.findById(dto.getNacionalidadEmisor());
            if(nacionalidad != null){
                resume.setNacionalidadEmisor(new ResponseDTO(nacionalidad.getId(), nacionalidad.descripcion));
            }

            catalogT73UseCase.getAllCatalogT73().stream().filter(x -> x.getId() == (dto.getTipoEmisor()))
                    .findFirst()
                    .ifPresent(catalogT73 -> resume.setTipoEmisor(
                            new ResponseDTO(catalogT73.getId(), catalogT73.getDescripcion())
                    ));
            resumes.add(resume);
        }
        return resumes;
    }

    @GetMapping("/{id}")
    public L07Dto getById(@PathVariable Integer id){
        return useCase.findById(id);
    }

    @PostMapping
    public L07Dto create(@RequestBody L07Dto dto){
        return useCase.create(dto);
    }

    @PutMapping("/{id}")
    public L07Dto update(@PathVariable Integer id, @RequestBody L07Dto dto){
        return useCase.update(id, dto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        useCase.delete(id);
    }





}
