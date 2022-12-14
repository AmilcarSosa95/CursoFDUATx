package com.formacion.dual.repositorios;

import com.formacion.dual.modelos.Area;
import com.formacion.dual.modelos.Empleado;
import com.formacion.dual.modulos.empleado.dto.EmpleadoDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmpleadoRepositorio extends JpaRepository<Empleado,Long> {
   @Query("select e from Empleado as e " +
           "where e.registroActivo = true")
    List<Empleado> obtenerEmpleadoActivos();

    @Query("select e from Empleado as e " +
            "join fetch e.area a " +
            "where e.registroActivo = true ")
   List<Empleado> findAll();

    @Query("select new  com.formacion.dual.modulos.empleado.dto.EmpleadoDTO(e.idEmpleado,e.nombre) from Empleado as e " +
            "where e.registroActivo = true ")
    List<EmpleadoDTO> obtenerEmpleadoActivosDTO();
   List<Empleado> findAllByRegistroActivoIsTrue();


   @Query("select e from Empleado e where e.area.idArea = :idArea and e.registroActivo = true")
    List<Empleado> obtenerEmpeladosPorArea(@Param("idArea") Integer idArea);

//    List<Empleado> findAllByArea(Area area);
}
