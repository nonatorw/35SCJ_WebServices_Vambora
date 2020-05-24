package br.com.fiap.scj35.vamborams.converter;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import br.com.fiap.scj35.vamborams.dto.CarroDTO;
import br.com.fiap.scj35.vamborams.entity.Carro;

@Service
public class CarroConverter {
	
	public CarroDTO toDTO(Carro carro) {
		return new CarroDTO(carro);
	}
	
	public List<CarroDTO> toListDTO(List<Carro> carros){
		return carros.stream().map(carro -> this.toDTO(carro)).collect(Collectors.toList());
	}
	
	public Carro toEntity(CarroDTO carroDTO) {
		Carro carro = new Carro();
		carro.setId(carroDTO.getId());
		carro.setPlaca(carroDTO.getPlaca());
		carro.setIdUltimaViagem(carroDTO.getIdUltimaViagem());
		return carro;
	}
	
	public List<Carro> toListEntity(List<CarroDTO> carrosDTO){
		return carrosDTO.stream().map(carro -> this.toEntity(carro)).collect(Collectors.toList());
	}

}
