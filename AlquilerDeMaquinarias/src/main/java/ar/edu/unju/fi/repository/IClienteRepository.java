package ar.edu.unju.fi.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import ar.edu.unju.fi.model.Cliente;

public interface IClienteRepository extends CrudRepository<Cliente, Integer> {
	
	public List<Cliente> findAll();
	public Optional<Cliente> findByIdMaquinaria(Integer idCliente);

}
