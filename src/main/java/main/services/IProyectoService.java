package main.services;

import java.util.List;

import main.dto.Proyecto;

public interface IProyectoService {

	public List<Proyecto> listarProyectos();
	
	public Proyecto buscarProyecto(String id);
	
	public Proyecto guardarProyecto(Proyecto proyecto);
	
	public Proyecto actualizarProyecto(Proyecto proyecto);
	
	public void eliminarProyecto(String id);
}
