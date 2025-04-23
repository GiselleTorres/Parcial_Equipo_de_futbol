package com.example.Parcial_Equipo_de_futbol.Controller;

import com.example.Parcial_Equipo_de_futbol.Model.Entrenador;
import com.example.Parcial_Equipo_de_futbol.Repository.EntrenadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/entrenadores")
public class EntrenadorController {

    @Autowired
    private EntrenadorRepository entrenadorRepo;

    @GetMapping
    public List<Entrenador> getAll() {
        return entrenadorRepo.findAll();
    }

    @PostMapping
    public Entrenador create(@RequestBody Entrenador entrenador) {
        return entrenadorRepo.save(entrenador);
    }

    @PutMapping("/{id}")
    public Entrenador update(@PathVariable Integer id, @RequestBody Entrenador entrenador) {
        entrenador.setIdEntrenador(id);
        return entrenadorRepo.save(entrenador);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        entrenadorRepo.deleteById(id);
    }
}
