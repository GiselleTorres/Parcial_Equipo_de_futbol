package com.example.Parcial_Equipo_de_futbol.Repository;

import com.example.Parcial_Equipo_de_futbol.Model.Jugador;
import com.example.Parcial_Equipo_de_futbol.Model.Partido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PartidoRepository extends JpaRepository<Partido, Integer> {

    @Query(value = "SELECT SUM(goles_local) FROM partido WHERE equipo_local = :idEquipo UNION ALL SELECT SUM(goles_visita) FROM partido WHERE equipo_visita = :idEquipo", nativeQuery = true)
    List<Integer> totalGolesPorEquipo(@Param("idEquipo") Integer idEquipo);

    @Query(value = "SELECT p.id_partido, p.fecha, el.nombre AS equipo_local, ev.nombre AS equipo_visita, p.goles_local, p.goles_visita FROM partido p JOIN equipo el ON p.equipo_local = el.id_equipo JOIN equipo ev ON p.equipo_visita = ev.id_equipo", nativeQuery = true)
    List<Object[]> obtenerResultadosPartidos();

}
