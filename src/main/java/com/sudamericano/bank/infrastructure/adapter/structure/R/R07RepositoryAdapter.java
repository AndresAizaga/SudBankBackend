package com.sudamericano.bank.infrastructure.adapter.structure.R;

import com.sudamericano.bank.domain.model.structure.R.R07Dto;
import com.sudamericano.bank.domain.ports.inputs.catalog.CatalogT4UseCase;
import com.sudamericano.bank.domain.ports.inputs.catalog.T42UseCase;
import com.sudamericano.bank.domain.ports.inputs.catalog.T47UseCase;
import com.sudamericano.bank.domain.ports.inputs.catalog.T5UseCase;
import com.sudamericano.bank.domain.ports.inputs.catalog.T6UseCase;
import com.sudamericano.bank.domain.ports.inputs.catalog.T7UseCase;
import com.sudamericano.bank.domain.ports.outputs.structure.R.R07Port;
import com.sudamericano.bank.infrastructure.mapper.structure.R.R07Mapper;
import com.sudamericano.bank.infrastructure.persistence.entity.structure.R.R07Entity;
import com.sudamericano.bank.infrastructure.persistence.jpa.structure.R.R07Repository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class R07RepositoryAdapter implements R07Port {

    private final R07Repository repository;
    private final R07Mapper mapper;
    private final CatalogT4UseCase catalogT4UseCase;
    private final T42UseCase t42UseCase;
    private final T5UseCase t5UseCase;
    private final T6UseCase t6UseCase;
    private final T7UseCase t7UseCase;
    private final T47UseCase t47UseCase;

    public R07RepositoryAdapter(R07Repository repository, R07Mapper mapper,
                                CatalogT4UseCase catalogT4UseCase,
                                T42UseCase t42UseCase,
                                T5UseCase t5UseCase,
                                T6UseCase t6UseCase,
                                T7UseCase t7UseCase,
                                T47UseCase t47UseCase) {
        this.repository = repository;
        this.mapper = mapper;
        this.catalogT4UseCase = catalogT4UseCase;
        this.t42UseCase = t42UseCase;
        this.t5UseCase = t5UseCase;
        this.t6UseCase = t6UseCase;
        this.t7UseCase = t7UseCase;
        this.t47UseCase = t47UseCase;
    }

    @Override
    public List<R07Dto> findAll() {
        return repository.findAll().stream().map(this::mapEntityToDtoResolvingIds).toList();
    }

    @Override
    public R07Dto findById(Long id) {
        Optional<R07Entity> entity = repository.findById(id);
        return entity.map(this::mapEntityToDtoResolvingIds).orElse(null);
    }

    @Override
    public R07Dto create(R07Dto dto) {
        R07Entity saved = repository.save(mapper.toEntity(dto));
        return mapEntityToDtoResolvingIds(saved);
    }

    @Override
    public R07Dto update(Long id, R07Dto dto) {
        if (!repository.existsById(id)) {
            return null;
        }
        R07Entity entity = mapper.toEntity(dto);
        entity.setId(id);
        return mapEntityToDtoResolvingIds(repository.save(entity));
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    private R07Dto mapEntityToDtoResolvingIds(R07Entity e) {
        R07Dto d = mapper.toDto(e);
        // Los FKs ya son IDs numéricos en la tabla, setear directamente
        d.setCodigoTipoIdentificacion(e.getCodigoTipoIdentificacion());
        d.setTipoGarantia(e.getTipoGarantia());
        d.setUbicacionGarantiaPais(e.getUbicacionGarantiaPais());
        d.setUbicacionGarantiaProvincia(e.getUbicacionGarantiaProvincia());
        d.setUbicacionGarantiaCanton(e.getUbicacionGarantiaCanton());
        d.setEstadoRegistro(e.getEstadoRegistro());

        // Convertir fechas varchar(10) dd/MM/yyyy a LocalDate en el DTO
        d.setFechaAvaluo(parseLocalDate(e.getFechaAvaluo()));
        d.setFechaContabilizacionGarantia(parseLocalDate(e.getFechaContabilizacionGarantia()));

        return d;
    }

    private java.time.LocalDate parseLocalDate(String dateStr) {
        if (dateStr == null || dateStr.isBlank()) return null;
        try {
            java.time.format.DateTimeFormatter fmt = java.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy");
            return java.time.LocalDate.parse(dateStr, fmt);
        } catch (Exception ex) {
            return null;
        }
    }
}