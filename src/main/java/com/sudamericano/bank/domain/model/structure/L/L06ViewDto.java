package com.sudamericano.bank.domain.model.structure.L;

import java.math.BigDecimal;
import java.time.LocalDate;

public class L06ViewDto {
    private Long id;
    private String codigoTipoIdentificacionEmisor;
    private String descripcionTipoIdentificacionEmisor;
    private String codigoIdentificacionEmisor;
    private String descripcionIdentificacionEmisor;
    private String numeroTitulo;
    private String numeroOperacion;
    private LocalDate fechaEmision;
    private LocalDate fechaCompra;
    private String codigoEstadoOperacion;
    private String descripcionEstadoOperacion;
    private String cuentaContable;
    private String codigoTipoOperacion;
    private String descripcionTipoOperacion;
    private LocalDate fechaOperacion;
    private LocalDate fechaVencimientoOperacion;
    private String codigoTipoIdentificacionContraparte;
    private String descripcionTipoIdentificacionContraparte;
    private String codigoIdentificacionContraparteOperacion;
    private String descripcionIdentificacionContraparteOperacion;
    private String codigoMonedaDenominacion;
    private String descripcionMonedaDenominacion;
    private BigDecimal montoNegociadoDolares;
    private BigDecimal tasaEfectivaAnual;
    private BigDecimal valorNominalTituloDolares;
    private BigDecimal valorMercadoTituloDolar;
    private String codigoCategoriaCalificacion;
    private String descripcionCategoriaCalificacion;
    private String codigoCalificacionRiesgo;
    private String descripcionCalificacionRiesgo;
    private String codigoCalificadoraRiesgo;
    private String descripcionCalificadoraRiesgo;
    private String codigoTipoIdentificacionCustodio;
    private String descripcionTipoIdentificacionCustodio;
    private String codigoIdentificacionCustodio;
    private String descripcionIdentificacionCustodio;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigoTipoIdentificacionEmisor() {
        return codigoTipoIdentificacionEmisor;
    }

    public void setCodigoTipoIdentificacionEmisor(String codigoTipoIdentificacionEmisor) {
        this.codigoTipoIdentificacionEmisor = codigoTipoIdentificacionEmisor;
    }

    public String getDescripcionTipoIdentificacionEmisor() {
        return descripcionTipoIdentificacionEmisor;
    }

    public void setDescripcionTipoIdentificacionEmisor(String descripcionTipoIdentificacionEmisor) {
        this.descripcionTipoIdentificacionEmisor = descripcionTipoIdentificacionEmisor;
    }

    public String getCodigoIdentificacionEmisor() {
        return codigoIdentificacionEmisor;
    }

    public void setCodigoIdentificacionEmisor(String codigoIdentificacionEmisor) {
        this.codigoIdentificacionEmisor = codigoIdentificacionEmisor;
    }

    public String getDescripcionIdentificacionEmisor() {
        return descripcionIdentificacionEmisor;
    }

    public void setDescripcionIdentificacionEmisor(String descripcionIdentificacionEmisor) {
        this.descripcionIdentificacionEmisor = descripcionIdentificacionEmisor;
    }

    public String getNumeroTitulo() {
        return numeroTitulo;
    }

    public void setNumeroTitulo(String numeroTitulo) {
        this.numeroTitulo = numeroTitulo;
    }

    public String getNumeroOperacion() {
        return numeroOperacion;
    }

    public void setNumeroOperacion(String numeroOperacion) {
        this.numeroOperacion = numeroOperacion;
    }

