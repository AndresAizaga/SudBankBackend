package com.sudamericano.bank.infrastructure.outputs.structure;

import com.sudamericano.bank.infrastructure.outputs.ResponseDTO;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class R22ResumenResponse {
    private ResponseDTO codigoTipoIdentificado;
    private String identificacionSujeto;
    private String numeroTarjeta;
    private Integer diasMorasidad;
    private ResponseDTO calificacionPropia;
    private ResponseDTO calificacionHomologada;
}
