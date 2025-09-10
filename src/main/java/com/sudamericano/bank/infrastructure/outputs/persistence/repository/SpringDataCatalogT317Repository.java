package com.sudamericano.bank.infrastructure.outputs.persistence.repository;

import com.sudamericano.bank.infrastructure.outputs.persistence.entity.CatalogT317Entity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpringDataCatalogT317Repository extends JpaRepository<CatalogT317Entity, Long> {
}
