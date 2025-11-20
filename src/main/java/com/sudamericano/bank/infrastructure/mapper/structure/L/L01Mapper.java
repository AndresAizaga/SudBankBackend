package com.sudamericano.bank.infrastructure.mapper.structure.L;

import com.sudamericano.bank.domain.model.structure.L.StructureL01Dto;
import com.sudamericano.bank.infrastructure.persistence.entity.structure.L.L01Entity;
import org.mapstruct.*;

import java.util.List;

@Mapper(componentModel = "spring")
public interface L01Mapper
{
    StructureL01Dto toDto(L01Entity entity);
    List<StructureL01Dto> toDtoList(List<L01Entity> entities);
    @Mapping(target = "fechaCorte", ignore = true)
    L01Entity toEntity(StructureL01Dto dto);

}
