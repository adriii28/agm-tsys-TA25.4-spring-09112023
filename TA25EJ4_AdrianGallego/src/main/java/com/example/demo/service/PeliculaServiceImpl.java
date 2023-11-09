package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IPeliculaDAO;
import com.example.demo.dto.Pelicula;

@Service
public class PeliculaServiceImpl implements IPeliculaService{

	@Autowired
	IPeliculaDAO dao;
	
	@Override
	public List<Pelicula> listarPeliculas() {
		return dao.findAll();
	}

	@Override
	public Pelicula listarPeliculaById(Integer id) {
		return dao.findById(id).get();
	}

	@Override
	public Pelicula guardarNuevo(Pelicula pelicula) {
		return dao.save(pelicula);
	}

	@Override
	public Pelicula actualizarPelicula(Pelicula pelicula) {
		return dao.save(pelicula);
	}

	@Override
	public void deletePelicula(Integer id) {
		dao.deleteById(id);
	}

}
