package com.sudamericano.bank.domain.ports.inputs;

import com.sudamericano.bank.domain.model.Nesl05Dto;

import java.util.List;

public interface Nesl05UseCase {
    List<Nesl05Dto> findAll();
    Nesl05Dto findById(Integer id);
    Nesl05Dto create(Nesl05Dto dto);
    Nesl05Dto update(Integer id, Nesl05Dto dto);
    void delete(Integer id);
}
