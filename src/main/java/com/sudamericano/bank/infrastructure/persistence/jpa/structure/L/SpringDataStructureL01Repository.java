package com.sudamericano.bank.infrastructure.persistence.jpa.structure.L;

import com.sudamericano.bank.infrastructure.persistence.entity.structure.L.StructureL01Entity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpringDataStructureL01Repository extends JpaRepository<StructureL01Entity, Integer> {
}
