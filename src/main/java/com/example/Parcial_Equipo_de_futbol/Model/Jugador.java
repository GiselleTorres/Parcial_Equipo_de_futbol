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
public class Jugador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idJugador;
    private String nombre;
    private String posicion;
    private Integer dorsal;
    private LocalDate fechaNac;
    private String nacionalidad;

    @ManyToOne
    @JoinColumn(name = "id_equipo")
    private Equipo equipo;

    @OneToMany(mappedBy = "jugador")
    private List<Estadisticas_Jugador> estadisticas;
}
