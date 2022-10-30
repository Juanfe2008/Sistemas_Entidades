package com.corhuila.sistemas.service;

import com.corhuila.sistemas.entity.Ciudades;
import com.corhuila.sistemas.irepository.ICiudades;
import com.corhuila.sistemas.iservice.ICiudadesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class CiudadesService implements ICiudadesService {

    @Autowired
    private ICiudades repository;

    @Override
    public List<Ciudades> all() {
        return this.repository.findAll();
    }

    @Override
    public Optional<Ciudades> findById(Long id) {
        return this.repository.findById(id);
    }

    @Override
    public Ciudades save(Ciudades ciudades) {
        return this.repository.save(ciudades);
    }

    @Override
    public void delete(Long id) {
        this.repository.deleteById(id);
    }


}
