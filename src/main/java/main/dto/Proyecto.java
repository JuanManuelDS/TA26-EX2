package main.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="proyecto")
public class Proyecto {

	@Id
	private String id;
	
	@Column
	private String nombre;
	
	@Column
	private int horas;
	
	@OneToMany
	@JoinColumn(name="id")
	private List<AsignadoA> asignadoA;
	
	public Proyecto() {
		// TODO Auto-generated constructor stub
	}

	public Proyecto(String id, String nombre, int horas, List<AsignadoA> asignadoA) {
		this.id = id;
		this.nombre = nombre;
		this.horas = horas;
		this.asignadoA = asignadoA;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "AsignadoA")
	public List<AsignadoA> getAsignadoA() {
		return asignadoA;
	}

	public void setAsignadoA(List<AsignadoA> asignadoA) {
		this.asignadoA = asignadoA;
	}

	@Override
	public String toString() {
		return "Proyecto [id=" + id + ", nombre=" + nombre + ", horas=" + horas + ", asignadoA=" + asignadoA + "]";
	}
	
	
}
