package ar.edu.unju.fi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.web.multipart.MultipartFile;

import ar.edu.unju.fi.model.Catalogo;

public interface ICatalogoService {
	
	public Catalogo getCatalogo();
	public void addCatalogo(MultipartFile file, Catalogo catalogo);
	public void deleteAlquiler(String codigo);
	public List<Catalogo> getAllCatalogos();
	public Optional<Catalogo> getCatalogoById(String codigo);

}
