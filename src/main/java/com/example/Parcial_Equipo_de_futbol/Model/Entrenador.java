package com.example.Parcial_Equipo_de_futbol.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Entrenador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idEntrenador;
    private String nombre;
    private String especialidad;

    @ManyToOne
    @JoinColumn(name = "id_equipo")
    private Equipo equipo;
}
