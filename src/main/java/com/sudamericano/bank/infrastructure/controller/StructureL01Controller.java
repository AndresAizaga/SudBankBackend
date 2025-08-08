package com.sudamericano.bank.infrastructure.controller;

import com.sudamericano.bank.domain.ports.inputs.Nesl01UseCase;
import com.sudamericano.bank.domain.model.Nesl01Dto;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Structure L01", description = "Structure L01 management endpoints")
@RestController
@RequestMapping("/api/structures/l01")
public class StructureL01Controller {
    private final Nesl01UseCase nesl01UseCase;

    public StructureL01Controller(Nesl01UseCase nesl01UseCase) {
        this.nesl01UseCase = nesl01UseCase;
    }

    @GetMapping
    public List<Nesl01Dto> getAll() {
        return nesl01UseCase.findAll();
    }

    @GetMapping("/{id}")
    public Nesl01Dto getById(@PathVariable Integer id) {
        return nesl01UseCase.findById(id);
    }

    @PostMapping
    public Nesl01Dto create(@RequestBody Nesl01Dto dto) {
        return nesl01UseCase.create(dto);
    }

    @PutMapping("/{id}")
    public Nesl01Dto update(@PathVariable Integer id, @RequestBody Nesl01Dto dto) {
        return nesl01UseCase.update(id, dto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        nesl01UseCase.delete(id);
    }
}
