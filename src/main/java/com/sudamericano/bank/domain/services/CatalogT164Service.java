package com.sudamericano.bank.domain.services;

import com.sudamericano.bank.domain.model.CatalogT164;
import com.sudamericano.bank.domain.ports.inputs.CatalogT164UseCase;
import com.sudamericano.bank.domain.ports.outputs.CatalogT164RepositoryPort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatalogT164Service implements CatalogT164UseCase {

    private final CatalogT164RepositoryPort catalogT164RepositoryPort;

    public CatalogT164Service(CatalogT164RepositoryPort catalogT164RepositoryPort) {
        this.catalogT164RepositoryPort = catalogT164RepositoryPort;
    }


    @Override
    public List<CatalogT164> getAllCatalogT164() {
        return catalogT164RepositoryPort.findAll();
    }


}
