package br.com.fiap.scj35.vamborams.service;

import java.util.List;

import br.com.fiap.scj35.vamborams.dto.CarroDTO;

public interface CarroService {

	List<CarroDTO> findByDisponivel();

	List<CarroDTO> findAll();
	
	CarroDTO create(CarroDTO carro);
	
	CarroDTO update(CarroDTO carro);
	
	void delete(CarroDTO carro);
	
}
