package com.formacion.dual.modelos;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "m_empleado")
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long idEmpleado;

    @Column
    private String nombre;

    @Column
    private String apellido;

    @Column
    private Date fechaNacimiento;

    @Column
    private Boolean registroActivo;

    @JoinColumn(name = "id_area")
    @ManyToOne(fetch = FetchType.LAZY)
    private Area area;


    public Long getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(Long idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Boolean getRegistroActivo() {
        return registroActivo;
    }

    public void setRegistroActivo(Boolean registroActivo) {
        this.registroActivo = registroActivo;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }
}
