package com.sudamericano.bank.infrastructure.mapper.structure.L;

import com.sudamericano.bank.domain.model.structure.L.StructureL05Dto;
import com.sudamericano.bank.infrastructure.persistence.entity.structure.L.StructureL05Entity;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-08-14T10:29:32-0500",
    comments = "version: 1.6.0.Beta1, compiler: javac, environment: Java 17.0.15 (Eclipse Adoptium)"
)
@Component
public class PersistenceStructureL05MapperImpl implements PersistenceStructureL05Mapper {

    @Override
    public StructureL05Dto toDto(StructureL05Entity entity) {
        if ( entity == null ) {
            return null;
        }

        StructureL05Dto structureL05Dto = new StructureL05Dto();

        structureL05Dto.setId( entity.getId() );
        structureL05Dto.setCodigoTipoIdentificacion( entity.getCodigoTipoIdentificacion() );
        structureL05Dto.setCodigoDepositario( entity.getCodigoDepositario() );
        structureL05Dto.setCodigoTipoDeposito( entity.getCodigoTipoDeposito() );
        structureL05Dto.setNumeroIdentificacionDeposito( entity.getNumeroIdentificacionDeposito() );
        structureL05Dto.setCuentaContable( entity.getCuentaContable() );
        structureL05Dto.setCodigoMoneda( entity.getCodigoMoneda() );
        structureL05Dto.setValorMonedaDenominacion( entity.getValorMonedaDenominacion() );
        structureL05Dto.setValorLibrosDolares( entity.getValorLibrosDolares() );
        structureL05Dto.setCodigoCalificacionRiesgoDepositario( entity.getCodigoCalificacionRiesgoDepositario() );
        structureL05Dto.setCodigoCalificacionRiesgo( entity.getCodigoCalificacionRiesgo() );
        structureL05Dto.setFechaUltimaCalificacion( entity.getFechaUltimaCalificacion() );

        return structureL05Dto;
    }

    @Override
    public StructureL05Entity toEntity(StructureL05Dto dto) {
        if ( dto == null ) {
            return null;
        }

        StructureL05Entity structureL05Entity = new StructureL05Entity();

        structureL05Entity.setId( dto.getId() );
        structureL05Entity.setCodigoTipoIdentificacion( dto.getCodigoTipoIdentificacion() );
        structureL05Entity.setCodigoDepositario( dto.getCodigoDepositario() );
        structureL05Entity.setCodigoTipoDeposito( dto.getCodigoTipoDeposito() );
        structureL05Entity.setNumeroIdentificacionDeposito( dto.getNumeroIdentificacionDeposito() );
        structureL05Entity.setCuentaContable( dto.getCuentaContable() );
        structureL05Entity.setCodigoMoneda( dto.getCodigoMoneda() );
        structureL05Entity.setValorMonedaDenominacion( dto.getValorMonedaDenominacion() );
        structureL05Entity.setValorLibrosDolares( dto.getValorLibrosDolares() );
        structureL05Entity.setCodigoCalificacionRiesgoDepositario( dto.getCodigoCalificacionRiesgoDepositario() );
        structureL05Entity.setCodigoCalificacionRiesgo( dto.getCodigoCalificacionRiesgo() );
        structureL05Entity.setFechaUltimaCalificacion( dto.getFechaUltimaCalificacion() );

        return structureL05Entity;
    }

    @Override
    public List<StructureL05Dto> toDtoList(List<StructureL05Entity> entities) {
        if ( entities == null ) {
            return null;
        }

        List<StructureL05Dto> list = new ArrayList<StructureL05Dto>( entities.size() );
        for ( StructureL05Entity structureL05Entity : entities ) {
            list.add( toDto( structureL05Entity ) );
        }

        return list;
    }
}
