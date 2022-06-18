package ar.edu.unju.fi.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

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
	 */
	public Catalogo(String codigo, String fechaVigencia, String descripcion, Maquinaria maquinaria) {
		super();
		this.codigo = codigo;
		this.fechaVigencia = fechaVigencia;
		this.descripcion = descripcion;
		this.maquinaria = maquinaria;
	}
	
}
