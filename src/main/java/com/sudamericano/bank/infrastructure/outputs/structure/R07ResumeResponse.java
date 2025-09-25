package com.sudamericano.bank.infrastructure.outputs.structure;

import com.sudamericano.bank.infrastructure.outputs.ResponseDTO;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
public class R07ResumeResponse {
    public ResponseDTO tipoIdentificacion;
    public String identificacionSujeto;
    public String numeroOperacion;
    public String numeroGarantia;
    public ResponseDTO tipoGarantia;
    public String descripcionGarantia;
    public ResponseDTO ubicacionGarantiaPais;
    public ResponseDTO ubicacionGarantiaProvincia;
    public ResponseDTO ubicacionGarantiaCanton;
    public BigDecimal valorAvaluoTitulo;
    public String fechaAvaluo;
    public String numeroRegistroGarantia;
    public String fechaContabilizacionGarantia;
    public BigDecimal porcentajeCubreGarantia;
    public ResponseDTO estadoRegistro;
}
