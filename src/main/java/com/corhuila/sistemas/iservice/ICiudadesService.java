package com.corhuila.sistemas.iservice;

import com.corhuila.sistemas.entity.Ciudades;

import java.util.List;
import java.util.Optional;

public interface ICiudadesService {
    public List<Ciudades> all();

    public Optional<Ciudades> findById(Long id);

    public Ciudades save(Ciudades ciudades);

    public void delete(Long id);
}
