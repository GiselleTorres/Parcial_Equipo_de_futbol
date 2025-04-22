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
public class Estadisticas_Jugador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idEstadistica;
    private Integer minutosJugados;
    private Integer goles;
    private Integer asistencias;
    private Integer tarjetasAmarillas;
    private Integer tarjetasRojas;

    @ManyToOne
    @JoinColumn(name = "id_jugador")
    private Jugador jugador;

    @ManyToOne
    @JoinColumn(name = "id_partido")
    private Partido partido;

}
