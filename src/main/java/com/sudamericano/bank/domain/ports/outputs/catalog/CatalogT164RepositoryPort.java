package com.sudamericano.bank.domain.ports.outputs.catalog;

import com.sudamericano.bank.domain.model.catalog.CatalogT164;

import java.util.List;

public interface CatalogT164RepositoryPort {
    List<CatalogT164> findAll();
}
