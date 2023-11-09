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

import com.example.demo.dto.Sala;
import com.example.demo.service.SalaServiceImpl;

@RestController
@RequestMapping("/api")
public class SalaController {
	
	@Autowired
	SalaServiceImpl sSer;
	
	@GetMapping("/salas")
	public List<Sala> listarSalas(){
		return sSer.listarSalas();
	}

	@GetMapping("/salas/{id}")
	public Sala listarSalaById(@PathVariable(name="id") Integer id) {
		return sSer.listarSalaById(id);	
	}
	
	@PostMapping("/salas")
	public Sala guardarNuevo(@RequestBody Sala sala) {
		return sSer.guardarNuevo(sala);
	}
	
	@PutMapping("/salas/{id}")
	public Sala actualizarSala(@PathVariable(name="id") Integer id, @RequestBody Sala sala) {
		Sala s1 = sSer.listarSalaById(id);
		Sala s2 = new Sala();
		
		s1.setCodigo(sala.getCodigo());
		s1.setNombre(sala.getNombre());
		s1.setPelicula(sala.getPelicula());
		
		s2 = sSer.actualizarSala(s1);
		
		return s2;
		
	}
	
	@DeleteMapping("/salas/{id}")
	public void deleteSalas(@PathVariable(name="id") Integer id) {
		sSer.deleteSala(id);
	}
}
