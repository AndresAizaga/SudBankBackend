package com.sudamericano.bank.domain.model.structure.R;

import java.math.BigDecimal;
import java.time.LocalDate;

public class R04Dto {
    // Campos básicos (1-4)
    private Integer codigoTipoIdentificacion;
    private String identificacionSujeto;
    private String numeroOperacion;
    private Integer diasMorosidad;
    
    // Campos de calificación (5-7)
    private Integer codigoMetodologiaCalificacion;
    private Integer codigoCalificacionPropia;
    private Integer codigoCalificacionHomologada;
    
    // Campo de interés (8)
    private BigDecimal tasaInteres;
    
    // Valores por vencer (9-13)
    private BigDecimal valorPorVencer1a30;
    private BigDecimal valorPorVencer31a90;
    private BigDecimal valorPorVencer91a180;
    private BigDecimal valorPorVencer181a360;
    private BigDecimal valorPorVencerMas360;
    
    // Valores que no devengan intereses (14-18)
    private BigDecimal valorNoDevenga1a30;
    private BigDecimal valorNoDevenga31a90;
    private BigDecimal valorNoDevenga91a180;
    private BigDecimal valorNoDevenga181a360;
    private BigDecimal valorNoDevengaMas360;
    
    // Valores vencidos (19-29)
    private BigDecimal valorVencido1a30;
    private BigDecimal valorVencido31a90;
    private BigDecimal valorVencido91a180;
    private BigDecimal valorVencido181a360;
    private BigDecimal valorVencidoMas360;
    private BigDecimal valorVencido181a270;
    private BigDecimal valorVencidoMas270;
    private BigDecimal valorVencido91a270;
    private BigDecimal valorVencido271a360;
    private BigDecimal valorVencido361a720;
    private BigDecimal valorVencidoMas720;
    
    // Campos adicionales (30-37)
    private BigDecimal gastosRecuperacion;
    private BigDecimal interesOrdinario;
    private BigDecimal interesSobreMora;
    private BigDecimal valorDemandaJudicial;
    private BigDecimal carteraCastigada;
    private BigDecimal provisionRequeridaOriginal;
    private BigDecimal provisionRequeridaReducida;
    private BigDecimal provisionConstituida;
    
    // Campos de operación (38-39)
    private Integer codigoTipoOperacion;
    private Integer codigoObjetoFideicomiso;
    
    // Campos financieros (40-45)
    private BigDecimal primaDescuento;
    private BigDecimal cuotaCredito;
    private BigDecimal valorInteresesCuota;
    private BigDecimal valorSeguro;
    private BigDecimal saldoCuotaCapitalDiferida;
    private BigDecimal valorInteresCapitalDiferido;
    
    // Campos de fecha e intereses (46-48)
    private LocalDate fechaTransferenciaCuentasVencidas;
    private BigDecimal interesesAcumuladosPorCobrar;
    private BigDecimal interesesReversados;
    
    // Campos adicionales (49-50)
    private LocalDate fechaExigibilidadCuota;
    private Integer codigoTipoSistemaAmortizacion;

    // Getters y Setters para campos básicos (1-4)
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
    
    public Integer getDiasMorosidad() {
        return diasMorosidad;
    }

    public void setDiasMorosidad(Integer diasMorosidad) {
        this.diasMorosidad = diasMorosidad;
    }

    // Getters y Setters para campos de calificación (5-7)
    public Integer getCodigoMetodologiaCalificacion() {
        return codigoMetodologiaCalificacion;
    }

    public void setCodigoMetodologiaCalificacion(Integer codigoMetodologiaCalificacion) {
        this.codigoMetodologiaCalificacion = codigoMetodologiaCalificacion;
    }

    public Integer getCodigoCalificacionPropia() {
        return codigoCalificacionPropia;
    }

    public void setCodigoCalificacionPropia(Integer codigoCalificacionPropia) {
        this.codigoCalificacionPropia = codigoCalificacionPropia;
    }

    public Integer getCodigoCalificacionHomologada() {
        return codigoCalificacionHomologada;
    }

    public void setCodigoCalificacionHomologada(Integer codigoCalificacionHomologada) {
        this.codigoCalificacionHomologada = codigoCalificacionHomologada;
    }

    // Getters y Setters para campo de interés (8)
    public BigDecimal getTasaInteres() {
        return tasaInteres;
    }

    public void setTasaInteres(BigDecimal tasaInteres) {
        this.tasaInteres = tasaInteres;
    }

    // Getters y Setters para valores por vencer (9-13)
    public BigDecimal getValorPorVencer1a30() {
        return valorPorVencer1a30;
    }

    public void setValorPorVencer1a30(BigDecimal valorPorVencer1a30) {
        this.valorPorVencer1a30 = valorPorVencer1a30;
    }

    public BigDecimal getValorPorVencer31a90() {
        return valorPorVencer31a90;
    }

    public void setValorPorVencer31a90(BigDecimal valorPorVencer31a90) {
        this.valorPorVencer31a90 = valorPorVencer31a90;
    }

