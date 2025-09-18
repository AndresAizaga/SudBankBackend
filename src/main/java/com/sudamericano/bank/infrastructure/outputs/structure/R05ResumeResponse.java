package com.sudamericano.bank.infrastructure.outputs.structure;

import com.sudamericano.bank.infrastructure.outputs.ResponseDTO;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class R05ResumeResponse {

    private ResponseDTO tipoIdentificacion;
    private String identificacionSujeto;
    private String numeroOperacion;
    private ResponseDTO codigoTipoTransaccion;
    private String fechaCancelacion;
    private ResponseDTO codigoFormaCancelacion;
    private ResponseDTO codigoCalificacion;


}
