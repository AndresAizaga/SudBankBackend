package com.sudamericano.bank.infrastructure.controller.catalog;

import com.sudamericano.bank.domain.model.catalog.CatalogT317;
import com.sudamericano.bank.domain.ports.inputs.catalog.CatalogT317UseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/catalogs")
@RequiredArgsConstructor
public class CatalogT317Controller {
    private final CatalogT317UseCase catalogT317UseCase;

    @GetMapping("/t317")
    public ResponseEntity<List<CatalogT317>> getAllT317() {
        List<CatalogT317> catalogs = catalogT317UseCase.getAllT317();
        return ResponseEntity.ok(catalogs);
    }
}
