package com.sudamericano.bank.infrastructure.controller.structure.L;

import com.sudamericano.bank.domain.model.structure.L.L05Dto;
import com.sudamericano.bank.domain.ports.inputs.structure.L.L05UseCase;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Structure L05", description = "Structure L05 management endpoints")
@RestController
@RequestMapping("/api/structures/l05")
public class L05Controller {
    private final L05UseCase useCase;

    public L05Controller(L05UseCase useCase) {
        this.useCase = useCase;
    }

    @GetMapping
    public List<L05Dto> getAll() {
        return useCase.findAll();
    }

    @GetMapping("/{id}")
    public L05Dto getById(@PathVariable Integer id) {
        return useCase.findById(id);
    }

    @PostMapping
    public L05Dto create(@RequestBody L05Dto dto) {
        return useCase.create(dto);
    }

    @PutMapping("/{id}")
    public L05Dto update(@PathVariable Integer id, @RequestBody L05Dto dto) {
        return useCase.update(id, dto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        useCase.delete(id);
    }
}
