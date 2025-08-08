package com.sudamericano.bank.infrastructure.controller;

import com.sudamericano.bank.domain.model.StructureL01Dto;
import com.sudamericano.bank.domain.ports.inputs.StructureL01UseCase;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Structure L01", description = "Structure L01 management endpoints")
@RestController
@RequestMapping("/api/structures/l01")
public class StructureL01Controller {
    private final StructureL01UseCase structureL01UseCase;

    public StructureL01Controller(StructureL01UseCase structureL01UseCase) {
        this.structureL01UseCase = structureL01UseCase;
    }

    @GetMapping
    public List<StructureL01Dto> getAll() {
        return structureL01UseCase.findAll();
    }

    @GetMapping("/{id}")
    public StructureL01Dto getById(@PathVariable Integer id) {
        return structureL01UseCase.findById(id);
    }

    @PostMapping
    public StructureL01Dto create(@RequestBody StructureL01Dto dto) {
        return structureL01UseCase.create(dto);
    }

    @PutMapping("/{id}")
    public StructureL01Dto update(@PathVariable Integer id, @RequestBody StructureL01Dto dto) {
        return structureL01UseCase.update(id, dto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        structureL01UseCase.delete(id);
    }
}