    public BigDecimal getValorPorVencer91a180() {
        return valorPorVencer91a180;
    }

    public void setValorPorVencer91a180(BigDecimal valorPorVencer91a180) {
        this.valorPorVencer91a180 = valorPorVencer91a180;
    }

    public BigDecimal getValorPorVencer181a360() {
        return valorPorVencer181a360;
    }

    public void setValorPorVencer181a360(BigDecimal valorPorVencer181a360) {
        this.valorPorVencer181a360 = valorPorVencer181a360;
    }

    public BigDecimal getValorPorVencerMas360() {
        return valorPorVencerMas360;
    }

    public void setValorPorVencerMas360(BigDecimal valorPorVencerMas360) {
        this.valorPorVencerMas360 = valorPorVencerMas360;
    }

    // Getters y Setters para valores que no devengan intereses (14-18)
    public BigDecimal getValorNoDevenga1a30() {
        return valorNoDevenga1a30;
    }

    public void setValorNoDevenga1a30(BigDecimal valorNoDevenga1a30) {
        this.valorNoDevenga1a30 = valorNoDevenga1a30;
    }

    public BigDecimal getValorNoDevenga31a90() {
        return valorNoDevenga31a90;
    }

    public void setValorNoDevenga31a90(BigDecimal valorNoDevenga31a90) {
        this.valorNoDevenga31a90 = valorNoDevenga31a90;
    }

    public BigDecimal getValorNoDevenga91a180() {
        return valorNoDevenga91a180;
    }

    public void setValorNoDevenga91a180(BigDecimal valorNoDevenga91a180) {
        this.valorNoDevenga91a180 = valorNoDevenga91a180;
    }

    public BigDecimal getValorNoDevenga181a360() {
        return valorNoDevenga181a360;
    }

    public void setValorNoDevenga181a360(BigDecimal valorNoDevenga181a360) {
        this.valorNoDevenga181a360 = valorNoDevenga181a360;
    }

    public BigDecimal getValorNoDevengaMas360() {
        return valorNoDevengaMas360;
    }

    public void setValorNoDevengaMas360(BigDecimal valorNoDevengaMas360) {
        this.valorNoDevengaMas360 = valorNoDevengaMas360;
    }

    // Getters y Setters para valores vencidos (19-29)
    public BigDecimal getValorVencido1a30() {
        return valorVencido1a30;
    }

    public void setValorVencido1a30(BigDecimal valorVencido1a30) {
        this.valorVencido1a30 = valorVencido1a30;
    }

    public BigDecimal getValorVencido31a90() {
        return valorVencido31a90;
    }

    public void setValorVencido31a90(BigDecimal valorVencido31a90) {
        this.valorVencido31a90 = valorVencido31a90;
    }

    public BigDecimal getValorVencido91a180() {
        return valorVencido91a180;
    }

    public void setValorVencido91a180(BigDecimal valorVencido91a180) {
        this.valorVencido91a180 = valorVencido91a180;
    }

    public BigDecimal getValorVencido181a360() {
        return valorVencido181a360;
    }

    public void setValorVencido181a360(BigDecimal valorVencido181a360) {
        this.valorVencido181a360 = valorVencido181a360;
    }

    public BigDecimal getValorVencidoMas360() {
        return valorVencidoMas360;
    }

    public void setValorVencidoMas360(BigDecimal valorVencidoMas360) {
        this.valorVencidoMas360 = valorVencidoMas360;
    }

    public BigDecimal getValorVencido181a270() {
        return valorVencido181a270;
    }

    public void setValorVencido181a270(BigDecimal valorVencido181a270) {
        this.valorVencido181a270 = valorVencido181a270;
    }

    public BigDecimal getValorVencidoMas270() {
        return valorVencidoMas270;
    }

    public void setValorVencidoMas270(BigDecimal valorVencidoMas270) {
        this.valorVencidoMas270 = valorVencidoMas270;
    }

    public BigDecimal getValorVencido91a270() {
        return valorVencido91a270;
    }

    public void setValorVencido91a270(BigDecimal valorVencido91a270) {
        this.valorVencido91a270 = valorVencido91a270;
    }

    public BigDecimal getValorVencido271a360() {
        return valorVencido271a360;
    }

    public void setValorVencido271a360(BigDecimal valorVencido271a360) {
        this.valorVencido271a360 = valorVencido271a360;
    }

    public BigDecimal getValorVencido361a720() {
        return valorVencido361a720;
    }

    public void setValorVencido361a720(BigDecimal valorVencido361a720) {
        this.valorVencido361a720 = valorVencido361a720;
    }

    public BigDecimal getValorVencidoMas720() {
        return valorVencidoMas720;
    }

    public void setValorVencidoMas720(BigDecimal valorVencidoMas720) {
        this.valorVencidoMas720 = valorVencidoMas720;
    }

    // Getters y Setters para campos adicionales (30-37)
    public BigDecimal getGastosRecuperacion() {
        return gastosRecuperacion;
    }

