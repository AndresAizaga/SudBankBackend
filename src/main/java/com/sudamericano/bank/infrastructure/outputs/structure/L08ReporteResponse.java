package com.sudamericano.bank.infrastructure.outputs.structure;

import com.sudamericano.bank.infrastructure.outputs.ReportDto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
public class L08ReporteResponse {
    private ReportDto codigoLiquidez;
    private ReportDto tipoIdentificacionEntidad;
    private String identificacionEntidad;
    private ReportDto tipoInstrumento;
    private ReportDto calificacionEntidad;
    private ReportDto calificadoraRiesgo;

    private BigDecimal lunes;
    private BigDecimal martes;
    private BigDecimal miercoles;
    private BigDecimal jueves;
    private BigDecimal viernes;

    public L08ReporteResponse(ReportDto codigoLiquidez, ReportDto tipoIdentificacionEntidad,
                              String identificacionEntidad, ReportDto tipoInstrumento, ReportDto calificacionEntidad,
                              ReportDto calificadoraRiesgo, BigDecimal lunes, BigDecimal martes, BigDecimal miercoles,
                              BigDecimal jueves, BigDecimal viernes) {
        this.codigoLiquidez = codigoLiquidez;
        this.tipoIdentificacionEntidad = tipoIdentificacionEntidad;
        this.identificacionEntidad = identificacionEntidad;
        this.tipoInstrumento = tipoInstrumento;
        this.calificacionEntidad = calificacionEntidad;
        this.calificadoraRiesgo = calificadoraRiesgo;
        this.lunes = lunes;
        this.martes = martes;
        this.miercoles = miercoles;
        this.jueves = jueves;
        this.viernes = viernes;
    }


}
