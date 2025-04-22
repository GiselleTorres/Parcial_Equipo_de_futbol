package com.example.Parcial_Equipo_de_futbol.Repository;

import com.example.Parcial_Equipo_de_futbol.Model.Equipo;
import com.example.Parcial_Equipo_de_futbol.Model.Jugador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EquipoRepository extends JpaRepository<Equipo, Integer> {
}
