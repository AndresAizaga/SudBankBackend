package com.sudamericano.bank.domain.ports.inputs;

import com.sudamericano.bank.domain.model.Nesl01Dto;

import java.util.List;

public interface Nesl01UseCase {
    List<Nesl01Dto> findAll();
    Nesl01Dto findById(Integer id);
    Nesl01Dto create(Nesl01Dto dto);
    Nesl01Dto update(Integer id, Nesl01Dto dto);
    void delete(Integer id);
}
