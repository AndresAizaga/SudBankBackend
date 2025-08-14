package com.sudamericano.bank.infrastructure.mapper.structure.L;

import com.sudamericano.bank.domain.model.structure.L.StructureL01Dto;
import com.sudamericano.bank.infrastructure.persistence.entity.structure.L.StructureL01Entity;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-08-14T10:29:31-0500",
    comments = "version: 1.6.0.Beta1, compiler: javac, environment: Java 17.0.15 (Eclipse Adoptium)"
)
@Component
public class PersistenceStructureL01MapperImpl implements PersistenceStructureL01Mapper {

    @Override
    public StructureL01Dto toDto(StructureL01Entity entity) {
        if ( entity == null ) {
            return null;
        }

        StructureL01Dto structureL01Dto = new StructureL01Dto();

        structureL01Dto.setId( entity.getId() );
        structureL01Dto.setCodigoTipoIdentificacion( entity.getCodigoTipoIdentificacion() );
        structureL01Dto.setCodigoEmisor( entity.getCodigoEmisor() );
        structureL01Dto.setCodigoClasificacionEmisor( entity.getCodigoClasificacionEmisor() );
        structureL01Dto.setCodigoTipoEmisor( entity.getCodigoTipoEmisor() );

        return structureL01Dto;
    }

    @Override
    public StructureL01Entity toEntity(StructureL01Dto dto) {
        if ( dto == null ) {
            return null;
        }

        StructureL01Entity structureL01Entity = new StructureL01Entity();

        structureL01Entity.setId( dto.getId() );
        structureL01Entity.setCodigoTipoIdentificacion( dto.getCodigoTipoIdentificacion() );
        structureL01Entity.setCodigoEmisor( dto.getCodigoEmisor() );
        structureL01Entity.setCodigoClasificacionEmisor( dto.getCodigoClasificacionEmisor() );
        structureL01Entity.setCodigoTipoEmisor( dto.getCodigoTipoEmisor() );

        return structureL01Entity;
    }

    @Override
    public List<StructureL01Dto> toDtoList(List<StructureL01Entity> entities) {
        if ( entities == null ) {
            return null;
        }

        List<StructureL01Dto> list = new ArrayList<StructureL01Dto>( entities.size() );
        for ( StructureL01Entity structureL01Entity : entities ) {
            list.add( toDto( structureL01Entity ) );
        }

        return list;
    }
}
