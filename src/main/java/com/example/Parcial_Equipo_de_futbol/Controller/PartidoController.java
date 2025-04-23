package com.example.Parcial_Equipo_de_futbol.Controller;

import com.example.Parcial_Equipo_de_futbol.Model.Partido;
import com.example.Parcial_Equipo_de_futbol.Repository.PartidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/partidos")
public class PartidoController {

    @Autowired
    private PartidoRepository partidoRepo;

    @GetMapping
    public List<Partido> getAll() {
        return partidoRepo.findAll();
    }

    @PostMapping
    public Partido create(@RequestBody Partido partido) {
        return partidoRepo.save(partido);
    }

    @PutMapping("/{id}")
    public Partido update(@PathVariable Integer id, @RequestBody Partido partido) {
        partido.setIdPartido(id);
        return partidoRepo.save(partido);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        partidoRepo.deleteById(id);
    }

    @GetMapping("/goles-totales/{idEquipo}")
    public List<Integer> totalGolesPorEquipo(@PathVariable Integer idEquipo) {
        return partidoRepo.totalGolesPorEquipo(idEquipo);
    }

    @GetMapping("/resultados")
    public List<Object[]> resultadosPartidos() {
        return partidoRepo.obtenerResultadosPartidos();
    }
}
