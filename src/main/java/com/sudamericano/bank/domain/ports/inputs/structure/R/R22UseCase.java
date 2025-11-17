package com.sudamericano.bank.domain.ports.inputs.structure.R;

import com.sudamericano.bank.domain.model.structure.R.R22Dto;

import java.util.List;

public interface R22UseCase {
    List<R22Dto> findAll();
    R22Dto findById(Long id);
    R22Dto create(R22Dto dto);
    R22Dto update(Long id, R22Dto dto);
    void delete(Long id);
}
