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
        // Resolver códigos a IDs numéricos para que el controller use findById como L02
        d.setCodigoTipoIdentificacion(resolveIdSafe(() -> catalogT4UseCase.getAllCatalogT4().stream()
                .filter(x -> x.getCodigo() != null && x.getCodigo().equals(e.getCodigoTipoIdentificacion()))
                .map(x -> x.getId()).findFirst().orElse(null)));

        d.setTipoGarantia(resolveIdSafe(() -> t42UseCase.findAll().stream()
                .filter(x -> x.getCodigo() != null && x.getCodigo().equals(e.getTipoGarantia()))
                .map(x -> x.getId()).findFirst().orElse(null)));

        d.setUbicacionGarantiaPais(resolveIdSafe(() -> t5UseCase.findAll().stream()
                .filter(x -> x.getCodigo() != null && x.getCodigo().equals(e.getUbicacionGarantiaPais()))
                .map(x -> x.getId()).findFirst().orElse(null)));

        d.setUbicacionGarantiaProvincia(resolveIdSafe(() -> t6UseCase.findAll().stream()
                .filter(x -> x.getCodigo() != null && x.getCodigo().equals(e.getUbicacionGarantiaProvincia()))
                .map(x -> x.getId()).findFirst().orElse(null)));

        d.setUbicacionGarantiaCanton(resolveIdSafe(() -> t7UseCase.findAll().stream()
                .filter(x -> x.getCodigo() != null && x.getCodigo().equals(e.getUbicacionGarantiaCanton()))
                .map(x -> x.getId()).findFirst().orElse(null)));

        d.setEstadoRegistro(resolveIdSafe(() -> t47UseCase.findAll().stream()
                .filter(x -> x.getCodigo() != null && x.getCodigo().equals(e.getEstadoRegistro()))
                .map(x -> x.getId()).findFirst().orElse(null)));

        return d;
    }

    private Integer resolveIdSafe(java.util.concurrent.Callable<Integer> callable) {
        try { return callable.call(); } catch (Exception ex) { return null; }
    }
}