package br.com.fiap.scj35.vamborams.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.scj35.vamborams.dto.CarroDTO;
import br.com.fiap.scj35.vamborams.enums.StatusEnum;
import br.com.fiap.scj35.vamborams.service.CarroService;

@RestController
public class CarroController {

	@Autowired
	private CarroService service;
	
	@GetMapping
	public CarroDTO findDisponivel() {
		return service.findByStatus(StatusEnum.DISPONIVEL).stream().findAny().orElse(null);
	}
}
