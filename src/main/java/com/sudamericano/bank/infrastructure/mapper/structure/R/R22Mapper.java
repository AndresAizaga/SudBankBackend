package com.sudamericano.bank.infrastructure.mapper.structure.R;

import com.sudamericano.bank.domain.model.structure.R.R22Dto;
import com.sudamericano.bank.infrastructure.persistence.entity.structure.R.R22Entity;
import org.mapstruct.Mapper;

import java.util.List;
@Mapper(componentModel = "spring")
public interface R22Mapper {
    R22Dto toDto(R22Entity entity);
    R22Entity toEntity(R22Dto dto);
    List<R22Dto> toDtoList(List<R22Entity> entities);
}
