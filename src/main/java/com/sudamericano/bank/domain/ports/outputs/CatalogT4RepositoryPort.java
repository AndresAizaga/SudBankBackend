package com.sudamericano.bank.domain.ports.outputs;

import com.sudamericano.bank.domain.model.CatalogT4;

import java.util.List;

public interface CatalogT4RepositoryPort {
    List<CatalogT4> findAll();
}
