package com.sudamericano.bank.infrastructure.persistence.jpa;

import com.sudamericano.bank.infrastructure.persistence.entity.Nesl05Entity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Nesl05Repository extends JpaRepository<Nesl05Entity, Integer> {
}
