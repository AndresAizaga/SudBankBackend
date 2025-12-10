package com.sudamericano.bank.domain.ports.outputs.structure.L;

import com.sudamericano.bank.domain.model.structure.L.L09Dto;

import java.util.List;

public interface L09Port {
    List<L09Dto> findAll();
    L09Dto findById(Integer id);
    L09Dto create(L09Dto dto);
    L09Dto update(Integer id, L09Dto dto);
    void delete(Integer id);
}
