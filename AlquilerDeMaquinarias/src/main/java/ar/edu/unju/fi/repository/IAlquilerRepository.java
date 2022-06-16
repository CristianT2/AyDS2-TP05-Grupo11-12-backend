package ar.edu.unju.fi.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import ar.edu.unju.fi.model.Alquiler;


public interface IAlquilerRepository extends CrudRepository<Alquiler, Integer>{

	public List<Alquiler> findAll();
	public Optional<Alquiler> findByIdAlquiler(Integer idAlquiler);
	
}
