package com.sudamericano.bank.infrastructure.persistence.jpa;

import com.sudamericano.bank.infrastructure.persistence.entity.CatalogT4Entity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringDataCatalogT4Repository extends JpaRepository<CatalogT4Entity, Integer> {

}
