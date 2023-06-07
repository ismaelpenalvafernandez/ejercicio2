package com.softtek.examen2.repositorio;

import com.softtek.examen2.modelo.visitas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface Ivisitas extends JpaRepository<visitas, Long> {
    @Query("FROM visitas v WHERE v.autobuses.matricula = :matricula")
    List<visitas> findByAutobuses(@Param("matricula") String matricula);

    @Query("FROM visitas v WHERE v.conductores.conductores >:dni")
    List<visitas> findByDni(@Param("dni") String dni);

    @Query("FROM visitas v WHERE v.lugares.lugares >:id_lugar")
    List<visitas> findByid_lugar(@Param("id_lugar") Integer id_lugar);
}
