package main.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.dao.IProyectoDAO;
import main.dto.Proyecto;

@Service
public class ProyectoService implements IProyectoService {

	@Autowired
	IProyectoDAO irProyectoDAO;
	
	@Override
	public List<Proyecto> listarProyectos() {
		// TODO Auto-generated method stub
		return irProyectoDAO.findAll();
	}

	@Override
	public Proyecto buscarProyecto(String id) {
		// TODO Auto-generated method stub
		return irProyectoDAO.findById(id).get();
	}

	@Override
	public Proyecto guardarProyecto(Proyecto proyecto) {
		// TODO Auto-generated method stub
		return irProyectoDAO.save(proyecto);
	}

	@Override
	public Proyecto actualizarProyecto(Proyecto proyecto) {
		// TODO Auto-generated method stub
		return irProyectoDAO.save(proyecto);
	}

	@Override
	public void eliminarProyecto(String id) {
		// TODO Auto-generated method stub
		irProyectoDAO.deleteById(id);
	}
}
