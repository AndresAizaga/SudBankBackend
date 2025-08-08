package com.sudamericano.bank.domain.services;

import com.sudamericano.bank.domain.model.Nesl01Dto;
import com.sudamericano.bank.domain.ports.inputs.Nesl01UseCase;
import com.sudamericano.bank.domain.ports.outputs.Nesl01Port;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Nesl01Service implements Nesl01UseCase {

    private final Nesl01Port port;

    public Nesl01Service(Nesl01Port port) {
        this.port = port;
    }

    public List<Nesl01Dto> findAll() {
        return port.findAll();
    }

    public Nesl01Dto findById(Integer id) {
        return port.findById(id);
    }

    public Nesl01Dto create(Nesl01Dto dto) {
        return port.create(dto);
    }

    public Nesl01Dto update(Integer id, Nesl01Dto dto) {
        return port.update(id, dto);
    }

    public void delete(Integer id) {
        port.delete(id);
    }
}
