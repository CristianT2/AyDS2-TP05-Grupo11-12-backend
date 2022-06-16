package ar.edu.unju.fi.service;

import java.util.List;
import java.util.Optional;

import ar.edu.unju.fi.model.Empleado;

public interface IEmpleadoService {
	
	public Empleado getEmpleado();
	public void addEmpleado(Empleado empleado);
	public void deleteEmpleado(Integer idEmpleado);
	public List<Empleado> getAllEmpleados();
	public Optional<Empleado> getEmpleadoById(Integer idEmpleado);


}
