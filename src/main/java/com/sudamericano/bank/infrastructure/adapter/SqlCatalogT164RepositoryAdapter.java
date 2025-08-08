package com.sudamericano.bank.infrastructure.adapter;

import com.sudamericano.bank.domain.model.CatalogT164;
import com.sudamericano.bank.domain.ports.outputs.CatalogT164RepositoryPort;
import com.sudamericano.bank.infrastructure.persistence.jpa.SpringDataCatalogT164Repository;
import com.sudamericano.bank.infrastructure.mapper.PersistenceCatalogT164Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SqlCatalogT164RepositoryAdapter implements CatalogT164RepositoryPort {

    private final SpringDataCatalogT164Repository springDataCatalogT164Repository;
    private final PersistenceCatalogT164Mapper mapper;

    public SqlCatalogT164RepositoryAdapter(
            SpringDataCatalogT164Repository springDataCatalogT164Repository,
            PersistenceCatalogT164Mapper mapper) {
        this.springDataCatalogT164Repository = springDataCatalogT164Repository;
        this.mapper = mapper;
    }

    @Override
    public List<CatalogT164> findAll() {
        return springDataCatalogT164Repository.findAll()
                .stream()
                .map(mapper::toDomain)
                .toList();
    }
}
