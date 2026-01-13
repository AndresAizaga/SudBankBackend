package com.sudamericano.bank.infrastructure.persistence.jpa.structure.L;

import com.sudamericano.bank.infrastructure.persistence.entity.structure.L.L06Entity;
import com.sudamericano.bank.infrastructure.persistence.jpa.structure.L.projection.L03ViewProjection;
import com.sudamericano.bank.infrastructure.persistence.jpa.structure.L.projection.L06ViewProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface L06Repository extends JpaRepository<L06Entity, Integer> {

    @Query(value = """
        SELECT L.ID AS id,
            T4_EMI.CODIGO        AS codigoTipoIdentificacionEmisor,
            T4_EMI.DESCRIPCION   AS descripcionTipoIdentificacionEmisor,
            T164_EMI.CODIGO      AS codigoIdentificacionEmisor,
            T164_EMI.DESCRIPCION AS descripcionIdentificacionEmisor,
            L.NUMERO_TITULO     AS numeroTitulo,
            L.NUMERO_OPERACION  AS numeroOperacion,
            L.FECHA_EMISION     AS fechaEmision,
            L.FECHA_COMPRA      AS fechaCompra,
            T_EST_OP.CODIGO      AS codigoEstadoOperacion,
            T_EST_OP.DESCRIPCION AS descripcionEstadoOperacion,
            L.CUENTA_CONTABLE    AS cuentaContable,
            T_TIPO_OP.CODIGO      AS codigoTipoOperacion,
            T_TIPO_OP.DESCRIPCION AS descripcionTipoOperacion,
            L.FECHA_OPERACION      AS fechaOperacion,
            L.FECHA_VENCIMIENTO_OPERACION AS fechaVencimientoOperacion,
            T4_CONTRA.CODIGO        AS codigoTipoIdentificacionContraparte,
            T4_CONTRA.DESCRIPCION   AS descripcionTipoIdentificacionContraparte,
            T164_CONTRA.CODIGO      AS codigoIdentificacionContraparteOperacion,
            T164
        """, nativeQuery = true)
    List<L06ViewProjection> findAllResumenDatosL06();
}
