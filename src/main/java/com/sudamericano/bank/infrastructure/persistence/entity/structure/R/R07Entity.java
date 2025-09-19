package com.sudamericano.bank.infrastructure.persistence.entity.structure.R;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "NESR07")
@Getter
@Setter
public class R07Entity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "TIPO_IDENTIFICACION_SUJETO", length = 1, nullable = false)
    private String tipoIdentificacionSujeto; // Caracter (1) - Tabla 4

    @Column(name = "IDENTIFICACION_SUJETO", length = 13, nullable = false)
    private String identificacionSujeto; // Caracter (13)

    @Column(name = "NUMERO_OPERACION", length = 32, nullable = false)
    private String numeroOperacion; // Caracter (32)

    @Column(name = "NUMERO_GARANTIA", length = 32, nullable = false)
    private String numeroGarantia; // Caracter (32)

    @Column(name = "TIPO_GARANTIA", length = 3, nullable = false)
    private String tipoGarantia; // Caracter (3) - Tabla 42

    @Column(name = "DESCRIPCION_GARANTIA", length = 120, nullable = false)
    private String descripcionGarantia; // Caracter (120)

    @Column(name = "UBICACION_GARANTIA_PAIS", length = 2, nullable = false)
    private String ubicacionGarantiaPais; // Caracter (2) - Tabla 5

    @Column(name = "UBICACION_GARANTIA_PROVINCIA", length = 2)
    private String ubicacionGarantiaProvincia; // Caracter (2) - Tabla 6

    @Column(name = "UBICACION_GARANTIA_CANTON", length = 2)
    private String ubicacionGarantiaCanton; // Caracter (2) - Tabla 7

    @Column(name = "VALOR_AVALUO_TITULO", precision = 15, scale = 2, nullable = false)
    private BigDecimal valorAvaluoTitulo; // Numérico (15,2)

    @Column(name = "FECHA_AVALUO", nullable = false)
    private LocalDate fechaAvaluo; // Fecha (dd/mm/aaaa)

    @Column(name = "NUMERO_REGISTRO_GARANTIA", length = 20)
    private String numeroRegistroGarantia; // Caracter (20)

    @Column(name = "FECHA_CONTABILIZACION_GARANTIA", nullable = false)
    private LocalDate fechaContabilizacionGarantia; // Fecha (dd/mm/aaaa)

    @Column(name = "PORCENTAJE_CUBRE_GARANTIA", precision = 5, scale = 2, nullable = false)
    private BigDecimal porcentajeCubreGarantia; // Numérico (5,2)

    @Column(name = "ESTADO_REGISTRO", length = 1, nullable = false)
    private String estadoRegistro; // Caracter (1) - Tabla 47
}
