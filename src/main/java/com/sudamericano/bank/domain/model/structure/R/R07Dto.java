package com.sudamericano.bank.domain.model.structure.R;

import java.math.BigDecimal;
import java.time.LocalDate;

public class R07Dto {

    private Long id;
    private Integer codigoTipoIdentificacion;
    private String identificacionSujeto;
    private String numeroOperacion;
    private String numeroGarantia;
    private String tipoGarantia;
    private String descripcionGarantia;
    private String ubicacionGarantiaPais;
    private String ubicacionGarantiaProvincia;
    private String ubicacionGarantiaCanton;
    private BigDecimal valorAvaluoTitulo;
    private LocalDate fechaAvaluo;
    private String numeroRegistroGarantia;
    private LocalDate fechaContabilizacionGarantia;
    private BigDecimal porcentajeCubreGarantia;
    private String estadoRegistro;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public String getNumeroGarantia() {
        return numeroGarantia;
    }

    public void setNumeroGarantia(String numeroGarantia) {
        this.numeroGarantia = numeroGarantia;
    }

    public String getTipoGarantia() {
        return tipoGarantia;
    }

    public void setTipoGarantia(String tipoGarantia) {
        this.tipoGarantia = tipoGarantia;
    }

    public String getDescripcionGarantia() {
        return descripcionGarantia;
    }

    public void setDescripcionGarantia(String descripcionGarantia) {
        this.descripcionGarantia = descripcionGarantia;
    }

    public String getUbicacionGarantiaPais() {
        return ubicacionGarantiaPais;
    }

    public void setUbicacionGarantiaPais(String ubicacionGarantiaPais) {
        this.ubicacionGarantiaPais = ubicacionGarantiaPais;
    }

    public String getUbicacionGarantiaProvincia() {
        return ubicacionGarantiaProvincia;
    }

    public void setUbicacionGarantiaProvincia(String ubicacionGarantiaProvincia) {
        this.ubicacionGarantiaProvincia = ubicacionGarantiaProvincia;
    }

    public String getUbicacionGarantiaCanton() {
        return ubicacionGarantiaCanton;
    }

    public void setUbicacionGarantiaCanton(String ubicacionGarantiaCanton) {
        this.ubicacionGarantiaCanton = ubicacionGarantiaCanton;
    }

    public BigDecimal getValorAvaluoTitulo() {
        return valorAvaluoTitulo;
    }

    public void setValorAvaluoTitulo(BigDecimal valorAvaluoTitulo) {
        this.valorAvaluoTitulo = valorAvaluoTitulo;
    }

    public LocalDate getFechaAvaluo() {
        return fechaAvaluo;
    }

    public void setFechaAvaluo(LocalDate fechaAvaluo) {
        this.fechaAvaluo = fechaAvaluo;
    }

    public String getNumeroRegistroGarantia() {
        return numeroRegistroGarantia;
    }

    public void setNumeroRegistroGarantia(String numeroRegistroGarantia) {
        this.numeroRegistroGarantia = numeroRegistroGarantia;
    }

    public LocalDate getFechaContabilizacionGarantia() {
        return fechaContabilizacionGarantia;
    }

    public void setFechaContabilizacionGarantia(LocalDate fechaContabilizacionGarantia) {
        this.fechaContabilizacionGarantia = fechaContabilizacionGarantia;
    }

    public BigDecimal getPorcentajeCubreGarantia() {
        return porcentajeCubreGarantia;
    }

    public void setPorcentajeCubreGarantia(BigDecimal porcentajeCubreGarantia) {
        this.porcentajeCubreGarantia = porcentajeCubreGarantia;
    }

    public String getEstadoRegistro() {
        return estadoRegistro;
    }

    public void setEstadoRegistro(String estadoRegistro) {
        this.estadoRegistro = estadoRegistro;
    }
}