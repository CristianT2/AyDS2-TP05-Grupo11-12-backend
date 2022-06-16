package ar.edu.unju.fi.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import ar.edu.unju.fi.model.Maquinaria;

public interface IMaquinariaRepository extends CrudRepository<Maquinaria, String>{
	
	public List<Maquinaria> findAll();
	public Optional<Maquinaria> findByIdMaquinaria(String codigo);

}
