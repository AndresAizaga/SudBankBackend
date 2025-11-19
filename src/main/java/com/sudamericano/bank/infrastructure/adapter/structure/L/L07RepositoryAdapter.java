package com.sudamericano.bank.infrastructure.adapter.structure.L;

import com.sudamericano.bank.domain.model.structure.L.L07Dto;
import com.sudamericano.bank.domain.ports.outputs.structure.L.L07Port;
import com.sudamericano.bank.infrastructure.mapper.structure.L.L07Mapper;
import com.sudamericano.bank.infrastructure.persistence.entity.structure.L.L07Entity;
import com.sudamericano.bank.infrastructure.persistence.jpa.structure.L.L07Repository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
@Component
public class L07RepositoryAdapter implements L07Port {

    private final L07Repository repository;
    private final L07Mapper mapper;

    public L07RepositoryAdapter(L07Repository repository, L07Mapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }


    @Override
    public List<L07Dto> findAll() {
        return mapper.toDtoList(repository.findAll());
    }

    @Override
    public L07Dto findById(Integer id) {
        Optional<L07Entity> entity = repository.findById(id);
        return entity.map(mapper::toDto).orElse(null);
    }

    @Override
    public L07Dto create(L07Dto dto) {
        L07Entity saved = repository.save(mapper.toEntity(dto));
        return mapper.toDto(saved);
    }

    @Override
    public L07Dto update(Integer id, L07Dto dto) {
        if (!repository.existsById(id)) {
            return null;
        }
        L07Entity entity = mapper.toEntity(dto);
        entity.setId(id);
        return mapper.toDto(repository.save(entity));
    }

    @Override
    public void delete(Integer id) {
        repository.deleteById(id);
    }
}
