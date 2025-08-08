package com.sudamericano.bank.domain.services;

import com.sudamericano.bank.domain.model.Nesl05Dto;
import com.sudamericano.bank.domain.ports.inputs.Nesl05UseCase;
import com.sudamericano.bank.domain.ports.outputs.Nesl05Port;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Nesl05Service implements Nesl05UseCase {

    private final Nesl05Port port;

    public Nesl05Service(Nesl05Port port) {
        this.port = port;
    }

    public List<Nesl05Dto> findAll() {
        return port.findAll();
    }

    public Nesl05Dto findById(Integer id) {
        return port.findById(id);
    }

    public Nesl05Dto create(Nesl05Dto dto) {
        return port.create(dto);
    }

    public Nesl05Dto update(Integer id, Nesl05Dto dto) {
        return port.update(id, dto);
    }

    public void delete(Integer id) {
        port.delete(id);
    }
}
