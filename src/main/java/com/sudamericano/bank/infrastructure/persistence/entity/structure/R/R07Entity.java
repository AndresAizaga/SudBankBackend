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

    @Column(name = "CODIGO_TIPO_IDENTIFICACION", nullable = false)
    private Integer codigoTipoIdentificacion; // FK T4 (ID)

    @Column(name = "IDENTIFICACION_SUJETO", length = 13, nullable = false)
    private String identificacionSujeto; // Caracter (13)

    @Column(name = "NUMERO_OPERACION", length = 32, nullable = false)
    private String numeroOperacion; // Caracter (32)

    @Column(name = "NUMERO_GARANTIA", length = 32, nullable = false)
    private String numeroGarantia; // Caracter (32)

    @Column(name = "CODIGO_TIPO_GARANTIA", nullable = false)
    private Integer tipoGarantia; // FK T42 (ID)

    @Column(name = "DESCRIPCION_GARANTIA", length = 120, nullable = false)
    private String descripcionGarantia; // Caracter (120)

    @Column(name = "CODIGO_PAIS", nullable = false)
    private Integer ubicacionGarantiaPais; // FK T5 (ID)

    @Column(name = "CODIGO_PROVINCIA")
    private Integer ubicacionGarantiaProvincia; // FK T6 (ID)

    @Column(name = "CODIGO_CANTON")
    private Integer ubicacionGarantiaCanton; // FK T7 (ID)

    @Column(name = "VALOR_AVALUO", precision = 15, scale = 2, nullable = false)
    private BigDecimal valorAvaluoTitulo; // Numérico (15,2)

    @Column(name = "FECHA_AVALUO", nullable = false)
    private String fechaAvaluo; // varchar(10) dd/mm/aaaa (igual a DB)

    @Column(name = "NUMERO_REGISTRO_GARANTIA", length = 20)
    private String numeroRegistroGarantia; // Caracter (20)

    @Column(name = "FECHA_CONTABILIZACION_GARANTIA", nullable = false)
    private String fechaContabilizacionGarantia; // varchar(10) dd/mm/aaaa (igual a DB)

    @Column(name = "PORCENTAJE_GARANTIA", precision = 5, scale = 2, nullable = false)
    private BigDecimal porcentajeCubreGarantia; // Numérico (5,2)

    @Column(name = "CODIGO_ESTADO_REGISTRO", nullable = false)
    private Integer estadoRegistro; // FK T47 (ID)
}
