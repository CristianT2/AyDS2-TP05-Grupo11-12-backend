package ar.edu.unju.fi.model;

import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
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
	
	@DateTimeFormat(pattern = "dd-MM-yyyy HH:mm")
	@Column(name = "fecha_de_alta")
	private LocalDateTime fechaAlta = LocalDateTime.now();
	
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
			String telefono, String razonSocial, String codigoPostal, String direccion, LocalDateTime fechaAlta) {
		super();
		this.idCliente = idCliente;
		this.apellido = apellido;
		this.nombre = nombre;
		this.tipoDocumento = tipoDocumento;
		NumDocumento = numDocumento;
		this.telefono = telefono;
		this.razonSocial = razonSocial;
		this.codigoPostal = codigoPostal;
		this.direccion = direccion;
		this.fechaAlta = fechaAlta;
	}
	
	
	
}
