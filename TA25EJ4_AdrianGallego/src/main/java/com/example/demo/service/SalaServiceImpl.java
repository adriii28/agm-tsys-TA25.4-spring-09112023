package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ISalaDao;
import com.example.demo.dto.Sala;

@Service
public class SalaServiceImpl implements ISalaService{

	@Autowired
	ISalaDao dao;
	
	@Override
	public List<Sala> listarSalas() {
		return dao.findAll();
	}

	@Override
	public Sala listarSalaById(Integer id) {
		return dao.findById(id).get();
	}

	@Override
	public Sala guardarNuevo(Sala sala) {
		return dao.save(sala);
	}

	@Override
	public Sala actualizarSala(Sala sala) {
		return dao.save(sala);
	}

	@Override
	public void deleteSala(Integer id) {
		dao.deleteById(id);
	}

}
