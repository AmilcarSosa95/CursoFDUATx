package com.formacion.dual.modulos.empleado.dto;

import com.formacion.dual.modelos.Area;
import com.formacion.dual.modelos.Empleado;

import java.sql.Date;

public class EmpleadoDTO {

    private Long empleadoId;
    private String empleado;

    private String apellido;

    private Date fecha;

    private AreaDTO area;

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


    public EmpleadoDTO(Long empleadoId, String empleado, String apellido, Date fecha, Area area) {
        this.empleadoId = empleadoId;
        this.empleado = empleado;
        this.apellido = apellido;
        this.fecha = fecha;
        if (area != null){
            this.area = new AreaDTO(area.getIdArea(), area.getNombre());
        }
    }

    public EmpleadoDTO(Empleado e) {
        this.empleadoId = e.getIdEmpleado();
        this.empleado = e.getNombre();
        this.apellido = e.getApellido();
        this.fecha = e.getFechaNacimiento();
        this.area = new AreaDTO(e.getArea());
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


    public AreaDTO getArea() {
        return area;
    }

    public void setArea(AreaDTO area) {
        this.area = area;
    }
}
