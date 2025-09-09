package com.sudamericano.bank.infrastructure.outputs.structure;

import com.sudamericano.bank.infrastructure.outputs.ResponseDTO;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class R04ResumeResponse {
    public ResponseDTO tipoIdentificacion;
    public String identificacionSujeto;
    public String numeroOperacion;
    public Integer diasMorosidad;
}

