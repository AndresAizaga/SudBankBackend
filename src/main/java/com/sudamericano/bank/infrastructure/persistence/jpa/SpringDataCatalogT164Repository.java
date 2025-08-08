package com.sudamericano.bank.infrastructure.persistence.jpa;

import com.sudamericano.bank.infrastructure.persistence.entity.CatalogT164Entity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringDataCatalogT164Repository extends JpaRepository<CatalogT164Entity, Integer> {

}
