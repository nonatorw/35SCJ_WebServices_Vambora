package br.com.fiap.scj35.vamborams.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fiap.scj35.vamborams.converter.CarroConverter;
import br.com.fiap.scj35.vamborams.dto.CarroDTO;
import br.com.fiap.scj35.vamborams.entity.Carro;
import br.com.fiap.scj35.vamborams.repository.CarroRepository;
import br.com.fiap.scj35.vamborams.service.CarroService;

@Service
public class CarroServiceImpl implements CarroService {
	
	@Autowired
	private CarroRepository repository;
	
	@Autowired
	private CarroConverter converter;

	@Override
	public List<CarroDTO> findByDisponivel() {
		List<Carro> carros = new ArrayList<Carro>();
		carros.addAll(repository.findAllByDisponivel(Boolean.TRUE));
		return carros.isEmpty() ? null : converter.toListDTO(carros);
	}

	@Override
	public List<CarroDTO> findAll() {
		List<Carro> carros = repository.findAll();
		return converter.toListDTO(carros);
	}
	
	@Override
	public CarroDTO create(CarroDTO carroDto) {
		Carro carro = converter.toEntity(carroDto);
		return converter.toDTO(repository.save(carro));
	}

	@Override
	public CarroDTO update(CarroDTO carroDto) {
		Carro carro = converter.toEntity(carroDto);
		return converter.toDTO(repository.save(carro));
	}

	@Override
	public void delete(CarroDTO carro) {
		repository.delete(converter.toEntity(carro));
	}
	
}
