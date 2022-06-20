package ar.edu.unju.fi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.springframework.stereotype.Component;

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


	/**
	 * @return the idEmpleado
	 */
	public Integer getIdEmpleado() {
		return idEmpleado;
	}


	/**
	 * @param idEmpleado the idEmpleado to set
	 */
	public void setIdEmpleado(Integer idEmpleado) {
		this.idEmpleado = idEmpleado;
	}


	/**
	 * @return the apellido
	 */
	public String getApellido() {
		return apellido;
	}


	/**
	 * @param apellido the apellido to set
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}


	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	/**
	 * @return the tipoDocumento
	 */
	public String getTipoDocumento() {
		return tipoDocumento;
	}


	/**
	 * @param tipoDocumento the tipoDocumento to set
	 */
	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}


	/**
	 * @return the numDocumento
	 */
	public String getNumDocumento() {
		return NumDocumento;
	}


	/**
	 * @param numDocumento the numDocumento to set
	 */
	public void setNumDocumento(String numDocumento) {
		NumDocumento = numDocumento;
	}


	/**
	 * @return the telefono
	 */
	public String getTelefono() {
		return telefono;
	}


	/**
	 * @param telefono the telefono to set
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	/**
	 * @return the cargo
	 */
	public Cargo getCargo() {
		return cargo;
	}


	/**
	 * @param cargo the cargo to set
	 */
	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}


	/**
	 * @return the fechaAlta
	 */
	public String getFechaAlta() {
		return fechaAlta;
	}


	/**
	 * @param fechaAlta the fechaAlta to set
	 */
	public void setFechaAlta(String fechaAlta) {
		this.fechaAlta = fechaAlta;
	}


	@Override
	public String toString() {
		return "Empleado [idEmpleado=" + idEmpleado + ", apellido=" + apellido + ", nombre=" + nombre
				+ ", tipoDocumento=" + tipoDocumento + ", NumDocumento=" + NumDocumento + ", telefono=" + telefono
				+ ", cargo=" + cargo + ", fechaAlta=" + fechaAlta + "]";
	}

}
