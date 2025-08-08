package com.sudamericano.bank.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@AllArgsConstructor
public class CatalogT164 {
    public int id;
    public String codigo;
    public String descripcion;
}
