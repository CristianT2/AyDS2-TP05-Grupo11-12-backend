package ar.edu.unju.fi.service.imp;

import java.io.IOException;
import java.util.Base64;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import ar.edu.unju.fi.model.Maquinaria;
import ar.edu.unju.fi.repository.IMaquinariaRepository;
import ar.edu.unju.fi.service.IMaquinariaService;

@Service
public class MaquinariaServiceImp implements IMaquinariaService {
	
	@Autowired
	Maquinaria maquinaria;
	
	@Autowired
	IMaquinariaRepository maquinariaRepository;

	@Override
	public Maquinaria getMaquinaria() {
		// TODO Auto-generated method stub
		return maquinaria;
	}

	@Override
	public void addMaquinaria(MultipartFile file , Maquinaria maquinaria) {
		
		try {
			maquinaria.setImagen(Base64.getEncoder().encodeToString(file.getBytes()));
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		maquinariaRepository.save(maquinaria);
	}

	@Override
	public void deleteMaquinaria(String codigo) {
		// TODO Auto-generated method stub
		maquinariaRepository.deleteById(codigo);
	}

	@Override
	public List<Maquinaria> getAllMaquinaria() {
		// TODO Auto-generated method stub
		return maquinariaRepository.findAll();
	}

	@Override
	public Optional<Maquinaria> getMaquinariaById(String codigo) {
		// TODO Auto-generated method stub
		return maquinariaRepository.findById(codigo);
	}
	

}
