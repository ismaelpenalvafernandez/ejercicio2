package com.softtek.examen2.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "autobuses")
public class autobuses {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String matricula;

    @Column(nullable = false, length = 60)
    private String a_fabricacion;

    @ManyToOne
    @JoinColumn(name = "visitas")
    private visitas visitas;
}
