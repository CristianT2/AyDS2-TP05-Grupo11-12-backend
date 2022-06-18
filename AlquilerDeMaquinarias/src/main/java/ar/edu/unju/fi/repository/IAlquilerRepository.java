package ar.edu.unju.fi.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.model.Alquiler;

@Repository
public interface IAlquilerRepository extends CrudRepository<Alquiler, Integer>{

	public List<Alquiler> findAll();
	public Optional<Alquiler> findByIdAlquiler(Integer idAlquiler);
	
}
