package com.sudamericano.bank.domain.ports.outputs;

import com.sudamericano.bank.domain.model.CatalogT73;

import java.util.List;

public interface CatalogT73RepositoryPort {
    List<CatalogT73> findAll();
}
