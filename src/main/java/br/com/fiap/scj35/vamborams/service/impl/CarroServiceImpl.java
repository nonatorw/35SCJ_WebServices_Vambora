package br.com.fiap.scj35.vamborams.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fiap.scj35.vamborams.dto.CarroDTO;
import br.com.fiap.scj35.vamborams.entity.Carro;
import br.com.fiap.scj35.vamborams.enums.StatusEnum;
import br.com.fiap.scj35.vamborams.repository.CarroRepository;
import br.com.fiap.scj35.vamborams.service.CarroService;

@Service
public class CarroServiceImpl implements CarroService {
	
	@Autowired
	private CarroRepository repository;

	@Override
	public List<CarroDTO> findByStatus(StatusEnum status) {
		List<Carro> carros = repository.findAllByStatus(status);
		return carros.stream()
				.map(carro -> new CarroDTO(carro))
				.collect(Collectors.toList());
	}
	
}
