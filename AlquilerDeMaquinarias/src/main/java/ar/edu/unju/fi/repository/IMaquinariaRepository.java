package ar.edu.unju.fi.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.model.Maquinaria;

@Repository
public interface IMaquinariaRepository extends CrudRepository<Maquinaria, String>{
	
	public List<Maquinaria> findAll();
	public Optional<Maquinaria> findByCodigo(String codigo);

}
