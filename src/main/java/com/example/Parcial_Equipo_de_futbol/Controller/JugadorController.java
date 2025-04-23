package com.example.Parcial_Equipo_de_futbol.Controller;

import com.example.Parcial_Equipo_de_futbol.Model.Jugador;
import com.example.Parcial_Equipo_de_futbol.Repository.JugadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jugadores")
public class JugadorController {

    @Autowired private JugadorRepository jugadorRepo;

    @GetMapping
    public List<Jugador> getAll() {
        return jugadorRepo.findAll();
    }

    @PostMapping
    public Jugador create(@RequestBody Jugador jugador) {
        return jugadorRepo.save(jugador);
    }

    @PutMapping("/{id}")
    public Jugador update(@PathVariable Integer id, @RequestBody Jugador jugador) {
        jugador.setIdJugador(id);
        return jugadorRepo.save(jugador);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        jugadorRepo.deleteById(id);
    }

    @GetMapping("/equipo/{idEquipo}")
    public List<Jugador> getJugadoresPorEquipo(@PathVariable Integer idEquipo) {
        return jugadorRepo.findByEquipo(idEquipo);
    }

    @GetMapping("/goleadores")
    public List<Jugador> getJugadoresConMasGoles(@RequestParam int goles) {
        return jugadorRepo.findByGolesMayores(goles);
    }
}
