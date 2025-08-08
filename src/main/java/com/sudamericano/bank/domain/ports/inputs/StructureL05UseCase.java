package com.sudamericano.bank.domain.ports.inputs;

import com.sudamericano.bank.domain.model.StructureL05Dto;

import java.util.List;

public interface StructureL05UseCase {
    List<StructureL05Dto> findAll();
    StructureL05Dto findById(Integer id);
    StructureL05Dto create(StructureL05Dto dto);
    StructureL05Dto update(Integer id, StructureL05Dto dto);
    void delete(Integer id);
}
