package com.softtek.examen2.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "visitas")
public class visitas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private int f_visitas;

    @OneToMany(mappedBy = "visitas")
    private List<autobuses> autobusesList;

    @OneToMany(mappedBy = "visitas")
    private List<conductores> conductoresList;

    @OneToMany(mappedBy = "visitas")
    private List<lugares> lugaresList;
}
