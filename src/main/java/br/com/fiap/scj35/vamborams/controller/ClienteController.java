package br.com.fiap.scj35.vamborams.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.scj35.vamborams.dto.ClienteDTO;
import br.com.fiap.scj35.vamborams.service.ClienteService;

@RestController
@RequestMapping("clientes")
public class ClienteController {
	
	@Autowired
	private ClienteService service;
	
	@GetMapping
	public List<ClienteDTO> getAll() {
		return service.findAll();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public ClienteDTO createOrUpdate(@RequestBody @Valid ClienteDTO cliente) {
		return service.create(cliente);
	}
	
	@DeleteMapping
	public void delete(@RequestBody @Valid ClienteDTO cliente) {
		service.delete(cliente);
	}

}
