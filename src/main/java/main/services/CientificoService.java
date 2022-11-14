package main.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.dao.ICientificoDAO;
import main.dto.Cientifico;

@Service
public class CientificoService implements ICientificoService{

	@Autowired
	ICientificoDAO iCientificoDAO;
	
	@Override
	public List<Cientifico> listarCientificos() {
		return iCientificoDAO.findAll();
	}

	@Override
	public Cientifico buscarCientifico(Long id) {
		// TODO Auto-generated method stub
		return iCientificoDAO.findById(id).get();
	}

	@Override
	public Cientifico guardarCientifico(Cientifico cientifico) {
		// TODO Auto-generated method stub
		return iCientificoDAO.save(cientifico);
	}

	@Override
	public Cientifico actualizarCientifico(Cientifico cientifico) {
		// TODO Auto-generated method stub
		return iCientificoDAO.save(cientifico);
	}

	@Override
	public void eliminarCientifico(Long id) {
		// TODO Auto-generated method stub
		iCientificoDAO.deleteById(id);
	}

}
