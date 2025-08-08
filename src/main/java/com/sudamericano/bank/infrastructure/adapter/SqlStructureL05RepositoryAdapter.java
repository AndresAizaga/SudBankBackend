package com.sudamericano.bank.infrastructure.adapter;

import com.sudamericano.bank.domain.model.StructureL05Dto;
import com.sudamericano.bank.domain.ports.outputs.StructureL05Port;
import com.sudamericano.bank.infrastructure.mapper.PersistenceStructureL05Mapper;
import com.sudamericano.bank.infrastructure.persistence.entity.StructureL05Entity;
import com.sudamericano.bank.infrastructure.persistence.jpa.SpringDataStructureL05Repository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class SqlStructureL05RepositoryAdapter implements StructureL05Port {

    private final SpringDataStructureL05Repository repository;
    private final PersistenceStructureL05Mapper mapper;

    public SqlStructureL05RepositoryAdapter(SpringDataStructureL05Repository repository, PersistenceStructureL05Mapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public List<StructureL05Dto> findAll() {
        return mapper.toDtoList(repository.findAll());
    }

    @Override
    public StructureL05Dto findById(Integer id) {
        Optional<StructureL05Entity> entity = repository.findById(id);
        return entity.map(mapper::toDto).orElse(null);
    }

    @Override
    public StructureL05Dto create(StructureL05Dto dto) {
        StructureL05Entity saved = repository.save(mapper.toEntity(dto));
        return mapper.toDto(saved);
    }

    @Override
    public StructureL05Dto update(Integer id, StructureL05Dto dto) {
        if (!repository.existsById(id)) {
            return null;
        }
        StructureL05Entity entity = mapper.toEntity(dto);
        entity.setId(id);
        return mapper.toDto(repository.save(entity));
    }

    @Override
    public void delete(Integer id) {
        repository.deleteById(id);
    }
}
