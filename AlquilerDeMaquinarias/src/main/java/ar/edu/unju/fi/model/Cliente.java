package ar.edu.unju.fi.model;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name = "CLIENTES")
public class Cliente{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_cliente")
	private Integer idCliente;
	
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
	
	@Column(name = "razon_social")
	private String razonSocial;
	
	@Column(name = "codigo_postal")
	private String codigoPostal;
	
	@Column(name = "direccion")
	private String direccion;
	
	//@DateTimeFormat(pattern = "dd-MM-yyyy HH:mm")
	@Column(name = "fecha_de_alta")
	private String fechaAlta;
	
	@OneToOne(mappedBy = "cliente",cascade = CascadeType.ALL)
	private Alquiler alquiler;

	
	/**
	 * 
	 */
	public Cliente() {

	}
	
	/**
	 * @param idCliente
	 * @param apellido
	 * @param nombre
	 * @param tipoDocumento
	 * @param numDocumento
	 * @param telefono
	 * @param razonSocial
	 * @param codigoPostal
	 * @param direccion
	 * @param fechaAlta
	 */
	public Cliente(Integer idCliente, String apellido, String nombre, String tipoDocumento, String numDocumento,
			String telefono, String razonSocial, String codigoPostal, String direccion, String fechaAlta) {
		super();
		this.idCliente = idCliente;
		this.apellido = apellido;
		this.nombre = nombre;
		this.tipoDocumento = tipoDocumento;
		this.NumDocumento = numDocumento;
		this.telefono = telefono;
		this.razonSocial = razonSocial;
		this.codigoPostal = codigoPostal;
		this.direccion = direccion;
		this.fechaAlta = fechaAlta;
	}

	/**
	 * @return the idCliente
	 */
	public Integer getIdCliente() {
		return idCliente;
	}

	/**
	 * @param idCliente the idCliente to set
	 */
	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
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
	 * @return the razonSocial
	 */
	public String getRazonSocial() {
		return razonSocial;
	}

	/**
	 * @param razonSocial the razonSocial to set
	 */
	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	/**
	 * @return the codigoPostal
	 */
	public String getCodigoPostal() {
		return codigoPostal;
	}

	/**
	 * @param codigoPostal the codigoPostal to set
	 */
	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
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
		return "Cliente [idCliente=" + idCliente + ", apellido=" + apellido + ", nombre=" + nombre + ", tipoDocumento="
				+ tipoDocumento + ", NumDocumento=" + NumDocumento + ", telefono=" + telefono + ", razonSocial="
				+ razonSocial + ", codigoPostal=" + codigoPostal + ", direccion=" + direccion + ", fechaAlta="
				+ fechaAlta + "]";
	}
	
}