    public void setGastosRecuperacion(BigDecimal gastosRecuperacion) {
        this.gastosRecuperacion = gastosRecuperacion;
    }

    public BigDecimal getInteresOrdinario() {
        return interesOrdinario;
    }

    public void setInteresOrdinario(BigDecimal interesOrdinario) {
        this.interesOrdinario = interesOrdinario;
    }

    public BigDecimal getInteresSobreMora() {
        return interesSobreMora;
    }

    public void setInteresSobreMora(BigDecimal interesSobreMora) {
        this.interesSobreMora = interesSobreMora;
    }

    public BigDecimal getValorDemandaJudicial() {
        return valorDemandaJudicial;
    }

    public void setValorDemandaJudicial(BigDecimal valorDemandaJudicial) {
        this.valorDemandaJudicial = valorDemandaJudicial;
    }

    public BigDecimal getCarteraCastigada() {
        return carteraCastigada;
    }

    public void setCarteraCastigada(BigDecimal carteraCastigada) {
        this.carteraCastigada = carteraCastigada;
    }

    public BigDecimal getProvisionRequeridaOriginal() {
        return provisionRequeridaOriginal;
    }

    public void setProvisionRequeridaOriginal(BigDecimal provisionRequeridaOriginal) {
        this.provisionRequeridaOriginal = provisionRequeridaOriginal;
    }

    public BigDecimal getProvisionRequeridaReducida() {
        return provisionRequeridaReducida;
    }

    public void setProvisionRequeridaReducida(BigDecimal provisionRequeridaReducida) {
        this.provisionRequeridaReducida = provisionRequeridaReducida;
    }

    public BigDecimal getProvisionConstituida() {
        return provisionConstituida;
    }

    public void setProvisionConstituida(BigDecimal provisionConstituida) {
        this.provisionConstituida = provisionConstituida;
    }

    // Getters y Setters para campos de operación (38-39)
    public Integer getCodigoTipoOperacion() {
        return codigoTipoOperacion;
    }

    public void setCodigoTipoOperacion(Integer codigoTipoOperacion) {
        this.codigoTipoOperacion = codigoTipoOperacion;
    }

    public Integer getCodigoObjetoFideicomiso() {
        return codigoObjetoFideicomiso;
    }

    public void setCodigoObjetoFideicomiso(Integer codigoObjetoFideicomiso) {
        this.codigoObjetoFideicomiso = codigoObjetoFideicomiso;
    }

    // Getters y Setters para campos financieros (40-45)
    public BigDecimal getPrimaDescuento() {
        return primaDescuento;
    }

    public void setPrimaDescuento(BigDecimal primaDescuento) {
        this.primaDescuento = primaDescuento;
    }

    public BigDecimal getCuotaCredito() {
        return cuotaCredito;
    }

    public void setCuotaCredito(BigDecimal cuotaCredito) {
        this.cuotaCredito = cuotaCredito;
    }

    public BigDecimal getValorInteresesCuota() {
        return valorInteresesCuota;
    }

    public void setValorInteresesCuota(BigDecimal valorInteresesCuota) {
        this.valorInteresesCuota = valorInteresesCuota;
    }

    public BigDecimal getValorSeguro() {
        return valorSeguro;
    }

    public void setValorSeguro(BigDecimal valorSeguro) {
        this.valorSeguro = valorSeguro;
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

    // Getters y Setters para campos de fecha e intereses (46-48)
    public LocalDate getFechaTransferenciaCuentasVencidas() {
        return fechaTransferenciaCuentasVencidas;
    }

    public void setFechaTransferenciaCuentasVencidas(LocalDate fechaTransferenciaCuentasVencidas) {
        this.fechaTransferenciaCuentasVencidas = fechaTransferenciaCuentasVencidas;
    }

    public BigDecimal getInteresesAcumuladosPorCobrar() {
        return interesesAcumuladosPorCobrar;
    }

    public void setInteresesAcumuladosPorCobrar(BigDecimal interesesAcumuladosPorCobrar) {
        this.interesesAcumuladosPorCobrar = interesesAcumuladosPorCobrar;
    }

    public BigDecimal getInteresesReversados() {
        return interesesReversados;
    }

    public void setInteresesReversados(BigDecimal interesesReversados) {
        this.interesesReversados = interesesReversados;
    }

    // Getters y Setters para campos adicionales (49-50)
    public LocalDate getFechaExigibilidadCuota() {
        return fechaExigibilidadCuota;
    }

    public void setFechaExigibilidadCuota(LocalDate fechaExigibilidadCuota) {
        this.fechaExigibilidadCuota = fechaExigibilidadCuota;
    }

    public Integer getCodigoTipoSistemaAmortizacion() {
        return codigoTipoSistemaAmortizacion;
    }

    public void setCodigoTipoSistemaAmortizacion(Integer codigoTipoSistemaAmortizacion) {
        this.codigoTipoSistemaAmortizacion = codigoTipoSistemaAmortizacion;
    }
}
