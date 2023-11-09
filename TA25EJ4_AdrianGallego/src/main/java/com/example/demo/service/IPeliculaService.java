package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Pelicula;

public interface IPeliculaService {
	
	public List<Pelicula> listarPeliculas();
	
	public Pelicula listarPeliculaById(Integer id);
	
	public Pelicula guardarNuevo(Pelicula pelicula);
	
	public Pelicula actualizarPelicula(Pelicula pelicula);
	
	public void deletePelicula(Integer id);

}
