package ar.edu.unju.fi.service.imp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.unju.fi.model.Alquiler;
import ar.edu.unju.fi.repository.IAlquilerRepository;
import ar.edu.unju.fi.service.IAlquilerService;

@Service
public class AlquilerServiceImp implements IAlquilerService{

	@Autowired
	IAlquilerRepository alquilerRepository;
	
	@Autowired
	Alquiler alquiler;
	
	@Override
	public Alquiler getAlquiler() {
		
		return alquiler;
	}

	@Override
	public void addAlquiler(Alquiler alquiler) {
		
		alquilerRepository.save(alquiler);
	}

	@Override
	public void deleteAlquiler(Integer idAlquiler) {
		// TODO Auto-generated method stub
		alquilerRepository.deleteById(idAlquiler);
	}

	@Override
	public List<Alquiler> getAllAlquiler() {
		// TODO Auto-generated method stub
		return alquilerRepository.findAll();
	}

	@Override
	public Optional<Alquiler> getAlquiler(Integer idAlquiler) {
		// TODO Auto-generated method stub
		return alquilerRepository.findById(idAlquiler);
	}

}
