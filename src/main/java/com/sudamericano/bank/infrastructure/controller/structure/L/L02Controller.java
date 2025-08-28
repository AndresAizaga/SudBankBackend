package com.sudamericano.bank.infrastructure.controller.structure.L;

import com.sudamericano.bank.domain.model.structure.L.L02Dto;
import com.sudamericano.bank.domain.ports.inputs.structure.L.L02UseCase;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Structure L02", description = "Structure L02 management endpoints")
@RestController
@RequestMapping("/api/structures/L02")
public class L02Controller {
    private final L02UseCase useCase;

    public L02Controller(L02UseCase useCase) {
        this.useCase = useCase;
    }

    @GetMapping
    public List<L02Dto> getAll() {
        return useCase.findAll();
    }

    @GetMapping("/{id}")
    public L02Dto getById(@PathVariable Long id) {
        return useCase.findById(id);
    }

    @PostMapping
    public L02Dto create(@RequestBody L02Dto dto) {
        return useCase.create(dto);
    }

    @PutMapping("/{id}")
    public L02Dto update(@PathVariable Long id, @RequestBody L02Dto dto) {
        return useCase.update(id, dto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        useCase.delete(id);
    }
}
