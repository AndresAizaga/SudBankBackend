package com.sudamericano.bank.domain.services.structure.L;

import com.sudamericano.bank.domain.model.structure.L.StructureL01Dto;
import com.sudamericano.bank.domain.ports.inputs.structure.L.StructureL01UseCase;
import com.sudamericano.bank.domain.ports.outputs.structure.L.StructureL01Port;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StructureL01Service implements StructureL01UseCase {

    private final StructureL01Port port;

    public StructureL01Service(StructureL01Port port) {
        this.port = port;
    }

    public List<StructureL01Dto> findAll() {
        return port.findAll();
    }

    public List<StructureL01Dto> findByFilter(StructureL01Dto dto) {
        return port.findByFilter(dto);
    }

    public StructureL01Dto findById(Integer id) {
        return port.findById(id);
    }

    public StructureL01Dto create(StructureL01Dto dto) {
        return port.create(dto);
    }

    public StructureL01Dto update(Integer id, StructureL01Dto dto) {
        return port.update(id, dto);
    }

    public void delete(Integer id) {
        port.delete(id);
    }
}
