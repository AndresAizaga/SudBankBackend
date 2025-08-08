package com.sudamericano.bank.infrastructure.mapper;

import com.sudamericano.bank.domain.model.Nesl05Dto;
import com.sudamericano.bank.infrastructure.persistence.entity.StructureL05Entity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PersistenceStructureL05Mapper {
    Nesl05Dto toDto(StructureL05Entity entity);
    StructureL05Entity toEntity(Nesl05Dto dto);
    List<Nesl05Dto> toDtoList(List<StructureL05Entity> entities);
}
