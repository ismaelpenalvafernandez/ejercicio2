package com.softtek.examen2.servicio;

import com.softtek.examen2.modelo.visitas;
import com.softtek.examen2.repositorio.Ivisitas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class visitasServi implements IvisitasServi {
    @Autowired
    private Ivisitas repo;

    @Override
    public List<visitas> findByautobuses(String matricula) {
        return repo.findByAutobuses(matricula);
    }

    @Override
    public List<visitas> findByconductores(String dni) {
        return repo.findByDni(dni);
    }

    @Override
    public List<visitas> findBylugares(Integer id_lugar) {
        return repo.findByid_lugar(id_lugar);
    }
}
