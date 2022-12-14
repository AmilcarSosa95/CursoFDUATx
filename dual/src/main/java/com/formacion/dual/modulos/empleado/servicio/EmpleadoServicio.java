package com.formacion.dual.modulos.empleado.servicio;

import com.formacion.dual.modelos.Area;
import com.formacion.dual.modelos.Empleado;
import com.formacion.dual.modulos.empleado.dto.EmpleadoDTO;
import com.formacion.dual.repositorios.AreaRespositorio;
import com.formacion.dual.repositorios.EmpleadoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class EmpleadoServicio {

    @Autowired
    private EmpleadoRepositorio empleadoRepositorio;

    @Autowired
    private AreaRespositorio areaRespositorio;


    public List<EmpleadoDTO> obtenerEmpleado(){

//        return empleadoRepositorio.obtenerEmpleadoActivosDTO();
        List<Empleado> lista = empleadoRepositorio.findAll();
        return  lista.stream().map(EmpleadoDTO::new).collect(Collectors.toList());
    }

    public EmpleadoDTO obtenerEmpleadoPorId(Long idEmpleado){
        Optional<Empleado> empleado = empleadoRepositorio.findById(idEmpleado);

        if (empleado.isPresent()){
            return new EmpleadoDTO(empleado.get().getIdEmpleado(), empleado.get().getNombre());
        }

        return null;
    }

    public Boolean guardarEmpelado(EmpleadoDTO parametros) {

        Empleado empleado = new Empleado();

        if (parametros.getEmpleadoId() != null){
            empleado = empleadoRepositorio.getOne(parametros.getEmpleadoId());
        }


        empleado.setNombre(parametros.getEmpleado());
        empleado.setFechaNacimiento(parametros.getFecha());
        empleado.setApellido(parametros.getApellido());

        empleadoRepositorio.save(empleado);


        return true;
    }

    public Boolean actualizarEmpleado(EmpleadoDTO parametros) {

        Empleado empleado = empleadoRepositorio.getOne(parametros.getEmpleadoId());
        empleado.setNombre(parametros.getEmpleado());
        empleado.setFechaNacimiento(parametros.getFecha());
        empleado.setApellido(parametros.getApellido());

        empleadoRepositorio.save(empleado);


        return true;
    }

    public Boolean eliminarEmpleado(Long idEmpleado) {
        Empleado empleado = empleadoRepositorio.getOne(idEmpleado);
        empleadoRepositorio.delete(empleado);
        return true;
    }

    public Boolean activarInactivar(Long idEmpleado) {
        Empleado empleado = empleadoRepositorio.getOne(idEmpleado);
        empleado.setRegistroActivo(!empleado.getRegistroActivo());
        empleadoRepositorio.save(empleado);
        return true;
    }

    public List<EmpleadoDTO> obtenerEmpleadoPorArea(Integer idArea) {
        List<Empleado> lista =  empleadoRepositorio.obtenerEmpeladosPorArea(idArea);
        return  lista.stream().map(EmpleadoDTO::new).collect(Collectors.toList());
    }
}
