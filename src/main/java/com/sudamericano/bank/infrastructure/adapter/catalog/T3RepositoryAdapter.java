package com.sudamericano.bank.infrastructure.adapter.catalog;

import com.sudamericano.bank.domain.model.catalog.T3Dto;
import com.sudamericano.bank.domain.ports.outputs.catalog.T3Port;
import com.sudamericano.bank.infrastructure.mapper.catalog.T3Mapper;
import com.sudamericano.bank.infrastructure.persistence.entity.catalog.T3Entity;
import com.sudamericano.bank.infrastructure.persistence.jpa.catalog.T3Rpository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class T3RepositoryAdapter implements T3Port {
    private final T3Rpository repository;
    private final T3Mapper mapper;

    public T3RepositoryAdapter(T3Rpository repository, T3Mapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public List<T3Dto> findAll() {
        return mapper.toDtoList(repository.findAll());
    }

    @Override
    public T3Dto findById(Integer id) {
        Optional<T3Entity> entity = repository.findById(id);
        return entity.map(mapper::toDto).orElse(null);
    }

}
