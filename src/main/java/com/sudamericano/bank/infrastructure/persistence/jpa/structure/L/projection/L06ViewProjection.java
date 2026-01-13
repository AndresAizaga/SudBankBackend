package com.sudamericano.bank.infrastructure.persistence.jpa.structure.L.projection;

import java.math.BigDecimal;
import java.time.LocalDate;

public interface L06ViewProjection {
    Integer getId();
    Integer getCodigoTipoIdentificacionEmisor();
    Integer getCodigoIdentificacionEmisor();
    Integer getNumeroTitulo();
    Integer getNumeroOperacion();
    LocalDate getFechaEmision();
    LocalDate getFechaCompra();
    Integer getCodigoEstadoOperacion();
    String getCuentaContable();
    Integer getCodigoTipoOperacion();
    LocalDate getFechaOperacion();
    LocalDate getFechaVencimientoOperacion();
    Integer getCodigoTipoIdentificacionContraparte();
    Integer getCodigoIdentificacionContraparteOperacion();
    Integer getCodigoMonedaDenominacion();
    BigDecimal getMontoNegociadoDolares();
    BigDecimal getTasaEfectivaAnual();
    Float getValorNominalTituloDolares();
    Float getValorMercadoTituloDolar();
    Integer getCodigoCategoriaCalificacion();
    Integer getCodigoCalificacionRiesgo();
    Integer getCodigoCalificadoraRiesgo();
    String getCodigoTipoIdentificacionCustodio();
    String getCodigoIdentificacionCustodio();
}
