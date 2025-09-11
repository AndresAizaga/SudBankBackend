package com.sudamericano.bank.domain.model.structure.R;

import java.math.BigDecimal;
import java.time.LocalDate;

public class R02Dto {
    private Integer id;
    private Integer codigoTipoIdentificacion;
    private String identificacionSujeto;
    private String numeroOperacion;
    private BigDecimal valorOperacion;
    private BigDecimal tasaInteresNominal;
    private BigDecimal tea;
    private Integer codigoMoneda;
    private LocalDate fechaConcesion;
    private LocalDate fechaVencimiento;
    private Integer codigoLineaCredito;
    private Integer codigoPeriodicidadPago;
    private BigDecimal frecuenciaRevision;
    private Integer codigoOficinaConcesion;
    private Integer codigoGaranteGarantias;
    private Integer codigoIndicadorOperacionesExenta;
    private Integer codigoTipoCredito;
    private Integer codigoClaseCredito;
    private Integer codigoEstadoOperacion;
    private Integer codigoSituaOperacion;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCodigoTipoIdentificacion() {
        return codigoTipoIdentificacion;
    }

    public void setCodigoTipoIdentificacion(Integer codigoTipoIdentificacion) {
        this.codigoTipoIdentificacion = codigoTipoIdentificacion;
    }

    public String getIdentificacionSujeto() {
        return identificacionSujeto;
    }

    public void setIdentificacionSujeto(String identificacionSujeto) {
        this.identificacionSujeto = identificacionSujeto;
    }

    public String getNumeroOperacion() {
        return numeroOperacion;
    }

    public void setNumeroOperacion(String numeroOperacion) {
        this.numeroOperacion = numeroOperacion;
    }

    public BigDecimal getValorOperacion() {
        return valorOperacion;
    }

    public void setValorOperacion(BigDecimal valorOperacion) {
        this.valorOperacion = valorOperacion;
    }

    public BigDecimal getTasaInteresNominal() {
        return tasaInteresNominal;
    }

    public void setTasaInteresNominal(BigDecimal tasaInteresNominal) {
        this.tasaInteresNominal = tasaInteresNominal;
    }

    public BigDecimal getTea() {
        return tea;
    }

    public void setTea(BigDecimal tea) {
        this.tea = tea;
    }

    public Integer getCodigoMoneda() {
        return codigoMoneda;
    }

    public void setCodigoMoneda(Integer codigoMoneda) {
        this.codigoMoneda = codigoMoneda;
    }

    public LocalDate getFechaConcesion() {
        return fechaConcesion;
    }

    public void setFechaConcesion(LocalDate fechaConcesion) {
        this.fechaConcesion = fechaConcesion;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public Integer getCodigoLineaCredito() {
        return codigoLineaCredito;
    }

    public void setCodigoLineaCredito(Integer codigoLineaCredito) {
        this.codigoLineaCredito = codigoLineaCredito;
    }

    public Integer getCodigoPeriodicidadPago() {
        return codigoPeriodicidadPago;
    }

    public void setCodigoPeriodicidadPago(Integer codigoPeriodicidadPago) {
        this.codigoPeriodicidadPago = codigoPeriodicidadPago;
    }

    public BigDecimal getFrecuenciaRevision() {
        return frecuenciaRevision;
    }

    public void setFrecuenciaRevision(BigDecimal frecuenciaRevision) {
        this.frecuenciaRevision = frecuenciaRevision;
    }

    public Integer getCodigoOficinaConcesion() {
        return codigoOficinaConcesion;
    }

    public void setCodigoOficinaConcesion(Integer codigoOficinaConcesion) {
        this.codigoOficinaConcesion = codigoOficinaConcesion;
    }

    public Integer getCodigoGaranteGarantias() {
        return codigoGaranteGarantias;
    }

    public void setCodigoGaranteGarantias(Integer codigoGaranteGarantias) {
        this.codigoGaranteGarantias = codigoGaranteGarantias;
    }

    public Integer getCodigoIndicadorOperacionesExenta() {
        return codigoIndicadorOperacionesExenta;
    }

    public void setCodigoIndicadorOperacionesExenta(Integer codigoIndicadorOperacionesExenta) {
        this.codigoIndicadorOperacionesExenta = codigoIndicadorOperacionesExenta;
    }

    public Integer getCodigoTipoCredito() {
        return codigoTipoCredito;
    }

    public void setCodigoTipoCredito(Integer codigoTipoCredito) {
        this.codigoTipoCredito = codigoTipoCredito;
    }

    public Integer getCodigoClaseCredito() {
        return codigoClaseCredito;
    }

    public void setCodigoClaseCredito(Integer codigoClaseCredito) {
        this.codigoClaseCredito = codigoClaseCredito;
    }

    public Integer getCodigoEstadoOperacion() {
        return codigoEstadoOperacion;
    }

    public void setCodigoEstadoOperacion(Integer codigoEstadoOperacion) {
        this.codigoEstadoOperacion = codigoEstadoOperacion;
    }

    public Integer getCodigoSituaOperacion() {
        return codigoSituaOperacion;
    }

    public void setCodigoSituaOperacion(Integer codigoSituaOperacion) {
        this.codigoSituaOperacion = codigoSituaOperacion;
    }
}
