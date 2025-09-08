package com.sudamericano.bank.infrastructure.persistence.entity.structure.R;

import jakarta.persistence.*;

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
    @Column(name = "VALOR_OPERACION")
    private String valorOperacion;

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

    public String getValorOperacion() {
        return valorOperacion;
    }

    public void setValorOperacion(String valorOperacion) {
        this.valorOperacion = valorOperacion;
    }
}
