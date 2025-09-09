package com.sudamericano.bank.infrastructure.controller.structure.R;

import com.sudamericano.bank.domain.model.structure.R.R04Dto;
import com.sudamericano.bank.domain.ports.inputs.structure.R.R04UseCase;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;


@Tag(name = "Structure R04", description = "Structure R04 management endpoints")
@RestController
@RequestMapping("/api/structures/R04")
public class R04Controller {
    private final R04UseCase r04UseCase;

    public R04Controller(R04UseCase r04UseCase) {
        this.r04UseCase = r04UseCase;
    }

    @GetMapping
    public List<R04Dto> findAll() {
        return r04UseCase.findAll();
    }

    @GetMapping("/{id}")
    public R04Dto findById(@PathVariable Long id) {
        return r04UseCase.findById(id);
    }

    @PostMapping
    public R04Dto create(@RequestBody R04Dto r04Dto) {
        return r04UseCase.create(r04Dto);
    }

    @PutMapping("/{id}")
    public R04Dto update(@PathVariable Long id, @RequestBody R04Dto r04Dto) {
        return r04UseCase.update(id, r04Dto);
    }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        r04UseCase.delete(id);
    }
}   