package main.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="asignado_a")
public class AsignadoA {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="cientifico")
	private Cientifico cientifico;
	
	@ManyToOne
	@JoinColumn(name="proyecto")
	private Proyecto proyecto;
	
	public AsignadoA() {
		// TODO Auto-generated constructor stub
	}
	
	public AsignadoA(Long id, Cientifico cientifico, Proyecto proyecto) {
		this.id = id;
		this.cientifico = cientifico;
		this.proyecto = proyecto;
	}



	public Cientifico getCientifico() {
		return cientifico;
	}

	public void setCientifico(Cientifico cientifico) {
		this.cientifico = cientifico;
	}

	public Proyecto getProyecto() {
		return proyecto;
	}

	public void setProyecto(Proyecto proyecto) {
		this.proyecto = proyecto;
	}

	public Long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "AsignadoA [id=" + id + ", cientifico=" + cientifico + ", proyecto=" + proyecto + "]";
	}
	
	
}
