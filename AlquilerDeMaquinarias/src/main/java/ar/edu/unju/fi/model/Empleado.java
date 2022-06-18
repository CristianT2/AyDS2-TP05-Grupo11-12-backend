package ar.edu.unju.fi.model;

import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
@Component
@Entity
@Table(name = "EMPLEADOS")
public class Empleado{
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_Empleado")
	private Integer idEmpleado;
	
	@Column(name = "apellido")
	private String apellido;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "tipo_documento")
	private String tipoDocumento;
	
	@Column(name = "num_documento")
	private String NumDocumento;
	
	@Column(name = "telefono")
	private String telefono;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "cargo_id")
	private Cargo cargo;
	
	//@DateTimeFormat(pattern = "dd-MM-yyyy HH:mm")
	@Column(name = "fecha_de_alta")
	private String fechaAlta;
	
	
	/**
	 * 
	 */
	public Empleado() {

	}
	

	/**
	 * @param idEmpleado
	 * @param apellido
	 * @param nombre
	 * @param tipoDocumento
	 * @param numDocumento
	 * @param telefono
	 * @param cargo
	 * @param fechaAlta
	 */
	public Empleado(Integer idEmpleado, String apellido, String nombre, String tipoDocumento, String numDocumento,
			String telefono, Cargo cargo, String fechaAlta) {
		super();
		this.idEmpleado = idEmpleado;
		this.apellido = apellido;
		this.nombre = nombre;
		this.tipoDocumento = tipoDocumento;
		NumDocumento = numDocumento;
		this.telefono = telefono;
		this.cargo = cargo;
		this.fechaAlta = fechaAlta;
	}
	
}
