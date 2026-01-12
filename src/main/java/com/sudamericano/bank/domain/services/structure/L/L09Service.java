package com.sudamericano.bank.domain.services.structure.L;

import com.sudamericano.bank.domain.model.structure.L.L09Dto;
import com.sudamericano.bank.domain.ports.inputs.structure.L.L09UseCase;
import com.sudamericano.bank.domain.ports.outputs.structure.L.L09Port;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class L09Service implements L09UseCase {

    private final L09Port port;

    public L09Service(L09Port port) {
        this.port = port;
    }

    public List<L09Dto> findAll() {
        return port.findAll();
    }

    public L09Dto findById(Integer id) {
        return port.findById(id);
    }

    public L09Dto create(L09Dto dto) {
        return port.create(dto);
    }

    public L09Dto update(Integer id, L09Dto dto) {
        return port.update(id, dto);
    }

    public void delete(Integer id) {
        port.delete(id);
    }
}
