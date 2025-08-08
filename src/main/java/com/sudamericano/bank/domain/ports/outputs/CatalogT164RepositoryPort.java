package com.sudamericano.bank.domain.ports.outputs;

import com.sudamericano.bank.domain.model.CatalogT164;

import java.util.List;

public interface CatalogT164RepositoryPort {
    List<CatalogT164> findAll();
}
