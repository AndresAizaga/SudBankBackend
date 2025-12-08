package com.sudamericano.bank.domain.ports.inputs.structure.L;

import com.sudamericano.bank.domain.model.structure.L.L03ViewDto;
import com.sudamericano.bank.domain.model.structure.L.L06Dto;
import com.sudamericano.bank.domain.model.structure.L.L06ViewDto;

import java.util.List;

public interface L06UseCase {
    List<L06Dto> findAll();
    L06Dto findById(Integer id);
    L06Dto create(L06Dto dto);
    L06Dto update(Integer id, L06Dto dto);
    void delete(Integer id);
    List<L06ViewDto> findAllResumenDatosL06();
}
