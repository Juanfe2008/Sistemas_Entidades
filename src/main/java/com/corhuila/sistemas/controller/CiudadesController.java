package com.corhuila.sistemas.controller;

import com.corhuila.sistemas.entity.Ciudades;
import com.corhuila.sistemas.iservice.ICiudadesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/ciudad")
public class CiudadesController {

    @Autowired
    private ICiudadesService service;

    @GetMapping
    public List<Ciudades> all() {
        return service.all();
    }

    @GetMapping("{id}")
    public Optional<Ciudades> show(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Ciudades save(@RequestBody Ciudades ciudades) {
        return service.save(ciudades);
    }

    @PutMapping("{id}")
    @ResponseStatus(code = HttpStatus.CREATED)
    public Ciudades update(@PathVariable Long id, @RequestBody Ciudades ciudades) {
        Optional<Ciudades> op = service.findById(id);

        if (!op.isEmpty()) {
            Ciudades ciudadesUpdate = op.get();
            ciudadesUpdate.setNombre(ciudades.getNombre());
            ciudadesUpdate.setCodigo(ciudades.getCodigo());
            ciudadesUpdate.setEstado(ciudades.getEstado());
            return service.save(ciudadesUpdate);
        }

        return ciudades;
    }

    @DeleteMapping("{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
