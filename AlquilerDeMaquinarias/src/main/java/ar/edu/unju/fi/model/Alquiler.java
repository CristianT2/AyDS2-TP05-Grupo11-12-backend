package ar.edu.unju.fi.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import org.springframework.stereotype.Component;


@Component
@Entity
@Table(name = "ALQUILERES")
public class Alquiler {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_alquiler")
	private Integer idAlquiler;
	
	@Column(name = "fecha_alquiler")
	private String fechaAlquiler;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "cliente_id")
	private Cliente cliente;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "maquinaria_id")
	private Maquinaria maquinaria;
	
	//@DateTimeFormat(pattern = "dd-MM-yyyy HH:mm")
	@Column(name = "fecha_devolucion")
	private String fechaDevolucion;
	
	@Column(name = "precio")
	private Double precio;
	
	

	/**
	 * 
	 */
	public Alquiler() {

	}



	/**
	 * @param idAlquiler
	 * @param fehaAlquiler
	 * @param cliente
	 * @param maquinaria
	 * @param fechaDevolucion
	 * @param precio
	 */
	public Alquiler(Integer idAlquiler, String fechaAlquiler, Cliente cliente, Maquinaria maquinaria,
			String fechaDevolucion, Double precio) {
		super();
		this.idAlquiler = idAlquiler;
		this.fechaAlquiler = fechaAlquiler;
		this.cliente = cliente;
		this.maquinaria = maquinaria;
		this.fechaDevolucion = fechaDevolucion;
		this.precio = precio;
	}



	/**
	 * @return the idAlquiler
	 */
	public Integer getIdAlquiler() {
		return idAlquiler;
	}



	/**
	 * @param idAlquiler the idAlquiler to set
	 */
	public void setIdAlquiler(Integer idAlquiler) {
		this.idAlquiler = idAlquiler;
	}



	/**
	 * @return the fechaAlquiler
	 */
	public String getFechaAlquiler() {
		return fechaAlquiler;
	}



	/**
	 * @param fechaAlquiler the fechaAlquiler to set
	 */
	public void setFechaAlquiler(String fechaAlquiler) {
		this.fechaAlquiler = fechaAlquiler;
	}



	/**
	 * @return the cliente
	 */
	public Cliente getCliente() {
		return cliente;
	}



	/**
	 * @param cliente the cliente to set
	 */
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}



	/**
	 * @return the maquinaria
	 */
	public Maquinaria getMaquinaria() {
		return maquinaria;
	}



	/**
	 * @param maquinaria the maquinaria to set
	 */
	public void setMaquinaria(Maquinaria maquinaria) {
		this.maquinaria = maquinaria;
	}



	/**
	 * @return the fechaDevolucion
	 */
	public String getFechaDevolucion() {
		return fechaDevolucion;
	}



	/**
	 * @param fechaDevolucion the fechaDevolucion to set
	 */
	public void setFechaDevolucion(String fechaDevolucion) {
		this.fechaDevolucion = fechaDevolucion;
	}



	/**
	 * @return the precio
	 */
	public Double getPrecio() {
		return precio;
	}

	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Alquiler [idAlquiler=" + idAlquiler + ", fechaAlquiler=" + fechaAlquiler + ", cliente=" + cliente
				+ ", maquinaria=" + maquinaria + ", fechaDevolucion=" + fechaDevolucion + ", precio=" + precio + "]";
	}

}
