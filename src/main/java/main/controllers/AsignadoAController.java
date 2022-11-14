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

import main.dto.AsignadoA;
import main.services.AsignadoAService;

@RestController
@RequestMapping("/api")
public class AsignadoAController {

	@Autowired
	AsignadoAService asignadoAService;
	
	@GetMapping("/asignados")
	public List<AsignadoA> listarAsignados(){
		return asignadoAService.listarAsignadoA();
	}
	
	@GetMapping("/asignados/{id}")
	public AsignadoA buscarAsignadoA(@PathVariable(name="id")Long id) {
		return asignadoAService.buscarAsignadoA(id);
	}
	
	@PostMapping("/asignados")
	public AsignadoA guardarAsignado(@RequestBody AsignadoA asignadoA) {
		return asignadoAService.guardarAsignadoA(asignadoA);
	}
	
	
	@PutMapping("/asignados/{id}")
	public AsignadoA actualizarAsignado(@PathVariable(name="id")Long id, @RequestBody AsignadoA asignadoA) {
		AsignadoA asignadoSeleccionado = asignadoAService.buscarAsignadoA(id);
		
		asignadoSeleccionado.setCientifico(asignadoA.getCientifico());
		asignadoSeleccionado.setProyecto(asignadoA.getProyecto());
		
		return asignadoAService.actualizarAsignadoA(asignadoSeleccionado);
	}
	
	@DeleteMapping("/asignados/{id}")
	public void eliminarProyecto(@PathVariable(name="id")Long id) {
		asignadoAService.eliminarAsignadoA(id);
	}
}
