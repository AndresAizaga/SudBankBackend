package com.sudamericano.bank.domain.services.structure.L;

import com.sudamericano.bank.domain.model.structure.L.StructureL05Dto;
import com.sudamericano.bank.domain.ports.inputs.structure.L.StructureL05UseCase;
import com.sudamericano.bank.domain.ports.outputs.structure.L.StructureL05Port;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StructureL05Service implements StructureL05UseCase {

    private final StructureL05Port port;

    public StructureL05Service(StructureL05Port port) {
        this.port = port;
    }

    public List<StructureL05Dto> findAll() {
        return port.findAll();
    }

    public StructureL05Dto findById(Integer id) {
        return port.findById(id);
    }

    public StructureL05Dto create(StructureL05Dto dto) {
        return port.create(dto);
    }

    public StructureL05Dto update(Integer id, StructureL05Dto dto) {
        return port.update(id, dto);
    }

    public void delete(Integer id) {
        port.delete(id);
    }
}
