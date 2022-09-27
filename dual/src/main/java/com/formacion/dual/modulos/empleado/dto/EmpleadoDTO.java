package com.formacion.dual.modulos.empleado.dto;

public class EmpleadoDTO {

    private Long empleadoId;
    private String empleado;

    public EmpleadoDTO() {
        super();
    }

    public EmpleadoDTO(Long empleadoId, String empleado) {
        this.empleadoId = empleadoId;
        this.empleado = empleado;
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
