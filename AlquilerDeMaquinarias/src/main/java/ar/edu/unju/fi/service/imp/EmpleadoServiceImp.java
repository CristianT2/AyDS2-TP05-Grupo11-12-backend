package ar.edu.unju.fi.service.imp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.unju.fi.model.Empleado;
import ar.edu.unju.fi.repository.IEmpleadoRepository;
import ar.edu.unju.fi.service.IEmpleadoService;

@Service
public class EmpleadoServiceImp implements IEmpleadoService{
	
	@Autowired
	Empleado empleado;
	
	@Autowired
	IEmpleadoRepository empleadoRepository;

	@Override
	public Empleado getEmpleado() {
		// TODO Auto-generated method stub
		return empleado;
	}

	@Override
	public void addEmpleado(Empleado empleado) {
		// TODO Auto-generated method stub
		empleadoRepository.save(empleado);
	}

	@Override
	public void deleteEmpleado(Integer idEmpleado) {
		// TODO Auto-generated method stub
		empleadoRepository.deleteById(idEmpleado);
	}

	@Override
	public List<Empleado> getAllEmpleados() {
		// TODO Auto-generated method stub
		return empleadoRepository.findAll();
	}

	@Override
	public Optional<Empleado> getEmpleadoById(Integer idEmpleado) {
		// TODO Auto-generated method stub
		return empleadoRepository.findById(idEmpleado);
	}

}
