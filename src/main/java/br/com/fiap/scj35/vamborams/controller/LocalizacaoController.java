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

import br.com.fiap.scj35.vamborams.dto.LocalizacaoDTO;
import br.com.fiap.scj35.vamborams.service.LocalizacaoService;

@RestController
@RequestMapping("localizacoes")
public class LocalizacaoController {
	
	@Autowired
	private LocalizacaoService service;
	
	@GetMapping
	public List<LocalizacaoDTO> getAll() {
		return service.findAll();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public LocalizacaoDTO createOrUpdate(@RequestBody @Valid LocalizacaoDTO localizacao) {
		return service.createOrUpdate(localizacao);
	}
	
	@DeleteMapping
	public void delete(@RequestBody @Valid LocalizacaoDTO localizacao) {
		service.delete(localizacao);
	}
	
}
