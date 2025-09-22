package com.sudamericano.bank.domain.model.structure.R;

import java.math.BigDecimal;
import java.time.LocalDate;

public class R07Dto {

    private Long id;
    private Integer codigoTipoIdentificacion;
    private String identificacionSujeto;
    private String numeroOperacion;
    private String numeroGarantia;
    private Integer tipoGarantia;
    private String descripcionGarantia;
    private Integer ubicacionGarantiaPais;
    private Integer ubicacionGarantiaProvincia;
    private Integer ubicacionGarantiaCanton;
    private BigDecimal valorAvaluoTitulo;
    private LocalDate fechaAvaluo;
    private String numeroRegistroGarantia;
    private LocalDate fechaContabilizacionGarantia;
    private BigDecimal porcentajeCubreGarantia;
    private Integer estadoRegistro;

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

    public Integer getTipoGarantia() {
        return tipoGarantia;
    }

    public void setTipoGarantia(Integer tipoGarantia) {
        this.tipoGarantia = tipoGarantia;
    }

    public String getDescripcionGarantia() {
        return descripcionGarantia;
    }

    public void setDescripcionGarantia(String descripcionGarantia) {
        this.descripcionGarantia = descripcionGarantia;
    }

    public Integer getUbicacionGarantiaPais() {
        return ubicacionGarantiaPais;
    }

    public void setUbicacionGarantiaPais(Integer ubicacionGarantiaPais) {
        this.ubicacionGarantiaPais = ubicacionGarantiaPais;
    }

    public Integer getUbicacionGarantiaProvincia() {
        return ubicacionGarantiaProvincia;
    }

    public void setUbicacionGarantiaProvincia(Integer ubicacionGarantiaProvincia) {
        this.ubicacionGarantiaProvincia = ubicacionGarantiaProvincia;
    }

    public Integer getUbicacionGarantiaCanton() {
        return ubicacionGarantiaCanton;
    }

    public void setUbicacionGarantiaCanton(Integer ubicacionGarantiaCanton) {
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

    public Integer getEstadoRegistro() {
        return estadoRegistro;
    }

    public void setEstadoRegistro(Integer estadoRegistro) {
        this.estadoRegistro = estadoRegistro;
    }
}