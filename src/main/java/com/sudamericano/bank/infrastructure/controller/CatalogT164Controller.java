package com.sudamericano.bank.infrastructure.controller;

import com.sudamericano.bank.domain.model.CatalogT164;
import com.sudamericano.bank.domain.ports.inputs.CatalogT164UseCase;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Tag(name = "Catalog T164", description = "Catalog T164 management endpoints")
@RestController
@RequestMapping("/api/catalogs/t164")
public class CatalogT164Controller {
    private final CatalogT164UseCase catalogT164UseCase;

    public CatalogT164Controller(CatalogT164UseCase catalogT164UseCase) {
        this.catalogT164UseCase = catalogT164UseCase;
    }

    @GetMapping
    public ResponseEntity<List<CatalogT164>> getAllCatalogT164() {
        return ResponseEntity.ok().body(catalogT164UseCase.getAllCatalogT164());
    }
}
