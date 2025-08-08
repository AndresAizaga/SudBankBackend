package com.sudamericano.bank.infrastructure.mapper;

import com.sudamericano.bank.domain.model.Nesl01Dto;
import com.sudamericano.bank.infrastructure.persistence.entity.StructureL01Entity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PersistenceStructureL01Mapper {
    Nesl01Dto toDto(StructureL01Entity entity);
    StructureL01Entity toEntity(Nesl01Dto dto);
    List<Nesl01Dto> toDtoList(List<StructureL01Entity> entities);
}
