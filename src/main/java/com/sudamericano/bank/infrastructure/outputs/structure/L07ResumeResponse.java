package com.sudamericano.bank.infrastructure.outputs.structure;

import com.sudamericano.bank.infrastructure.outputs.ResponseDTO;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class L07ResumeResponse {
    public ResponseDTO tipoIdentificacionEmisor;
    public String identificacionEmisor;
    public ResponseDTO nacionalidadEmisor;
    public ResponseDTO tipoEmisor;
}
