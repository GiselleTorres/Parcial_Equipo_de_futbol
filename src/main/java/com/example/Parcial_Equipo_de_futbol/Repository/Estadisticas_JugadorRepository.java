package com.example.Parcial_Equipo_de_futbol.Repository;

import com.example.Parcial_Equipo_de_futbol.Model.Estadisticas_Jugador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Estadisticas_JugadorRepository extends JpaRepository<Estadisticas_Jugador, Integer> {
}
