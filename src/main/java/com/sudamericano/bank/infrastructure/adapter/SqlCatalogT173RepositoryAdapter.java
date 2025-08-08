package com.sudamericano.bank.infrastructure.adapter;

import com.sudamericano.bank.domain.model.CatalogT173;
import com.sudamericano.bank.domain.ports.outputs.CatalogT173RepositoryPort;
import com.sudamericano.bank.infrastructure.persistence.jpa.SpringDataCatalogT173Repository;
import com.sudamericano.bank.infrastructure.mapper.PersistenceCatalogT173Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SqlCatalogT173RepositoryAdapter implements CatalogT173RepositoryPort {

    private final SpringDataCatalogT173Repository springDataCatalogT173Repository;
    private final PersistenceCatalogT173Mapper mapper;

    public SqlCatalogT173RepositoryAdapter(
            SpringDataCatalogT173Repository springDataCatalogT173Repository,
            PersistenceCatalogT173Mapper mapper) {
        this.springDataCatalogT173Repository = springDataCatalogT173Repository;
        this.mapper = mapper;
    }

    @Override
    public List<CatalogT173> findAll() {
        return springDataCatalogT173Repository.findAll()
                .stream()
                .map(mapper::toDomain)
                .toList();
    }
}
