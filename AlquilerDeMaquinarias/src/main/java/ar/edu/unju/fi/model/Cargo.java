package ar.edu.unju.fi.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@ToString
@Setter
@Getter
@Component
@Entity
@Table(name = "CARGOS")
public class Cargo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_cargo")
	private Integer idCargo;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "descripcion")
	private String descripcion;
	
	@OneToMany(mappedBy = "cargo", cascade = CascadeType.ALL)
	private List<Empleado> empleado;
	
	/**
	 * 
	 */
	public Cargo() {

	}
	
	/**
	 * @param idCargo
	 * @param nombre
	 * @param descripcion
	 */
	public Cargo(Integer idCargo, String nombre, String descripcion) {
		super();
		this.idCargo = idCargo;
		this.nombre = nombre;
		this.descripcion = descripcion;
	}

}
