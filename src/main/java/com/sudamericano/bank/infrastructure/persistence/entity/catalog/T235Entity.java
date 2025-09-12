package com.sudamericano.bank.infrastructure.persistence.entity.catalog;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "T6")
@Getter
@NoArgsConstructor
public class T235Entity {
    @Id
    @GeneratedValue
    private int id;

    private String codigo;
    private String descripcion;
    private char estado;

    public T235Entity(String codigo, String descripcion, char estado) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.estado = estado;
    }

}
