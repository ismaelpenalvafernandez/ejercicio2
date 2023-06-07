package com.softtek.examen2.servicio;

import com.softtek.examen2.modelo.lugares;
import com.softtek.examen2.repositorio.Ilugares;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class lugaresServi implements IlugaresServi {
    @Autowired
    private Ilugares repo;
    @Override
    public List<lugares> ObtenerTodos() {
        return null;
    }
}