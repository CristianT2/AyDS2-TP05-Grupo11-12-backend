package ar.edu.unju.fi.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import ar.edu.unju.fi.model.Empleado;

public interface IEmpleadoRepository extends CrudRepository<Empleado, Integer>{
	
	public List<Empleado> findAll();
	public Optional<Empleado> findByIdEmpleado(Integer idEmpleado);

}
