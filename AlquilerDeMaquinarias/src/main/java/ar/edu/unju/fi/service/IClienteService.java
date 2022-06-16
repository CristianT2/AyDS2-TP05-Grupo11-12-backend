package ar.edu.unju.fi.service;

import java.util.List;
import java.util.Optional;

import ar.edu.unju.fi.model.Cliente;

public interface IClienteService {
	
	public Cliente getCliente();
	public void addCliente(Cliente cliente);
	public void deleteCliente(Integer idCliente);
	public List<Cliente> getAllCliente();
	public Optional<Cliente> getClienteById(Integer idCliente);

}
