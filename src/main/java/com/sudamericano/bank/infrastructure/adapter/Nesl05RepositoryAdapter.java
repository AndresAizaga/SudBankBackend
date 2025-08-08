package com.sudamericano.bank.infrastructure.adapter;

import com.sudamericano.bank.domain.model.Nesl05Dto;
import com.sudamericano.bank.domain.ports.outputs.Nesl05Port;
import com.sudamericano.bank.infrastructure.persistence.entity.Nesl05Entity;
import com.sudamericano.bank.infrastructure.mapper.Nesl05Mapper;
import com.sudamericano.bank.infrastructure.persistence.jpa.Nesl05Repository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class Nesl05RepositoryAdapter implements Nesl05Port {

    private final Nesl05Repository repository;
    private final Nesl05Mapper mapper;

    public Nesl05RepositoryAdapter(Nesl05Repository repository, Nesl05Mapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public List<Nesl05Dto> findAll() {
        return mapper.toDtoList(repository.findAll());
    }

    @Override
    public Nesl05Dto findById(Integer id) {
        Optional<Nesl05Entity> entity = repository.findById(id);
        return entity.map(mapper::toDto).orElse(null);
    }

    @Override
    public Nesl05Dto create(Nesl05Dto dto) {
        Nesl05Entity saved = repository.save(mapper.toEntity(dto));
        return mapper.toDto(saved);
    }

    @Override
    public Nesl05Dto update(Integer id, Nesl05Dto dto) {
        if (!repository.existsById(id)) {
            return null;
        }
        Nesl05Entity entity = mapper.toEntity(dto);
        entity.setId(id);
        return mapper.toDto(repository.save(entity));
    }

    @Override
    public void delete(Integer id) {
        repository.deleteById(id);
    }
}
