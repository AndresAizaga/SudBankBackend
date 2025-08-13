package com.sudamericano.bank.infrastructure.persistence.entity.catalog;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "T65")
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class T65Entity {
    @Id
    @GeneratedValue
    private int id;

    private String codigo;
    private String descripcion;
    private String sp;
    private String moodys;
    private String fitch;
    private String estado;

//    public T65Entity(int id, String codigo, String descripcion, String sustituida) {
//        this.id = id;
//        this.codigo = codigo;
//        this.descripcion = descripcion;
//        this.sustituida = sustituida;
//    }
}
