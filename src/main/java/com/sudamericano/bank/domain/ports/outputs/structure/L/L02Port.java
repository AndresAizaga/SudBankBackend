package com.sudamericano.bank.domain.ports.outputs.structure.L;

import com.sudamericano.bank.domain.model.structure.L.L02Dto;
import com.sudamericano.bank.domain.model.structure.L.StructureL01Dto;

import java.time.LocalDate;
import java.util.List;

public interface L02Port {
    List<L02Dto> findAll();
    L02Dto findById(Long id);
    L02Dto create(L02Dto dto);
    L02Dto update(Long id, L02Dto dto);
    void delete(Long id);
    List<L02Dto> findByFechaEmisionBetween(LocalDate from, LocalDate to);

}
