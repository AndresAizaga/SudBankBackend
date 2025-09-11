package com.sudamericano.bank.infrastructure.persistence.entity.structure.R;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "NESR02")
public class R02Entity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "CODIGO_TIPO_IDENTIFICACION")
    private Integer codigoTipoIdentificacion;

    @Column(name = "IDENTIFICACION_SUJETO")
    private String identificacionSujeto;

    @Column(name = "NUMERO_OPERACION")
    private String numeroOperacion;

    @Column(name = "VALOR_OPERACION", precision = 15, scale = 2)
    private BigDecimal valorOperacion;

    @Column(name = "TASA_INT_NOMINAL", precision = 4, scale = 2)
    private BigDecimal tasaInteresNominal;

    @Column(name= "TEA", precision = 4, scale = 2)
    private BigDecimal tea;

    @Column(name = "CODIGO_MONEDA")
    private Integer codigoMoneda;

    @Column(name = "FECH_CONCESION")
    private LocalDate fechaConcesion;

    @Column(name = "FECH_VENCIMIENTO")
    private LocalDate fechaVencimiento;

    @Column(name = "CODIGO_LINEA_CREDITO")
    private Integer codigoLineaCredito;

    @Column(name = "CODIGO_PERIODICIDAD_PAGO")
    private Integer codigoPeriodicidadPago;

    @Column(name = "FRECUENCIA_REVISION")
    private BigDecimal frecuenciaRevision;

    @Column(name = "CODIGO_OFICINA_CONCESION")
    private Integer codigoOficinaConcesion;

    @Column(name = "CODIGO_GARANTE_GARANTIAS")
    private Integer codigoGaranteGarantias;

    @Column(name = "CODIGO_IND_OPER_EXENTA")
    private Integer codigoIndicadorOperacionesExenta;

    @Column(name = "CODIGO_TIPO_CREDITO")
    private Integer codigoTipoCredito;

    @Column(name = "CODIGO_CLASE_CREDITO")
    private Integer codigoClaseCredito;

    @Column(name = "CODIGO_ESTADO_OPERACION")
    private Integer codigoEstadoOperacion;

    @Column(name = "CODIGO_SITUA_OPERACION")
    private Integer codigoSituaOperacion;


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
