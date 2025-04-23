package com.example.Parcial_Equipo_de_futbol.Controller;

import com.example.Parcial_Equipo_de_futbol.Model.Equipo;
import com.example.Parcial_Equipo_de_futbol.Repository.EquipoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/equipos")
public class EquipoController {

    @Autowired
    private EquipoRepository equipoRepo;
    @GetMapping
    public List<Equipo> getAll() {

        return equipoRepo.findAll();
    }

    @PostMapping
    public Equipo create(@RequestBody Equipo equipo) {
        return equipoRepo.save(equipo);
    }

    @PutMapping("/{id}")
    public Equipo update(@PathVariable Integer id, @RequestBody Equipo equipo) {

        equipo.setIdEquipo(id);
        return equipoRepo.save(equipo);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {

        equipoRepo.deleteById(id);
    }
}


