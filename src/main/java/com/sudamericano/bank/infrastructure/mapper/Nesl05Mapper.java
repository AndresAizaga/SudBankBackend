package com.sudamericano.bank.infrastructure.mapper;

import com.sudamericano.bank.domain.model.Nesl05Dto;
import com.sudamericano.bank.infrastructure.persistence.entity.Nesl05Entity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface Nesl05Mapper {
    Nesl05Dto toDto(Nesl05Entity entity);
    Nesl05Entity toEntity(Nesl05Dto dto);
    List<Nesl05Dto> toDtoList(List<Nesl05Entity> entities);
}
