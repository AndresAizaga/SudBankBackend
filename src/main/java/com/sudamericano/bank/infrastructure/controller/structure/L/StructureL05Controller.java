package com.sudamericano.bank.infrastructure.controller.structure.L;

import com.sudamericano.bank.domain.model.structure.L.StructureL05Dto;
import com.sudamericano.bank.domain.ports.inputs.structure.L.StructureL05UseCase;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Structure L05", description = "Structure L05 management endpoints")
@RestController
@RequestMapping("/api/structures/l05")
public class StructureL05Controller {
    private final StructureL05UseCase structureL05UseCase;

    public StructureL05Controller(StructureL05UseCase structureL05UseCase) {
        this.structureL05UseCase = structureL05UseCase;
    }

    @GetMapping
    public List<StructureL05Dto> getAll() {
        return structureL05UseCase.findAll();
    }

    @GetMapping("/{id}")
    public StructureL05Dto getById(@PathVariable Integer id) {
        return structureL05UseCase.findById(id);
    }

    @PostMapping
    public StructureL05Dto create(@RequestBody StructureL05Dto dto) {
        return structureL05UseCase.create(dto);
    }

    @PutMapping("/{id}")
    public StructureL05Dto update(@PathVariable Integer id, @RequestBody StructureL05Dto dto) {
        return structureL05UseCase.update(id, dto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        structureL05UseCase.delete(id);
    }
}
