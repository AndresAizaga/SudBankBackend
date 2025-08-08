package com.sudamericano.bank.infrastructure.mapper;

import com.sudamericano.bank.domain.model.Nesl01Dto;
import com.sudamericano.bank.infrastructure.persistence.entity.Nesl01Entity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface Nesl01Mapper {
    Nesl01Dto toDto(Nesl01Entity entity);
    Nesl01Entity toEntity(Nesl01Dto dto);
    List<Nesl01Dto> toDtoList(List<Nesl01Entity> entities);
}
