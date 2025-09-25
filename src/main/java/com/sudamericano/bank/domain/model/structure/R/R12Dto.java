package com.sudamericano.bank.domain.model.structure.R;

public class R12Dto{
    private Integer id;
    private Integer tipoIdentificacion;
    private String nombreGrupoEconomico;
    private String identificacionIntegrante;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombreGrupoEconomico() {
        return nombreGrupoEconomico;
    }

    public void setNombreGrupoEconomico(String nombreGrupoEconomico) {
        this.nombreGrupoEconomico = nombreGrupoEconomico;
    }

    public Integer getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public void setTipoIdentificacion(Integer tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

    public String getIdentificacionIntegrante() {
        return identificacionIntegrante;
    }

    public void setIdentificacionIntegrante(String identificacionIntegrante) {
        this.identificacionIntegrante = identificacionIntegrante;
    }
}
