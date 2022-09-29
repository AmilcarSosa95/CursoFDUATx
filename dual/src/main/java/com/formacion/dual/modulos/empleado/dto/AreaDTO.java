package com.formacion.dual.modulos.empleado.dto;

import com.formacion.dual.modelos.Area;

public class AreaDTO {
    private Integer idArea;
    private String descripcion;

    public AreaDTO(Integer idArea, String descripcion) {
        this.idArea = idArea;
        this.descripcion = descripcion;
    }

    public AreaDTO(Area area) {
        if (area != null){
            this.idArea = area.getIdArea();
            this.descripcion = area.getNombre();
        }
    }

    public Integer getIdArea() {
        return idArea;
    }

    public void setIdArea(Integer idArea) {
        this.idArea = idArea;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
