package com.sudamericano.bank.domain.model.structure.R;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
public class R07Dto {
    private Long id;
    private String tipoIdentificacionSujeto; // Caracter (1) - Tabla 4
    private String identificacionSujeto; // Caracter (13)
    private String numeroOperacion; // Caracter (32)
    private String numeroGarantia; // Caracter (32)
    private String tipoGarantia; // Caracter (3) - Tabla 42
    private String descripcionGarantia; // Caracter (120)
    private String ubicacionGarantiaPais; // Caracter (2) - Tabla 5
    private String ubicacionGarantiaProvincia; // Caracter (2) - Tabla 6
    private String ubicacionGarantiaCanton; // Caracter (2) - Tabla 7
    private BigDecimal valorAvaluoTitulo; // Numérico (15,2)
    private LocalDate fechaAvaluo; // Fecha (dd/mm/aaaa)
    private String numeroRegistroGarantia; // Caracter (20)
    private LocalDate fechaContabilizacionGarantia; // Fecha (dd/mm/aaaa)
    private BigDecimal porcentajeCubreGarantia; // Numérico (5,2)
    private String estadoRegistro; // Caracter (1) - Tabla 47
}
