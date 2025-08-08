package com.sudamericano.bank.infrastructure.mapper;

import com.sudamericano.bank.domain.model.StructureL01Dto;
import com.sudamericano.bank.infrastructure.persistence.entity.StructureL01Entity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PersistenceStructureL01Mapper {
    StructureL01Dto toDto(StructureL01Entity entity);
    StructureL01Entity toEntity(StructureL01Dto dto);
    List<StructureL01Dto> toDtoList(List<StructureL01Entity> entities);
}
