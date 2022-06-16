package ar.edu.unju.fi.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
@Getter
@Component
@Entity
@Table(name = "MAQUINARIAS")
public class Maquinaria {
	
	@Id
	@Column(name = "codigo")
	private String codigo;
	
	@Column(name = "marca")
	private String marca;
	
	@Column(name = "modelo")
	private String modelo;
	
	@DateTimeFormat(pattern = "dd-MM-yyyy")
	@Column(name = "fecha_adquisicion")
	private Date fechaAdquisicion;
	
	@Column(name = "estado")
	private String estado;
	
	@Column(name = "imagen", columnDefinition = "MEDIUMBLOB")
	private String imagen;
	
	@OneToMany(mappedBy = "maquinaria", cascade = CascadeType.ALL)
	private List<Catalogo> catalogo;
	
	@OneToOne(mappedBy = "maquinaria",cascade = CascadeType.ALL)
	private Alquiler alquiler;

	
	/**
	 * 
	 */
	public Maquinaria() {

	}


	/**
	 * @param codigo
	 * @param marca
	 * @param modelo
	 * @param fechaAdquisicion
	 * @param estado
	 * @param imagen
	 */
	public Maquinaria(String codigo, String marca, String modelo, Date fechaAdquisicion, String estado, String imagen) {
		super();
		this.codigo = codigo;
		this.marca = marca;
		this.modelo = modelo;
		this.fechaAdquisicion = fechaAdquisicion;
		this.estado = estado;
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
	 * @return the marca
	 */
	public String getMarca() {
		return marca;
	}


	/**
	 * @param marca the marca to set
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}


	/**
	 * @return the modelo
	 */
	public String getModelo() {
		return modelo;
	}


	/**
	 * @param modelo the modelo to set
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	/**
	 * @return the fechaAdquisicion
	 */
	public Date getFechaAdquisicion() {
		return fechaAdquisicion;
	}


	/**
	 * @param fechaAdquisicion the fechaAdquisicion to set
	 */
	public void setFechaAdquisicion(Date fechaAdquisicion) {
		this.fechaAdquisicion = fechaAdquisicion;
	}


	/**
	 * @return the estado
	 */
	public String getEstado() {
		return estado;
	}


	/**
	 * @param estado the estado to set
	 */
	public void setEstado(String estado) {
		this.estado = estado;
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
	
	
	

	
}
