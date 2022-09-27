package com.formacion.dual.modulos.empleado.controlador;

import com.formacion.dual.modulos.empleado.dto.EmpleadoDTO;
import com.formacion.dual.modulos.empleado.servicio.EmpleadoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
}
//localhost:9000/empleado/obtener/algomas