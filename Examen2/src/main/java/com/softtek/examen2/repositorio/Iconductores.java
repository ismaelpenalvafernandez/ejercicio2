package com.softtek.examen2.repositorio;

import com.softtek.examen2.modelo.autobuses;
import com.softtek.examen2.modelo.conductores;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Iconductores extends JpaRepository<conductores, String> {
}
