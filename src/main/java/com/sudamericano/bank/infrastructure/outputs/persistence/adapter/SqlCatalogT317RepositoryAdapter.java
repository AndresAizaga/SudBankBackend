package com.sudamericano.bank.infrastructure.outputs.persistence.adapter;

import com.sudamericano.bank.domain.model.catalog.CatalogT317;
import com.sudamericano.bank.domain.ports.outputs.catalog.CatalogT317RepositoryPort;
import com.sudamericano.bank.infrastructure.outputs.persistence.entity.CatalogT317Entity;
import com.sudamericano.bank.infrastructure.outputs.persistence.mapper.PersistenceCatalogT317Mapper;
import com.sudamericano.bank.infrastructure.outputs.persistence.repository.SpringDataCatalogT317Repository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

@Repository
@RequiredArgsConstructor
public class SqlCatalogT317RepositoryAdapter implements CatalogT317RepositoryPort {
    private final SpringDataCatalogT317Repository springDataCatalogT317Repository;
    private final PersistenceCatalogT317Mapper persistenceCatalogT317Mapper;

    @Override
    public List<CatalogT317> getAllT317() {
        List<CatalogT317Entity> entities = springDataCatalogT317Repository.findAll();
        return entities.stream()
                .map(persistenceCatalogT317Mapper::toDomain)
                .collect(Collectors.toList());
    }
}
