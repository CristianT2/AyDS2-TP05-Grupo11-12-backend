package ar.edu.unju.fi.model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


import org.springframework.stereotype.Component;


@Component
@Entity
@Table(name = "CATALOGOS")
public class Catalogo {

	@Id
	@Column(name = "codigo")
	private String codigo;
	
	@Column(name = "fecha_vigencia")
	//@Temporal(value = TemporalType.DATE)
	//@DateTimeFormat(pattern = "dd-MM-yyyy")
	private String fechaVigencia;
	
	@Column(name = "descripcion")
	private String descripcion;
	
	
	@Column(name="imagen", columnDefinition = "MEDIUMBLOB")
	private String imagen;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "maquinaria_id")
	private Maquinaria maquinaria;

	
	/**
	 * 
	 */
	public Catalogo() {

	}
	
	
	/**
	 * @param codigo
	 * @param fechaVigencia
	 * @param descripcion
	 * @param maquinaria
	 * @param imagen
	 */
	public Catalogo(String codigo, String fechaVigencia, String descripcion, Maquinaria maquinaria, String imagen) {
		super();
		this.codigo = codigo;
		this.fechaVigencia = fechaVigencia;
		this.descripcion = descripcion;
		this.maquinaria = maquinaria;
		this.imagen = imagen;
	}


	/**
	 * @return the codigo
	 */
	public String getCodigo() {
		return codigo;
	}


	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	/**
	 * @return the fechaVigencia
	 */
	public String getFechaVigencia() {
		return fechaVigencia;
	}


	/**
	 * @param fechaVigencia the fechaVigencia to set
	 */
	public void setFechaVigencia(String fechaVigencia) {
		this.fechaVigencia = fechaVigencia;
	}


	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}


	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	/**
	 * @return the imagen
	 */
	public String getImagen() {
		return imagen;
	}


	/**
	 * @param imagen the imagen to set
	 */
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	@Override
	public String toString() {
		return "Catalogo [codigo=" + codigo + ", fechaVigencia=" + fechaVigencia + ", descripcion=" + descripcion
				+ ", imagen=" + imagen + "]";
	}
}
