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
public class Partido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPartido;
    private LocalDate fecha;
    private String estadio;
    private Integer golesLocal;
    private Integer golesVisita;

    @ManyToOne
    @JoinColumn(name = "equipo_local")
    private Equipo equipoLocal;

    @ManyToOne
    @JoinColumn(name = "equipo_visita")
    private Equipo equipoVisita;

    @OneToMany(mappedBy = "partido")
    private List<Estadisticas_Jugador> estadisticas;
}
