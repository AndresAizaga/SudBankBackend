package com.sudamericano.bank.infrastructure.persistence.jpa;

import com.sudamericano.bank.infrastructure.persistence.entity.StructureL05Entity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpringDataStructureL05Repository extends JpaRepository<StructureL05Entity, Integer> {
}
