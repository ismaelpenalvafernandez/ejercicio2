package com.softtek.examen2.servicio;

import com.softtek.examen2.modelo.autobuses;
import com.softtek.examen2.repositorio.Iautobuses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class autobusesServi implements IautobusesServi {
    @Autowired
    private Iautobuses repo;
    @Override
    public List<autobuses> ObtenerTodos() {
        return null;
    }
}