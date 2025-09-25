package com.sudamericano.bank.domain.model.structure.R;

import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class R07Dto {

    private Long id;
    private Integer codigoTipoIdentificacion;
    private String identificacionSujeto;
    private String numeroOperacion;
    private String numeroGarantia;
    private Integer tipoGarantia;
    private String descripcionGarantia;
    private Integer ubicacionGarantiaPais;
    private Integer ubicacionGarantiaProvincia;
    private Integer ubicacionGarantiaCanton;
    private BigDecimal valorAvaluoTitulo;
    private String fechaAvaluo;
    private String numeroRegistroGarantia;
    private String fechaContabilizacionGarantia;
    private BigDecimal porcentajeCubreGarantia;
    private Integer estadoRegistro;
}