package com.sudamericano.bank.domain.services.structure.L;

import com.sudamericano.bank.domain.model.structure.L.StructureL01Dto;
import com.sudamericano.bank.domain.ports.inputs.structure.L.L01UseCase;
import com.sudamericano.bank.domain.ports.outputs.structure.L.L01Port;
import com.sudamericano.bank.infrastructure.mapper.structure.L.L01Mapper;
import com.sudamericano.bank.infrastructure.persistence.entity.structure.L.L01Entity;
import com.sudamericano.bank.infrastructure.persistence.jpa.structure.L.SpringDataStructureL01Repository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class L01Service implements L01UseCase {

    private final L01Port port;
    private final SpringDataStructureL01Repository repository;
    private final L01Mapper mapper;

    public L01Service(L01Port port, SpringDataStructureL01Repository repository, L01Mapper mapper) {
        this.port = port;
        this.repository = repository;
        this.mapper = mapper;
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

/*    public StructureL01Dto create(StructureL01Dto dto) {
        return port.create(dto);
    }*/

    public StructureL01Dto update(Integer id, StructureL01Dto dto) {
        return port.update(id, dto);
    }

    public void delete(Integer id) {
        port.delete(id);
    }

    @Override
    public StructureL01Dto create(StructureL01Dto dto) {
        L01Entity newL01 = mapper.toEntity(dto);
        newL01.setFechaCorte(LocalDate.now());
        L01Entity saved = repository.save(newL01);
        return mapper.toDto(saved);
    }

}
