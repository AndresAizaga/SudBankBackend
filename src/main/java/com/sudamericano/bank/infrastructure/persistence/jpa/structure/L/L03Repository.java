package com.sudamericano.bank.infrastructure.persistence.jpa.structure.L;

import com.sudamericano.bank.infrastructure.persistence.entity.structure.L.L03Entity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface L03Repository extends JpaRepository<L03Entity, Long> {
}
