package com.sudamericano.bank.infrastructure.controller.catalog;

import com.sudamericano.bank.domain.model.catalog.T3Dto;
import com.sudamericano.bank.domain.ports.inputs.catalog.T3UseCase;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Tag(name = "Catalog T3", description = "Catalog T3 management endpoints")
@RestController
@RequestMapping("/api/catalogs/t3")
public class T3Controller {

    private final T3UseCase useCase;

    public T3Controller(T3UseCase useCase) {
        this.useCase = useCase;
    }

    @GetMapping
    public List<T3Dto> getAll() {
        return useCase.findAll();
    }

    @GetMapping("/{id}")
    public T3Dto getById(@PathVariable Integer id) {
        return useCase.findById(id);
    }

}
