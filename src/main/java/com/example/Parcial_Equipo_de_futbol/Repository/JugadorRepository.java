package com.example.Parcial_Equipo_de_futbol.Repository;

import com.example.Parcial_Equipo_de_futbol.Model.Jugador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JugadorRepository extends JpaRepository<Jugador, Integer> {

    @Query(value = "SELECT * FROM jugador WHERE id_equipo = :idEquipo", nativeQuery = true)
    List<Jugador> findByEquipo(@Param("idEquipo") Integer idEquipo);

    @Query(value = "SELECT * FROM jugador j JOIN estadistica_jugador e ON j.id_jugador = e.id_jugador WHERE e.goles > :goles", nativeQuery = true)
    List<Jugador> findByGolesMayores(@Param("goles") int goles);
}


