package com.sudamericano.bank.domain.services.structure.R;

import com.sudamericano.bank.domain.model.structure.R.R22Dto;
import com.sudamericano.bank.domain.ports.inputs.structure.R.R22UseCase;
import com.sudamericano.bank.domain.ports.outputs.structure.R.R22Port;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class R22Service implements R22UseCase {
    private final R22Port port;

    public R22Service(R22Port port) {
        this.port = port;
    }

    public List<R22Dto> findAll() {
        return port.findAll();
    }

    public R22Dto findById(Long id) {
        return port.findById(id);
    }

    public R22Dto create(R22Dto dto) {
        return port.create(dto);
    }

    public R22Dto update(Long id, R22Dto dto) {
        return port.update(id, dto);
    }

    public void delete(Long id) {
        port.delete(id);
    }
}
