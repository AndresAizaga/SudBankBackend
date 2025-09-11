package com.sudamericano.bank.infrastructure.outputs;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CatalogResponse {
    private Integer id;
    private String codigo;
    private String descripcion;
}


