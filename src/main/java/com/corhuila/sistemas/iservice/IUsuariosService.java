package com.corhuila.sistemas.iservice;



import com.corhuila.sistemas.entity.Usuarios;

import java.util.List;
import java.util.Optional;

public interface IUsuariosService {

	public List<Usuarios> all();
	
	public Optional<Usuarios> findById(Long id);
	
	public Usuarios save(Usuarios usuarios);
	
	public void delete(Long id);
}
