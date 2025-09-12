package com.sudamericano.bank.infrastructure.mapper.catalog;

import com.sudamericano.bank.domain.model.catalog.T3Dto;
import com.sudamericano.bank.infrastructure.persistence.entity.catalog.T3Entity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface T3Mapper {
    T3Dto toDto(T3Entity entity);
    T3Entity toEntity(T3Dto dto);
    List<T3Dto> toDtoList(List<T3Entity> entities);
}
