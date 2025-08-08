package com.sudamericano.bank.domain.ports.outputs;

import com.sudamericano.bank.domain.model.CatalogT173;

import java.util.List;

public interface CatalogT173RepositoryPort {
    List<CatalogT173> findAll();
}
