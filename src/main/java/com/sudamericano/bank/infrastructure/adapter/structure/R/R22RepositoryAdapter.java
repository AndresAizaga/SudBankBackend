package com.sudamericano.bank.infrastructure.adapter.structure.R;

import com.sudamericano.bank.domain.model.structure.R.R22Dto;
import com.sudamericano.bank.domain.ports.outputs.structure.R.R22Port;
import com.sudamericano.bank.infrastructure.mapper.structure.R.R22Mapper;
import com.sudamericano.bank.infrastructure.persistence.entity.structure.R.R22Entity;
import com.sudamericano.bank.infrastructure.persistence.jpa.structure.R.R22Repository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class R22RepositoryAdapter implements R22Port {
    private final R22Repository repository;
    private final R22Mapper mapper;

    public R22RepositoryAdapter(R22Repository repository, R22Mapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public List<R22Dto> findAll() {
        return mapper.toDtoList(repository.findAll());
    }

    @Override
    public R22Dto findById(Long id) {
        Optional<R22Entity> entity = repository.findById(id);
        return entity.map(mapper::toDto).orElse(null);
    }

    @Override
    public R22Dto create(R22Dto dto) {
        R22Entity saved = repository.save(mapper.toEntity(dto));
        return mapper.toDto(saved);
    }

    @Override
    public R22Dto update(Long id, R22Dto dto) {
        if (!repository.existsById(id)) {
            return null;
        }
        R22Entity entity = mapper.toEntity(dto);
        entity.setId(id);
        return mapper.toDto(repository.save(entity));
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
