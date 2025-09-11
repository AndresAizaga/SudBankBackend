package com.sudamericano.bank.domain.ports.inputs.structure.R;

import com.sudamericano.bank.domain.model.structure.R.R04Dto;
import com.sudamericano.bank.infrastructure.outputs.structure.R04ResumeResponse;

import java.util.List;

public interface R04UseCase {
    List<R04Dto> findAll();
    List<R04ResumeResponse> getResume();
    R04Dto findById(Long id);
    R04Dto create(R04Dto dto);
    R04Dto update(Long id, R04Dto dto);
    void delete(Long id);
}