    public LocalDate getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(LocalDate fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public LocalDate getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(LocalDate fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public String getCodigoEstadoOperacion() {
        return codigoEstadoOperacion;
    }

    public void setCodigoEstadoOperacion(String codigoEstadoOperacion) {
        this.codigoEstadoOperacion = codigoEstadoOperacion;
    }

    public String getDescripcionEstadoOperacion() {
        return descripcionEstadoOperacion;
    }

    public void setDescripcionEstadoOperacion(String descripcionEstadoOperacion) {
        this.descripcionEstadoOperacion = descripcionEstadoOperacion;
    }

    public String getCuentaContable() {
        return cuentaContable;
    }

    public void setCuentaContable(String cuentaContable) {
        this.cuentaContable = cuentaContable;
    }

    public String getCodigoTipoOperacion() {
        return codigoTipoOperacion;
    }

    public void setCodigoTipoOperacion(String codigoTipoOperacion) {
        this.codigoTipoOperacion = codigoTipoOperacion;
    }

    public String getDescripcionTipoOperacion() {
        return descripcionTipoOperacion;
    }

    public void setDescripcionTipoOperacion(String descripcionTipoOperacion) {
        this.descripcionTipoOperacion = descripcionTipoOperacion;
    }

    public LocalDate getFechaOperacion() {
        return fechaOperacion;
    }

    public void setFechaOperacion(LocalDate fechaOperacion) {
        this.fechaOperacion = fechaOperacion;
    }

    public LocalDate getFechaVencimientoOperacion() {
        return fechaVencimientoOperacion;
    }

    public void setFechaVencimientoOperacion(LocalDate fechaVencimientoOperacion) {
        this.fechaVencimientoOperacion = fechaVencimientoOperacion;
    }

    public String getCodigoTipoIdentificacionContraparte() {
        return codigoTipoIdentificacionContraparte;
    }

    public void setCodigoTipoIdentificacionContraparte(String codigoTipoIdentificacionContraparte) {
        this.codigoTipoIdentificacionContraparte = codigoTipoIdentificacionContraparte;
    }

    public String getDescripcionTipoIdentificacionContraparte() {
        return descripcionTipoIdentificacionContraparte;
    }

    public void setDescripcionTipoIdentificacionContraparte(String descripcionTipoIdentificacionContraparte) {
        this.descripcionTipoIdentificacionContraparte = descripcionTipoIdentificacionContraparte;
    }

    public String getCodigoIdentificacionContraparteOperacion() {
        return codigoIdentificacionContraparteOperacion;
    }

    public void setCodigoIdentificacionContraparteOperacion(String codigoIdentificacionContraparteOperacion) {
        this.codigoIdentificacionContraparteOperacion = codigoIdentificacionContraparteOperacion;
    }

    public String getDescripcionIdentificacionContraparteOperacion() {
        return descripcionIdentificacionContraparteOperacion;
    }

    public void setDescripcionIdentificacionContraparteOperacion(String descripcionIdentificacionContraparteOperacion) {
        this.descripcionIdentificacionContraparteOperacion = descripcionIdentificacionContraparteOperacion;
    }

    public String getCodigoMonedaDenominacion() {
        return codigoMonedaDenominacion;
    }

    public void setCodigoMonedaDenominacion(String codigoMonedaDenominacion) {
        this.codigoMonedaDenominacion = codigoMonedaDenominacion;
    }

    public String getDescripcionMonedaDenominacion() {
        return descripcionMonedaDenominacion;
    }

    public void setDescripcionMonedaDenominacion(String descripcionMonedaDenominacion) {
        this.descripcionMonedaDenominacion = descripcionMonedaDenominacion;
    }

    public BigDecimal getMontoNegociadoDolares() {
        return montoNegociadoDolares;
    }

    public void setMontoNegociadoDolares(BigDecimal montoNegociadoDolares) {
        this.montoNegociadoDolares = montoNegociadoDolares;
    }

    public BigDecimal getTasaEfectivaAnual() {
        return tasaEfectivaAnual;
    }

    public void setTasaEfectivaAnual(BigDecimal tasaEfectivaAnual) {
        this.tasaEfectivaAnual = tasaEfectivaAnual;
    }

    public BigDecimal getValorNominalTituloDolares() {
        return valorNominalTituloDolares;
    }

    public void setValorNominalTituloDolares(BigDecimal valorNominalTituloDolares) {
        this.valorNominalTituloDolares = valorNominalTituloDolares;
    }

    public BigDecimal getValorMercadoTituloDolar() {
        return valorMercadoTituloDolar;
    }

    public void setValorMercadoTituloDolar(BigDecimal valorMercadoTituloDolar) {
        this.valorMercadoTituloDolar = valorMercadoTituloDolar;
    }

    public String getCodigoCategoriaCalificacion() {
        return codigoCategoriaCalificacion;
    }

    public void setCodigoCategoriaCalificacion(String codigoCategoriaCalificacion) {
        this.codigoCategoriaCalificacion = codigoCategoriaCalificacion;
    }

    public String getDescripcionCategoriaCalificacion() {
        return descripcionCategoriaCalificacion;
    }

    public void setDescripcionCategoriaCalificacion(String descripcionCategoriaCalificacion) {
        this.descripcionCategoriaCalificacion = descripcionCategoriaCalificacion;
    }

    public String getCodigoCalificacionRiesgo() {
        return codigoCalificacionRiesgo;
    }

    public void setCodigoCalificacionRiesgo(String codigoCalificacionRiesgo) {
        this.codigoCalificacionRiesgo = codigoCalificacionRiesgo;
    }

    public String getDescripcionCalificacionRiesgo() {
        return descripcionCalificacionRiesgo;
    }

    public void setDescripcionCalificacionRiesgo(String descripcionCalificacionRiesgo) {
        this.descripcionCalificacionRiesgo = descripcionCalificacionRiesgo;
    }

    public String getCodigoCalificadoraRiesgo() {
        return codigoCalificadoraRiesgo;
    }

    public void setCodigoCalificadoraRiesgo(String codigoCalificadoraRiesgo) {
        this.codigoCalificadoraRiesgo = codigoCalificadoraRiesgo;
    }

    public String getDescripcionCalificadoraRiesgo() {
        return descripcionCalificadoraRiesgo;
    }

    public void setDescripcionCalificadoraRiesgo(String descripcionCalificadoraRiesgo) {
        this.descripcionCalificadoraRiesgo = descripcionCalificadoraRiesgo;
    }

    public String getCodigoTipoIdentificacionCustodio() {
        return codigoTipoIdentificacionCustodio;
    }

    public void setCodigoTipoIdentificacionCustodio(String codigoTipoIdentificacionCustodio) {
        this.codigoTipoIdentificacionCustodio = codigoTipoIdentificacionCustodio;
    }

    public String getDescripcionTipoIdentificacionCustodio() {
        return descripcionTipoIdentificacionCustodio;
    }

    public void setDescripcionTipoIdentificacionCustodio(String descripcionTipoIdentificacionCustodio) {
        this.descripcionTipoIdentificacionCustodio = descripcionTipoIdentificacionCustodio;
    }

    public String getCodigoIdentificacionCustodio() {
        return codigoIdentificacionCustodio;
    }

    public void setCodigoIdentificacionCustodio(String codigoIdentificacionCustodio) {
        this.codigoIdentificacionCustodio = codigoIdentificacionCustodio;
    }

    public String getDescripcionIdentificacionCustodio() {
        return descripcionIdentificacionCustodio;
    }

    public void setDescripcionIdentificacionCustodio(String descripcionIdentificacionCustodio) {
        this.descripcionIdentificacionCustodio = descripcionIdentificacionCustodio;
    }
}
