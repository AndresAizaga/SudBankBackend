package com.sudamericano.bank.domain.services.structure.L;


import com.sudamericano.bank.domain.model.structure.L.L07Dto;
import com.sudamericano.bank.domain.ports.inputs.structure.L.L07UseCase;
import com.sudamericano.bank.domain.ports.outputs.structure.L.L07Port;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class L07Service implements L07UseCase {

    private final L07Port port;

    public L07Service(L07Port port) {
        this.port = port;
    }

    @Override
    public List<L07Dto> findAll() {
        return port.findAll();
    }

    @Override
    public L07Dto findById(Integer id) {
        return port.findById(id);
    }

    @Override
    public L07Dto create(L07Dto dto) {
        return port.create(dto);
    }

    @Override
    public L07Dto update(Integer id, L07Dto dto) {
        return port.update(id, dto);
    }

    @Override
    public void delete(Integer id) {
        port.delete(id);
    }
}
