package com.sudamericano.bank.infrastructure.outputs.persistence.mapper;

import com.sudamericano.bank.domain.model.catalog.CatalogT317;
import com.sudamericano.bank.infrastructure.outputs.persistence.entity.CatalogT317Entity;
import org.springframework.stereotype.Component;

@Component
public class PersistenceCatalogT317Mapper {
    public CatalogT317 toDomain(CatalogT317Entity entity) {
        return new CatalogT317(
            entity.getId(),
            entity.getCodigo(),
            entity.getDescripcion()
        );
    }
}
