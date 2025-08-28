package com.sudamericano.bank.infrastructure.mapper.structure.R;

import com.sudamericano.bank.domain.model.structure.R.StructureR01Dto;
import com.sudamericano.bank.infrastructure.persistence.entity.structure.R.StructureR01Entity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PersistenceStructureR01Mapper {
    StructureR01Dto toDto(StructureR01Entity entity);
    StructureR01Entity toEntity(StructureR01Dto dto);
    List<StructureR01Dto> toDtoList(List<StructureR01Entity> entities);
}
