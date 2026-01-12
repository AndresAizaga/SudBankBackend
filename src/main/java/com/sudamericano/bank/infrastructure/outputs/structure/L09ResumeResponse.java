package com.sudamericano.bank.infrastructure.outputs.structure;

import com.sudamericano.bank.infrastructure.outputs.ResponseDTO;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class L09ResumeResponse {
    public String codigoProducto;
    public String descripcionProducto;
    public ResponseDTO codigoFondoInversion;
    public ResponseDTO estadoRegistro;
}
