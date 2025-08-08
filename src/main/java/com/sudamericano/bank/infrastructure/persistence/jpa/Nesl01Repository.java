package com.sudamericano.bank.infrastructure.persistence.jpa;

import com.sudamericano.bank.infrastructure.persistence.entity.Nesl01Entity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Nesl01Repository extends JpaRepository<Nesl01Entity, Integer> {
}
