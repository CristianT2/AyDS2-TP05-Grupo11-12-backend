package ar.edu.unju.fi.service;

import java.util.List;
import java.util.Optional;

import ar.edu.unju.fi.model.Alquiler;

public interface IAlquilerService {
	
	public Alquiler getAlquiler();
	public void addAlquiler(Alquiler alquiler);
	public void deleteAlquiler(Integer idAlquiler);
	public List<Alquiler> getAllAlquiler();
	public Optional<Alquiler> getAlquiler(Integer idAlquiler);

}
