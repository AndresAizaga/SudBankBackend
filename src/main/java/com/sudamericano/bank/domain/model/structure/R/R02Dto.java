package com.sudamericano.bank.domain.model.structure.R;

public class R02Dto {
    private Integer id;
    private Integer codigoTipoIdentificacion;
    private String identificacionSujeto;
    private String numeroOperacion;
    private String valorOperacion;

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

    public String getValorOperacion() {
        return valorOperacion;
    }

    public void setValorOperacion(String valorOperacion) {
        this.valorOperacion = valorOperacion;
    }
}
