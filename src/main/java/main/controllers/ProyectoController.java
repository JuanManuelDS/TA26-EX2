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

import main.dto.Proyecto;
import main.services.ProyectoService;

@RestController
@RequestMapping("/api")
public class ProyectoController {

	@Autowired
	ProyectoService proyectoService;
	
	@GetMapping("/proyectos")
	public List<Proyecto> listarProyectos(){
		return proyectoService.listarProyectos();
	}
	
	@GetMapping("/proyectos/{id}")
	public Proyecto buscarProyecto(@PathVariable(name="id")String id) {
		return proyectoService.buscarProyecto(id);
	}
	
	@PostMapping("/proyectos")
	public Proyecto guardarProyecto(@RequestBody Proyecto proyecto) {
		return proyectoService.guardarProyecto(proyecto);
	}
	
	
	@PutMapping("/proyectos/{id}")
	public Proyecto actualizarProyecto(@PathVariable(name="id")String id, @RequestBody Proyecto proyecto) {
		Proyecto proyectoSeleccionado = proyectoService.buscarProyecto(id);
		
		proyectoSeleccionado.setHoras(proyecto.getHoras());
		proyectoSeleccionado.setNombre(proyecto.getNombre());
		
		return proyectoService.actualizarProyecto(proyectoSeleccionado);
	}
	
	@DeleteMapping("/proyectos/{id}")
	public void eliminarProyecto(@PathVariable(name="id")String id) {
		proyectoService.eliminarProyecto(id);
	}
}
