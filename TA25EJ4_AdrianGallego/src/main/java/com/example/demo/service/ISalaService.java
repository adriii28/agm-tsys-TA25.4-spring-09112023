package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Sala;

public interface ISalaService {

	public List<Sala> listarSalas();
	
	public Sala listarSalaById(Integer id);
		
	public Sala guardarNuevo(Sala sala);
	
	public Sala actualizarSala(Sala sala);

	public void deleteSala(Integer id);
	
}
