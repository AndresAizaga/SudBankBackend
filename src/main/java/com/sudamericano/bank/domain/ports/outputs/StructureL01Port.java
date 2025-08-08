package com.sudamericano.bank.domain.ports.outputs;

import com.sudamericano.bank.domain.model.StructureL01Dto;

import java.util.List;

public interface StructureL01Port {
    List<StructureL01Dto> findAll();
    StructureL01Dto findById(Integer id);
    StructureL01Dto create(StructureL01Dto dto);
    StructureL01Dto update(Integer id, StructureL01Dto dto);
    void delete(Integer id);
}
