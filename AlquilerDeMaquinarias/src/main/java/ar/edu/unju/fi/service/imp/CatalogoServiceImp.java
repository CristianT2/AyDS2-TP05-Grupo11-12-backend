package ar.edu.unju.fi.service.imp;

import java.io.IOException;
import java.util.Base64;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import ar.edu.unju.fi.model.Catalogo;
import ar.edu.unju.fi.repository.ICatalogoRepository;
import ar.edu.unju.fi.service.ICatalogoService;

@Service
public class CatalogoServiceImp implements ICatalogoService{

	@Autowired
	Catalogo catalogo;
	
	@Autowired
	ICatalogoRepository catalogoRepository;
	
	@Override
	public Catalogo getCatalogo() {
		// TODO Auto-generated method stub
		return catalogo;
	}

	@Override
	public void addCatalogo(MultipartFile file, Catalogo catalogo) {
		// TODO Auto-generated method stub
		
		try {
			catalogo.setImagen(Base64.getEncoder().encodeToString(file.getBytes()));
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		catalogoRepository.save(catalogo);
	}

	@Override
	public void deleteAlquiler(String codigo) {
		// TODO Auto-generated method stub
		catalogoRepository.deleteById(codigo);
	}

	@Override
	public List<Catalogo> getAllCatalogos() {
		// TODO Auto-generated method stub
		return catalogoRepository.findAll();
	}

	@Override
	public Optional<Catalogo> getCatalogoById(String codigo) {
		// TODO Auto-generated method stub
		return catalogoRepository.findById(codigo);
	}

}
