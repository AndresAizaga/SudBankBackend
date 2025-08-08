package com.sudamericano.bank.infrastructure.controller;

import com.sudamericano.bank.domain.model.Nesl05Dto;
import com.sudamericano.bank.domain.ports.inputs.Nesl05UseCase;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Structure L05", description = "Structure L05 management endpoints")
@RestController
@RequestMapping("/api/structures/l05")
public class StructureL05Controller {
    private final Nesl05UseCase nesl05UseCase;

    public StructureL05Controller(Nesl05UseCase nesl05UseCase) {
        this.nesl05UseCase = nesl05UseCase;
    }

    @GetMapping
    public List<Nesl05Dto> getAll() {
        return nesl05UseCase.findAll();
    }

    @GetMapping("/{id}")
    public Nesl05Dto getById(@PathVariable Integer id) {
        return nesl05UseCase.findById(id);
    }

    @PostMapping
    public Nesl05Dto create(@RequestBody Nesl05Dto dto) {
        return nesl05UseCase.create(dto);
    }

    @PutMapping("/{id}")
    public Nesl05Dto update(@PathVariable Integer id, @RequestBody Nesl05Dto dto) {
        return nesl05UseCase.update(id, dto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        nesl05UseCase.delete(id);
    }
}
