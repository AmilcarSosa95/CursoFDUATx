package com.formacion.dual.modelos;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "c_area")
public class Area {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_area")
    private Integer idArea;

    @Column
    private String nombre;


    @OneToMany(mappedBy = "area", fetch = FetchType.LAZY)
    private Set<Empleado> empleados;


    public Integer getIdArea() {
        return idArea;
    }

    public void setIdArea(Integer idArea) {
        this.idArea = idArea;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(Set<Empleado> empleados) {
        this.empleados = empleados;
    }
}
