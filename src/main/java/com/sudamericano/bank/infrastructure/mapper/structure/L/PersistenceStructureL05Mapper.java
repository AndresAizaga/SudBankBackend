package com.sudamericano.bank.infrastructure.mapper.structure.L;

import com.sudamericano.bank.domain.model.structure.L.StructureL05Dto;
import com.sudamericano.bank.infrastructure.persistence.entity.structure.L.StructureL05Entity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PersistenceStructureL05Mapper {
    StructureL05Dto toDto(StructureL05Entity entity);
    StructureL05Entity toEntity(StructureL05Dto dto);
    List<StructureL05Dto> toDtoList(List<StructureL05Entity> entities);
}
