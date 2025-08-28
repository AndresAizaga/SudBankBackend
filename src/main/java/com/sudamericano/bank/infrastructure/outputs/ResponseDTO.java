package com.sudamericano.bank.infrastructure.outputs;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResponseDTO{
    public Integer code;
    public String description;
    public ResponseDTO(Integer code, String description) {
        this.code = code;
        this.description = description;
    }
}
