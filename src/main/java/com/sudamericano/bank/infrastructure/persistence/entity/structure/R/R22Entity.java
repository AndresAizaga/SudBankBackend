package com.sudamericano.bank.infrastructure.persistence.entity.structure.R;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "NESR22")
public class R22Entity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "CODIGO_TIPO_IDENTIFICACION")
    private Integer codigoTipoIdentificacion;

    @Column(name = "IDENTIFICACION_SUJETO")
    private String identificacionSujeto;

    @Column(name = "NUMERO_TARJETA")
    private String numeroTarjeta;

    @Column(name= "DIAS_MORASIDAD")
    private Integer diasMorasidad;

    @Column(name = "CALIFICACION_PROPIA")
    private Integer calificacionPropia;

    @Column(name = "CALIFICACION_HOMOLOGADA")
    private Integer calificacionHomologada;

    @Column(name = "PROVISION_REQUERIDA")
    private BigDecimal provisionRequerida;

    @Column(name = "PROVISION_CONSTITUIDA")
    private BigDecimal provisionConstituida;

    @Column(name = "VALOR_MINIMO_PAGAR")
    private BigDecimal valorMinimoPagar;

    @Column(name = "VALOR_PAGADO")
    private BigDecimal valorPagado;

    @Column(name = "VALOR_PAGAR")
    private BigDecimal valorPagar;

    @Column(name = "VALOR_INTERES_VALOR_PAGAR")
    private BigDecimal valorInteresValorPagar;

    @Column(name = "VALOR_SEGURO_VALOR_PAGAR")
    private BigDecimal valorSeguroValorPagar;

    @Column(name = "SALDO_CUOTA_CAPITAL_DIFERIDA")
    private BigDecimal saldoCuotaCapitalDiferida;

    @Column(name = "VALOR_INTERESES_CAPITAL_DIFERIDO")
    private BigDecimal valorInteresCapitalDiferido;

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
