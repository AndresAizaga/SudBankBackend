package com.sudamericano.bank.infrastructure.persistence.entity.catalog;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "T3")
@Getter
@Setter
@NoArgsConstructor
public class T3Entity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "CODIGO")
    private String codigo;

    @Column(name = "DESCRIPCION")
    private String descripcion;

    @Column(name = "TIPO")
    private String tipo;

    @Column(name = "CODIGO_PARRROQUIA")
    private Integer codigoParrroquia;

    @Column(name = "DIRECCION")
    private String direccion;

    @Column(name = "TELEFONO")
    private String telefono;

    @Column(name= "ESTADO")
    private Integer estado;

    public T3Entity(String codigo, String descripcion, String tipo, Integer codigoParrroquia, String direccion, String telefono, Integer estado) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.codigoParrroquia = codigoParrroquia;
        this.direccion = direccion;
        this.telefono = telefono;
        this.estado = estado;
    }

}
