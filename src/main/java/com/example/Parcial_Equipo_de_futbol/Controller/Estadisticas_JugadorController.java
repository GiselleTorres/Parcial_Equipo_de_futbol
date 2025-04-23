package com.example.Parcial_Equipo_de_futbol.Controller;

import com.example.Parcial_Equipo_de_futbol.Model.Estadisticas_Jugador;
import com.example.Parcial_Equipo_de_futbol.Repository.Estadisticas_JugadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/estadisticas")
public class Estadisticas_JugadorController {

    @Autowired
    private Estadisticas_JugadorRepository estadisticaRepo;

    @GetMapping
    public List<Estadisticas_Jugador> getAll() {
        return estadisticaRepo.findAll();
    }

    @PostMapping
    public Estadisticas_Jugador create(@RequestBody Estadisticas_Jugador estadistica) {
        return estadisticaRepo.save(estadistica);
    }

    @PutMapping("/{id}")
    public Estadisticas_Jugador update(@PathVariable Integer id, @RequestBody Estadisticas_Jugador estadistica) {
        estadistica.setIdEstadistica(id);
        return estadisticaRepo.save(estadistica);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        estadisticaRepo.deleteById(id);
    }
}
