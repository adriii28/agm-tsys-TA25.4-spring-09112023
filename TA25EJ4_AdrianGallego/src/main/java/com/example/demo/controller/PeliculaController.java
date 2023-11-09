package com.example.demo.controller;

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

import com.example.demo.dto.Pelicula;
import com.example.demo.service.PeliculaServiceImpl;

@RestController
@RequestMapping("/api")
public class PeliculaController {
	
	@Autowired
	PeliculaServiceImpl pSer;
	
	@GetMapping("/peliculas")
	public List<Pelicula> listarPelicula() {
		return pSer.listarPeliculas();
	}
	
	@GetMapping("/peliculas/{id}")
	public Pelicula listarPeliculaById(@PathVariable(name="id") Integer id) {
		return pSer.listarPeliculaById(id);
	}
	
	@PostMapping("/peliculas")
	public Pelicula guardarNuevo(@RequestBody Pelicula pelicula) {
		return pSer.guardarNuevo(pelicula);	
	}
	
	@PutMapping("/peliculas/{id}")
	public Pelicula actualizarPeli(@PathVariable(name="id") Integer id, @RequestBody Pelicula pelicula) {
		Pelicula p1 = pSer.listarPeliculaById(id);
		Pelicula p2 = new Pelicula();
		
		p1.setId(pelicula.getId());
		p1.setNombre(pelicula.getNombre());
		p1.setCalificacion_edad(pelicula.getCalificacion_edad());
		
		p2 = pSer.actualizarPelicula(p1);

		return p2;
	}
	
	@DeleteMapping("/peliculas/{id}")
	public void deletePelicula(@PathVariable(name="id") Integer id) {
		pSer.deletePelicula(id);
	}

}
