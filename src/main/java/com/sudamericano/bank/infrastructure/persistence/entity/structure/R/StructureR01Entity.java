package com.sudamericano.bank.infrastructure.persistence.entity.structure.R;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "NESR01")
public class StructureR01Entity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "CODIGO_TIPO_IDENTIFICACION")
    private Integer codigoTipoIdentificacion;

    @Column(name = "IDENTIFICACION_SUJETO")
    private String identificacionSujeto;

    @Column(name = "CODIGO_CLASE_SUJETO")
    private Integer codigoClaseSujeto;

    @Column(name = "CODIGO_ACTIVIDAD_ECONOMICA")
    private Integer codigoActividadEconomica;

    @Column(name = "PATRIMONIO_SUJETO")
    private BigDecimal patrimonioSujeto;

    @Column(name = "FECHA_ACTUALIZACION_PATRIMONIO")
    private LocalDate fechaActualizacionPatrimonio;

    @Column(name = "CODIGO_CAUSAL_VINCULACION")
    private Integer codigoCausalVinculacion;

    @Column(name = "CODIGO_PROVINCIA")
    private Integer codigoProvincia;

    @Column(name = "CODIGO_CANTON")
    private Integer codigoCanton;

    @Column(name = "CODIGO_PARROQUIA")
    private Integer codigoParroquia;

    @Column(name = "CODIGO_GENERO")
    private Integer codigoGenero;

    @Column(name = "CODIGO_ESTADO_CIVIL")
    private Integer codigoEstadoCivil;

    @Column(name = "CODIGO_NIVEL_ESTUDIOS")
    private Integer codigoNivelEstudios;

    @Column(name = "CODIGO_PROFESION")
    private Integer codigoProfesion;

    @Column(name = "CODIGO_TIPO_VIVIENDA")
    private Integer codigoTipoVivienda;

    @Column(name = "VALOR_VIVIENDA")
    private BigDecimal valorVivienda;

    @Column(name = "TIEMPO_RESIDENCIA_ACTUAL")
    private Integer tiempoResidenciaActual;

    @Column(name = "CODIGO_RELACION_DEPENDENCIA")
    private Integer codigoRelacionDependencia;

    @Column(name = "TIEMPO_ULTIMO_TRABAJO")
    private Integer tiempoUltimoTrabajo;

    @Column(name = "FECHA_INICIO_TRABAJO_ANTERIOR")
    private LocalDate fechaInicioTrabajoAnterior;

    @Column(name = "FECHA_SALIDA_TRABAJO_ANTERIOR")
    private LocalDate fechaSalidaTrabajoAnterior;

    @Column(name = "CARGAS_FAMILIARES")
    private Integer cargasFamiliares;

    @Column(name = "CODIGO_ORIGEN_INGRESOS")
    private Integer codigoOrigenIngresos;

    @Column(name = "TIEMPO_CLIENTE_IFI")
    private Integer tiempoClienteIfi;

    @Column(name = "FECHA_CREACION")
    private LocalDateTime fechaCreacion;

    @Column(name = "USUARIO_CREACION")
    private String usuarioCreacion;

    @Column(name = "FECHA_MODIFICACION")
    private LocalDateTime fechaModificacion;

    @Column(name = "USUARIO_MODIFICACION")
    private String usuarioModificacion;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCodigoTipoIdentificacion() {
        return codigoTipoIdentificacion;
    }

    public void setCodigoTipoIdentificacion(Integer codigoTipoIdentificacion) {
        this.codigoTipoIdentificacion = codigoTipoIdentificacion;
    }

    public String getIdentificacionSujeto() {
        return identificacionSujeto;
    }

    public void setIdentificacionSujeto(String identificacionSujeto) {
        this.identificacionSujeto = identificacionSujeto;
    }

    public Integer getCodigoClaseSujeto() {
        return codigoClaseSujeto;
    }

    public void setCodigoClaseSujeto(Integer codigoClaseSujeto) {
        this.codigoClaseSujeto = codigoClaseSujeto;
    }

    public Integer getCodigoActividadEconomica() {
        return codigoActividadEconomica;
    }

    public void setCodigoActividadEconomica(Integer codigoActividadEconomica) {
        this.codigoActividadEconomica = codigoActividadEconomica;
    }

    public BigDecimal getPatrimonioSujeto() {
        return patrimonioSujeto;
    }

    public void setPatrimonioSujeto(BigDecimal patrimonioSujeto) {
        this.patrimonioSujeto = patrimonioSujeto;
    }

    public LocalDate getFechaActualizacionPatrimonio() {
        return fechaActualizacionPatrimonio;
    }

    public void setFechaActualizacionPatrimonio(LocalDate fechaActualizacionPatrimonio) {
        this.fechaActualizacionPatrimonio = fechaActualizacionPatrimonio;
    }

    public Integer getCodigoCausalVinculacion() {
        return codigoCausalVinculacion;
    }

    public void setCodigoCausalVinculacion(Integer codigoCausalVinculacion) {
        this.codigoCausalVinculacion = codigoCausalVinculacion;
    }

    public Integer getCodigoProvincia() {
        return codigoProvincia;
    }

    public void setCodigoProvincia(Integer codigoProvincia) {
        this.codigoProvincia = codigoProvincia;
    }

    public Integer getCodigoCanton() {
        return codigoCanton;
    }

    public void setCodigoCanton(Integer codigoCanton) {
        this.codigoCanton = codigoCanton;
    }

    public Integer getCodigoParroquia() {
        return codigoParroquia;
    }

    public void setCodigoParroquia(Integer codigoParroquia) {
        this.codigoParroquia = codigoParroquia;
    }

    public Integer getCodigoGenero() {
        return codigoGenero;
    }

    public void setCodigoGenero(Integer codigoGenero) {
        this.codigoGenero = codigoGenero;
    }

    public Integer getCodigoEstadoCivil() {
        return codigoEstadoCivil;
    }

    public void setCodigoEstadoCivil(Integer codigoEstadoCivil) {
        this.codigoEstadoCivil = codigoEstadoCivil;
    }

    public Integer getCodigoNivelEstudios() {
        return codigoNivelEstudios;
    }

    public void setCodigoNivelEstudios(Integer codigoNivelEstudios) {
        this.codigoNivelEstudios = codigoNivelEstudios;
    }

    public Integer getCodigoProfesion() {
        return codigoProfesion;
    }

    public void setCodigoProfesion(Integer codigoProfesion) {
        this.codigoProfesion = codigoProfesion;
    }

    public Integer getCodigoTipoVivienda() {
        return codigoTipoVivienda;
    }

    public void setCodigoTipoVivienda(Integer codigoTipoVivienda) {
        this.codigoTipoVivienda = codigoTipoVivienda;
    }

    public BigDecimal getValorVivienda() {
        return valorVivienda;
    }

    public void setValorVivienda(BigDecimal valorVivienda) {
        this.valorVivienda = valorVivienda;
    }

    public Integer getTiempoResidenciaActual() {
        return tiempoResidenciaActual;
    }

    public void setTiempoResidenciaActual(Integer tiempoResidenciaActual) {
        this.tiempoResidenciaActual = tiempoResidenciaActual;
    }

    public Integer getCodigoRelacionDependencia() {
        return codigoRelacionDependencia;
    }

    public void setCodigoRelacionDependencia(Integer codigoRelacionDependencia) {
        this.codigoRelacionDependencia = codigoRelacionDependencia;
    }

    public Integer getTiempoUltimoTrabajo() {
        return tiempoUltimoTrabajo;
    }

    public void setTiempoUltimoTrabajo(Integer tiempoUltimoTrabajo) {
        this.tiempoUltimoTrabajo = tiempoUltimoTrabajo;
    }

    public LocalDate getFechaInicioTrabajoAnterior() {
        return fechaInicioTrabajoAnterior;
    }

    public void setFechaInicioTrabajoAnterior(LocalDate fechaInicioTrabajoAnterior) {
        this.fechaInicioTrabajoAnterior = fechaInicioTrabajoAnterior;
    }

    public LocalDate getFechaSalidaTrabajoAnterior() {
        return fechaSalidaTrabajoAnterior;
    }

    public void setFechaSalidaTrabajoAnterior(LocalDate fechaSalidaTrabajoAnterior) {
        this.fechaSalidaTrabajoAnterior = fechaSalidaTrabajoAnterior;
    }

    public Integer getCargasFamiliares() {
        return cargasFamiliares;
    }

    public void setCargasFamiliares(Integer cargasFamiliares) {
        this.cargasFamiliares = cargasFamiliares;
    }

    public Integer getCodigoOrigenIngresos() {
        return codigoOrigenIngresos;
    }

    public void setCodigoOrigenIngresos(Integer codigoOrigenIngresos) {
        this.codigoOrigenIngresos = codigoOrigenIngresos;
    }

    public Integer getTiempoClienteIfi() {
        return tiempoClienteIfi;
    }

    public void setTiempoClienteIfi(Integer tiempoClienteIfi) {
        this.tiempoClienteIfi = tiempoClienteIfi;
    }

    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDateTime fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getUsuarioCreacion() {
        return usuarioCreacion;
    }

    public void setUsuarioCreacion(String usuarioCreacion) {
        this.usuarioCreacion = usuarioCreacion;
    }

    public LocalDateTime getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(LocalDateTime fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    public String getUsuarioModificacion() {
        return usuarioModificacion;
    }

    public void setUsuarioModificacion(String usuarioModificacion) {
        this.usuarioModificacion = usuarioModificacion;
    }
}
