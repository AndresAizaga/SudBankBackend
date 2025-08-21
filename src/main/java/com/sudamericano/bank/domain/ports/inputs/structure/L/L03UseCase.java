package com.sudamericano.bank.domain.ports.inputs.structure.L;

import com.sudamericano.bank.domain.model.structure.L.L03Dto;

import java.util.List;

public interface L03UseCase {
    List<L03Dto> findAll();
    L03Dto findById(Long id);
    L03Dto create(L03Dto dto);
    L03Dto update(Long id, L03Dto dto);
    void delete(Long id);
}
