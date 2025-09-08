package com.sudamericano.bank.infrastructure.controller.structure.R;


import com.sudamericano.bank.domain.model.structure.R.R02Dto;
import com.sudamericano.bank.domain.ports.inputs.structure.R.R02UseCase;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Structure R02", description = "Structure R02 management endpoints")
@RestController
@RequestMapping("/api/structures/R02")
public class R02Controller {
    private final R02UseCase r02useCase;

    public R02Controller(R02UseCase useCase) {
        this.r02useCase = useCase;
    }

    @GetMapping
    public List<R02Dto> getAll() {
        return r02useCase.findAll();
    }

    @GetMapping("/{id}")
    public R02Dto getById(Long id) {
        return r02useCase.findById(id);
    }

    @PostMapping
    public R02Dto create(@RequestBody R02Dto dto) {
        return r02useCase.create(dto);
    }

    @PutMapping("/{id}")
    public R02Dto update(Long id, R02Dto dto) {
        return r02useCase.update(id, dto);
    }

    @DeleteMapping("/{id}")
    public void delete(Long id) {
        r02useCase.delete(id);
    }
}
