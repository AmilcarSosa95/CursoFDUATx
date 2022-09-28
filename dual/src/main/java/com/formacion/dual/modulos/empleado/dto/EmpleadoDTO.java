package com.formacion.dual.modulos.empleado.dto;

import java.sql.Date;
import java.text.DateFormat;

public class EmpleadoDTO {

    private Long empleadoId;
    private String empleado;

    private String apellido;

    private Date fecha;

    public EmpleadoDTO() {
        super();
    }


    public EmpleadoDTO(Long empleadoId, String empleado) {
        this.empleadoId = empleadoId;
        this.empleado = empleado;
    }

    public EmpleadoDTO(Long empleadoId, String empleado, String apellido, Date fecha) {
        this.empleadoId = empleadoId;
        this.empleado = empleado;
        this.apellido = apellido;
        this.fecha = fecha;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Long getEmpleadoId() {
        return empleadoId;
    }

    public void setEmpleadoId(Long empleadoId) {
        this.empleadoId = empleadoId;
    }

    public String getEmpleado() {
        return empleado;
    }

    public void setEmpleado(String empleado) {
        this.empleado = empleado;
    }
}
