package com.sudamericano.bank.infrastructure.persistence.entity.structure.R;

import jakarta.persistence.*;

@Entity
@Table(name = "NESR04")
public class R04Entity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "CODIGO_TIPO_IDENTIFICACION")
    private Integer codigoTipoIdentificacion;

    @Column(name = "IDENTIFICACION_SUJETO")
    private String identificacionSujeto;

    @Column(name = "NUMERO_OPERACION")
    private String numeroOperacion;

    @Column(name = "DIAS_MOROSIDAD")
    private Integer diasMorosidad;

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

    public Integer getDiasMorosidad() {
        return diasMorosidad;
    }

    public void setDiasMorosidad(Integer diasMorosidad) {
        this.diasMorosidad = diasMorosidad;
    }
}