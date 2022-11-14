package main.services;

import java.util.List;

import main.dto.AsignadoA;

public interface IAsignadoAService {

	public List<AsignadoA> listarAsignadoA();
	
	public AsignadoA buscarAsignadoA(Long id);
	
	public AsignadoA guardarAsignadoA(AsignadoA asignadoA);
	
	public AsignadoA actualizarAsignadoA(AsignadoA asignadoA);
	
	public void eliminarAsignadoA(Long id);
}
