package ar.edu.unju.fi.service.imp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.unju.fi.model.Cliente;
import ar.edu.unju.fi.repository.IClienteRepository;
import ar.edu.unju.fi.service.IClienteService;

@Service
public class ClienteServiceImp implements IClienteService{
	
	@Autowired
	IClienteRepository clienteRepository;
	
	@Autowired
	Cliente cliente;

	@Override
	public Cliente getCliente() {
		// TODO Auto-generated method stub
		return cliente;
	}

	@Override
	public void addCliente(Cliente cliente) {
		// TODO Auto-generated method stub
		clienteRepository.save(cliente);
	}

	@Override
	public void deleteCliente(Integer idCliente) {
		// TODO Auto-generated method stub
		clienteRepository.deleteById(idCliente);
	}

	@Override
	public List<Cliente> getAllCliente() {
		// TODO Auto-generated method stub
		return clienteRepository.findAll();
	}

	@Override
	public Optional<Cliente> getClienteById(Integer idCliente) {
		// TODO Auto-generated method stub
		return clienteRepository.findById(idCliente);
	}

}
