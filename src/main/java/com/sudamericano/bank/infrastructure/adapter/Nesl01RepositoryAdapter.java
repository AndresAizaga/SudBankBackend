package com.sudamericano.bank.infrastructure.adapter;

import com.sudamericano.bank.domain.model.Nesl01Dto;
import com.sudamericano.bank.domain.ports.outputs.Nesl01Port;
import com.sudamericano.bank.infrastructure.persistence.entity.Nesl01Entity;
import com.sudamericano.bank.infrastructure.mapper.Nesl01Mapper;
import com.sudamericano.bank.infrastructure.persistence.jpa.Nesl01Repository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class Nesl01RepositoryAdapter implements Nesl01Port {

    private final Nesl01Repository repository;
    private final Nesl01Mapper mapper;

    public Nesl01RepositoryAdapter(Nesl01Repository repository, Nesl01Mapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public List<Nesl01Dto> findAll() {
        return mapper.toDtoList(repository.findAll());
    }

    @Override
    public Nesl01Dto findById(Integer id) {
        Optional<Nesl01Entity> entity = repository.findById(id);
        return entity.map(mapper::toDto).orElse(null);
    }

    @Override
    public Nesl01Dto create(Nesl01Dto dto) {
        Nesl01Entity saved = repository.save(mapper.toEntity(dto));
        return mapper.toDto(saved);
    }

    @Override
    public Nesl01Dto update(Integer id, Nesl01Dto dto) {
        if (!repository.existsById(id)) {
            return null;
        }
        Nesl01Entity entity = mapper.toEntity(dto);
        entity.setId(id);
        return mapper.toDto(repository.save(entity));
    }

    @Override
    public void delete(Integer id) {
        repository.deleteById(id);
    }
}
