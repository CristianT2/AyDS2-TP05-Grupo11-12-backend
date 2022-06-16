package ar.edu.unju.fi.model;

import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
@Table(name = "ALQUILERES")
public class Alquiler {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_alquiler")
	private Integer idAlquiler;
	
	@Column(name = "fecha_alquiler")
	private LocalDateTime fehaAlquiler = LocalDateTime.now();
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "cliente_id")
	private Cliente cliente;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "maquinaria_id")
	private Maquinaria maquinaria;
	
	@DateTimeFormat(pattern = "dd-MM-yyyy HH:mm")
	@Column(name = "fecha_devolucion")
	private Date fechaDevolucion;
	
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
	public Alquiler(Integer idAlquiler, LocalDateTime fehaAlquiler, Cliente cliente, Maquinaria maquinaria,
			Date fechaDevolucion, Double precio) {
		super();
		this.idAlquiler = idAlquiler;
		this.fehaAlquiler = fehaAlquiler;
		this.cliente = cliente;
		this.maquinaria = maquinaria;
		this.fechaDevolucion = fechaDevolucion;
		this.precio = precio;
	}


}
