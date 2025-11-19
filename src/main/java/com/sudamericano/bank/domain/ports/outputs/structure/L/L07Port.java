package com.sudamericano.bank.domain.ports.outputs.structure.L;

import com.sudamericano.bank.domain.model.structure.L.L07Dto;

import java.util.List;

public interface L07Port {
    List<L07Dto> findAll();
    L07Dto findById(Integer id);
    L07Dto create(L07Dto dto);
    L07Dto update(Integer id, L07Dto dto);
    void delete(Integer id);
}
