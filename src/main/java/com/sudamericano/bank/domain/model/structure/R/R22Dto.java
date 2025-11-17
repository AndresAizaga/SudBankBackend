package com.sudamericano.bank.domain.model.structure.R;

import java.math.BigDecimal;

public class R22Dto {
    private Integer id;
    private Integer codigoTipoIdentificacion;
    private String identificacionSujeto;
    private String numeroTarjeta;
    private Integer diasMorasidad;
    private Integer calificacionPropia;
    private Integer calificacionHomologada;
    private BigDecimal provisionRequerida;
    private BigDecimal provisionConstituida;
    private BigDecimal valorMinimoPagar;
    private BigDecimal valorPagado;
    private BigDecimal valorPagar;
    private BigDecimal valorInteresValorPagar;
    private BigDecimal valorSeguroValorPagar;
    private BigDecimal saldoCuotaCapitalDiferida;
    private BigDecimal valorInteresCapitalDiferido;

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

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public Integer getDiasMorasidad() {
        return diasMorasidad;
    }

    public void setDiasMorasidad(Integer diasMorasidad) {
        this.diasMorasidad = diasMorasidad;
    }

    public Integer getCalificacionPropia() {
        return calificacionPropia;
    }

    public void setCalificacionPropia(Integer calificacionPropia) {
        this.calificacionPropia = calificacionPropia;
    }

    public Integer getCalificacionHomologada() {
        return calificacionHomologada;
    }

    public void setCalificacionHomologada(Integer calificacionHomologada) {
        this.calificacionHomologada = calificacionHomologada;
    }

    public BigDecimal getProvisionRequerida() {
        return provisionRequerida;
    }

    public void setProvisionRequerida(BigDecimal provisionRequerida) {
        this.provisionRequerida = provisionRequerida;
    }

    public BigDecimal getProvisionConstituida() {
        return provisionConstituida;
    }

    public void setProvisionConstituida(BigDecimal provisionConstituida) {
        this.provisionConstituida = provisionConstituida;
    }

    public BigDecimal getValorMinimoPagar() {
        return valorMinimoPagar;
    }

    public void setValorMinimoPagar(BigDecimal valorMinimoPagar) {
        this.valorMinimoPagar = valorMinimoPagar;
    }

    public BigDecimal getValorPagado() {
        return valorPagado;
    }

    public void setValorPagado(BigDecimal valorPagado) {
        this.valorPagado = valorPagado;
    }

    public BigDecimal getValorPagar() {
        return valorPagar;
    }

    public void setValorPagar(BigDecimal valorPagar) {
        this.valorPagar = valorPagar;
    }

    public BigDecimal getValorInteresValorPagar() {
        return valorInteresValorPagar;
    }

    public void setValorInteresValorPagar(BigDecimal valorInteresValorPagar) {
        this.valorInteresValorPagar = valorInteresValorPagar;
    }

    public BigDecimal getValorSeguroValorPagar() {
        return valorSeguroValorPagar;
    }

    public void setValorSeguroValorPagar(BigDecimal valorSeguroValorPagar) {
        this.valorSeguroValorPagar = valorSeguroValorPagar;
    }

    public BigDecimal getSaldoCuotaCapitalDiferida() {
        return saldoCuotaCapitalDiferida;
    }

    public void setSaldoCuotaCapitalDiferida(BigDecimal saldoCuotaCapitalDiferida) {
        this.saldoCuotaCapitalDiferida = saldoCuotaCapitalDiferida;
    }

    public BigDecimal getValorInteresCapitalDiferido() {
        return valorInteresCapitalDiferido;
    }

    public void setValorInteresCapitalDiferido(BigDecimal valorInteresCapitalDiferido) {
        this.valorInteresCapitalDiferido = valorInteresCapitalDiferido;
    }
}
