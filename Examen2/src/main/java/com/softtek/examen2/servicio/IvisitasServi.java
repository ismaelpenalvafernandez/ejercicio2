package com.softtek.examen2.servicio;

import com.softtek.examen2.modelo.visitas;

import java.util.List;

public interface IvisitasServi {
    List<visitas> findByautobuses(String matricula);

    List<visitas> findByconductores(String dni);

    List<visitas> findBylugares(Integer id_lugar);

}