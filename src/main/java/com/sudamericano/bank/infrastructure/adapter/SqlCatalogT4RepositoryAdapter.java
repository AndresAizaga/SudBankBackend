package com.sudamericano.bank.infrastructure.adapter;

import com.sudamericano.bank.domain.model.CatalogT4;
import com.sudamericano.bank.domain.ports.outputs.CatalogT4RepositoryPort;
import com.sudamericano.bank.infrastructure.persistence.jpa.SpringDataCatalogT4Repository;
import com.sudamericano.bank.infrastructure.mapper.PersistenceCatalogT4Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SqlCatalogT4RepositoryAdapter implements CatalogT4RepositoryPort {

    private final SpringDataCatalogT4Repository springDataCatalogT4Repository;
    private final PersistenceCatalogT4Mapper mapper;

    public SqlCatalogT4RepositoryAdapter(
            SpringDataCatalogT4Repository springDataCatalogT4Repository,
            PersistenceCatalogT4Mapper mapper) {
        this.springDataCatalogT4Repository = springDataCatalogT4Repository;
        this.mapper = mapper;
    }

    @Override
    public List<CatalogT4> findAll() {
        return springDataCatalogT4Repository.findAll()
                .stream()
                .map(mapper::toDomain)
                .toList();
    }
}
