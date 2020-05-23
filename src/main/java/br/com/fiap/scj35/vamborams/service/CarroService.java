package br.com.fiap.scj35.vamborams.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.fiap.scj35.vamborams.dto.CarroDTO;
import br.com.fiap.scj35.vamborams.enums.StatusEnum;

public interface CarroService {

	List<CarroDTO> findByStatus(StatusEnum status);
	
}
