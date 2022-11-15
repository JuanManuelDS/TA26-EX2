package main.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="cientificos")
public class Cientifico {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column
	private String dni;
	
	@Column
	private String nomApels;
	
	@OneToMany(mappedBy = "cientifico", cascade = CascadeType.ALL)
	private List<AsignadoA> asignadoA;
	
	public Cientifico() {
		// TODO Auto-generated constructor stub
	}

	public Cientifico(Long id, String dni, String nomApels, List<AsignadoA> asignadoA) {
		this.id = id;
		this.dni = dni;
		this.nomApels = nomApels;
		this.asignadoA = asignadoA;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNomApels() {
		return nomApels;
	}

	public void setNomApels(String nomApels) {
		this.nomApels = nomApels;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY)
	public List<AsignadoA> getAsignadoA() {
		return asignadoA;
	}

	public void setAsignadoA(List<AsignadoA> asignadoA) {
		this.asignadoA = asignadoA;
	}

	public Long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Cientifico [id=" + id + ", dni=" + dni + ", nomApels=" + nomApels + ", asignadoA=" + asignadoA + "]";
	}
	
	
	
}
