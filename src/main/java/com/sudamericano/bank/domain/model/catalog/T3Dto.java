package com.sudamericano.bank.domain.model.catalog;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class T3Dto {

    private int id;
    private String codigo;
    private String descripcion;
    private String tipo;
    private Integer codigoParrroquia;
    private String direccion;
    private String telefono;
    private Integer estado;


}
