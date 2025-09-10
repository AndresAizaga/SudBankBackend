package com.sudamericano.bank.infrastructure.outputs.persistence.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "T317")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CatalogT317Entity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "codigo")
    private String codigo;
    
    @Column(name = "descripcion")
    private String descripcion;
}
