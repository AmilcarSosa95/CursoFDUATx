package com.formacion.dual.modulos.empleado.controlador;

import com.formacion.dual.modulos.empleado.dto.EmpleadoDTO;
import com.formacion.dual.modulos.empleado.servicio.EmpleadoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("empleado")
public class EmpleadoControlador {

    @Autowired
    private EmpleadoServicio empleadoServicio;


    @GetMapping("obtener")
    public ResponseEntity<List<EmpleadoDTO>> obtenerEmpleados(){
        List<EmpleadoDTO> respuesta = empleadoServicio.obtenerEmpleado();
        return new ResponseEntity<>(respuesta, HttpStatus.OK);
    }

    @GetMapping("obtener/id")
    public ResponseEntity<EmpleadoDTO> obtenerEmpleados(@RequestParam Long idEmpleado){
        EmpleadoDTO respuesta = empleadoServicio.obtenerEmpleadoPorId(idEmpleado);
        return new ResponseEntity<>(respuesta, HttpStatus.OK);
    }

    @PostMapping("guardar")
    public ResponseEntity<Boolean> guardarEmpelado(@RequestBody EmpleadoDTO parametros){
        Boolean respuesta = empleadoServicio.guardarEmpelado(parametros);
        return new ResponseEntity<>(respuesta, HttpStatus.OK);
    }

    @PutMapping("actualizar")
    public ResponseEntity<Boolean> actualizarEmpleado(@RequestBody EmpleadoDTO parametros){
        Boolean respuesta = empleadoServicio.actualizarEmpleado(parametros);
        return new ResponseEntity<>(respuesta, HttpStatus.OK);
    }
    @DeleteMapping("eliminar")
    public ResponseEntity<Boolean> eliminarEmpleado(@RequestParam Long idEmpleado){
        Boolean respuesta = empleadoServicio.eliminarEmpleado(idEmpleado);
        return new ResponseEntity<>(respuesta, HttpStatus.OK);
    }

}