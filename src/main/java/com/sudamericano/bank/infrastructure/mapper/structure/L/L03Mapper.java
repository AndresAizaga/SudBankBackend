package com.sudamericano.bank.infrastructure.mapper.structure.L;

import com.sudamericano.bank.domain.model.structure.L.L03Dto;
import com.sudamericano.bank.infrastructure.persistence.entity.structure.L.L03Entity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface L03Mapper {
    L03Dto toDto(L03Entity entity);
    L03Entity toEntity(L03Dto dto);
    List<L03Dto> toDtoList(List<L03Entity> entities);
}
