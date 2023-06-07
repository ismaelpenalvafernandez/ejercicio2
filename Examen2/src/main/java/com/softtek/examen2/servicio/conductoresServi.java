package com.softtek.examen2.servicio;

import com.softtek.examen2.modelo.conductores;
import com.softtek.examen2.repositorio.Iconductores;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class conductoresServi implements IconductoresServi {
    @Autowired
    private Iconductores repo;
    @Override
    public List<conductores> ObtenerTodos() {
        return null;
    }
}