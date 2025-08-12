package com.sudamericano.bank.domain.ports.outputs.structure.L;

import com.sudamericano.bank.domain.model.structure.L.StructureL05Dto;

import java.util.List;

public interface StructureL05Port {
    List<StructureL05Dto> findAll();
    StructureL05Dto findById(Integer id);
    StructureL05Dto create(StructureL05Dto dto);
    StructureL05Dto update(Integer id, StructureL05Dto dto);
    void delete(Integer id);
}
