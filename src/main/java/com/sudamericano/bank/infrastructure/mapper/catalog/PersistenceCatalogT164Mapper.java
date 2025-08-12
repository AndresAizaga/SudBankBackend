package com.sudamericano.bank.infrastructure.mapper.catalog;

import com.sudamericano.bank.domain.model.catalog.CatalogT164;
import com.sudamericano.bank.infrastructure.persistence.entity.catalog.CatalogT164Entity;
import org.springframework.stereotype.Component;

@Component
public class PersistenceCatalogT164Mapper {
    public CatalogT164Entity toEntity(CatalogT164 catalog){
        return CatalogT164Entity.builder()
                .id(catalog.getId())
                .codigo(catalog.getCodigo())
                .descripcion(catalog.getDescripcion())
                .build();
    }

    public CatalogT164 toDomain(CatalogT164Entity catalogEntity){
        return new CatalogT164(
                catalogEntity.getId(),
                catalogEntity.getCodigo(),
                catalogEntity.getDescripcion()
        );
    }
}
