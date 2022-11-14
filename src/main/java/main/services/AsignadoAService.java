package main.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.dao.IAsignadoADAO;
import main.dto.AsignadoA;

@Service
public class AsignadoAService implements IAsignadoAService {

	@Autowired
	IAsignadoADAO iAsignadoADAO;
	
	@Override
	public List<AsignadoA> listarAsignadoA() {
		// TODO Auto-generated method stub
		return iAsignadoADAO.findAll();
	}

	@Override
	public AsignadoA buscarAsignadoA(Long id) {
		// TODO Auto-generated method stub
		return iAsignadoADAO.findById(id).get();
	}

	@Override
	public AsignadoA guardarAsignadoA(AsignadoA asignadoA) {
		// TODO Auto-generated method stub
		return iAsignadoADAO.save(asignadoA);
	}

	@Override
	public AsignadoA actualizarAsignadoA(AsignadoA asignadoA) {
		// TODO Auto-generated method stub
		return iAsignadoADAO.save(asignadoA);
	}

	@Override
	public void eliminarAsignadoA(Long id) {
		// TODO Auto-generated method stub
		iAsignadoADAO.deleteById(id);
	}

	

}
