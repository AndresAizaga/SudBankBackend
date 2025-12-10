package com.sudamericano.bank.infrastructure.controller.structure.L;

import com.sudamericano.bank.domain.model.catalog.T47Dto;
import com.sudamericano.bank.domain.model.catalog.T79Dto;
import com.sudamericano.bank.domain.model.structure.L.L09Dto;
import com.sudamericano.bank.domain.ports.inputs.catalog.T47UseCase;
import com.sudamericano.bank.domain.ports.inputs.catalog.T79UseCase;
import com.sudamericano.bank.domain.ports.inputs.structure.L.L09UseCase;
import com.sudamericano.bank.infrastructure.outputs.ResponseDTO;
import com.sudamericano.bank.infrastructure.outputs.structure.L09ResumeResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Structure L09", description = "Structure L09 management endpoints")
@RestController
@RequestMapping("/api/structures/l09")
public class L09Controller {

    private final L09UseCase useCase;
    private final T47UseCase t47UseCase;
    private final T79UseCase t79UseCase;

    public L09Controller(L09UseCase useCase,
                         T47UseCase t47UseCase,
                         T79UseCase t79UseCase) {
        this.useCase = useCase;
        this.t47UseCase = t47UseCase;
        this.t79UseCase = t79UseCase;
    }

    @GetMapping
    public List<L09Dto> getAll(){
        return useCase.findAll();
    }

    @GetMapping("/resume")
    public List<L09ResumeResponse> getAllResume() {
        List<L09ResumeResponse> resumes = new java.util.ArrayList<>(List.of());

        for(L09Dto dto : useCase.findAll()){
            L09ResumeResponse resume = new L09ResumeResponse();

            resume.setCodigoProducto(dto.getCodigoProducto());
            resume.setDescripcionProducto(dto.getDescripcionProducto());

            T79Dto fondo = t79UseCase.findById(dto.getCodigoFondoInversion());
            if (fondo != null){
                resume.setCodigoFondoInversion(new ResponseDTO(fondo.getId(), fondo.getDescripcion()));
            }

            T47Dto estado = t47UseCase.findById(dto.getEstadoRegistro());
            if (estado != null){
                resume.setEstadoRegistro(new ResponseDTO(estado.getId(), estado.getDescripcion()));
            }
            resumes.add(resume);
        }

        return resumes;


    }

    @GetMapping("/{id}")
    public L09Dto getById(@PathVariable Integer id){
        return useCase.findById(id);
    }

    @PostMapping
    public L09Dto create(@RequestBody L09Dto dto){
        return useCase.create(dto);
    }

    @PutMapping("/{id}")
    public L09Dto update(@PathVariable Integer id, @RequestBody L09Dto dto){
        return useCase.update(id, dto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        useCase.delete(id);
    }
}
