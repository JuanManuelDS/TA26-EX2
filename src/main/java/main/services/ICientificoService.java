package main.services;

import java.util.List;

import main.dto.Cientifico;

public interface ICientificoService {

	public List<Cientifico> listarCientificos();
	
	public Cientifico buscarCientifico(Long id);
	
	public Cientifico guardarCientifico(Cientifico cientifico);
	
	public Cientifico actualizarCientifico(Cientifico cientifico);
	
	public void eliminarCientifico(Long id);
	
}
