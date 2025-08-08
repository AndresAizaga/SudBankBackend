package com.sudamericano.bank.infrastructure.persistence.jpa;

import com.sudamericano.bank.domain.model.CatalogT73;
import com.sudamericano.bank.infrastructure.persistence.entity.CatalogT4Entity;
import com.sudamericano.bank.infrastructure.persistence.entity.CatalogT73Entity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringDataCatalogT73Repository extends JpaRepository<CatalogT73Entity, Integer> {

}
