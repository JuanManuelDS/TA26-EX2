package main.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import main.dto.Cientifico;
import main.services.CientificoService;

@RestController
@RequestMapping("/api")
public class CientificoController {

	@Autowired
	CientificoService cientificoService;
	
	@GetMapping("/cientificos")
	public List<Cientifico> listarCientificos(){
		return cientificoService.listarCientificos();
	}
	
	@GetMapping("/cientifico/{id}")
	public Cientifico buscarCientifico(@PathVariable(name="id")Long id) {
		return cientificoService.buscarCientifico(id);
	}
	
	@PostMapping("/cientifico")
	public Cientifico guardarCientifico(@RequestBody Cientifico cientifico) {
		return cientificoService.guardarCientifico(cientifico);
	}
	
	@PutMapping("/cientifico/{id}")
	public Cientifico actualizarCientifico(@PathVariable(name="id")Long id, @RequestBody Cientifico cientifico) {
		Cientifico cientificoSeleccionado = cientificoService.buscarCientifico(id);
		
		cientificoSeleccionado.setNomApels(cientifico.getNomApels());
		cientificoSeleccionado.setDni(cientifico.getDni());
		
		return cientificoService.actualizarCientifico(cientificoSeleccionado);
	}
	
	@DeleteMapping("/cientifico/{id}")
	public void eliminarCientifico(@PathVariable(name="id")Long id) {
		cientificoService.eliminarCientifico(id);
	}
	
}
