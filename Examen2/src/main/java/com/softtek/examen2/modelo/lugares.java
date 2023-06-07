package com.softtek.examen2.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "lugares")
public class lugares {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_lugar;

    @Column(nullable = false, length = 60)
    private String nombre;

    @ManyToOne
    @JoinColumn(name = "visitas")
    private visitas visitas;
}
