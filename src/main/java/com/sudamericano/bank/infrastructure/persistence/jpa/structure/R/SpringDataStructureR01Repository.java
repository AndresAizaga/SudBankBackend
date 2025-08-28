package com.sudamericano.bank.infrastructure.persistence.jpa.structure.R;

import com.sudamericano.bank.infrastructure.persistence.entity.structure.R.StructureR01Entity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpringDataStructureR01Repository extends JpaRepository<StructureR01Entity, Integer> {
}
