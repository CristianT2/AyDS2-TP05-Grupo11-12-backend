package ar.edu.unju.fi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.web.multipart.MultipartFile;

import ar.edu.unju.fi.model.Maquinaria;

public interface IMaquinariaService {

	public Maquinaria getMaquinaria();
	public void addMaquinaria(MultipartFile file, Maquinaria maquinaria);
	public void deleteMaquinaria(String codigo);
	public List<Maquinaria> getAllMaquinaria();
	public Optional<Maquinaria> getMaquinariaById(String codigo);
}
