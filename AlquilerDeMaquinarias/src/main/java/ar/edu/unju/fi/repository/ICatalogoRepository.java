package ar.edu.unju.fi.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import ar.edu.unju.fi.model.Catalogo;

public interface ICatalogoRepository extends CrudRepository<Catalogo, String> {
	
	public List<Catalogo> findAll();
	public Optional<Catalogo> findByIdCatalogo(String codigo);

}
