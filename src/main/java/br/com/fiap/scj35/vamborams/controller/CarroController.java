package br.com.fiap.scj35.vamborams.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.scj35.vamborams.dto.CarroDTO;
import br.com.fiap.scj35.vamborams.service.CarroService;

@RestController
@RequestMapping("carros")
public class CarroController {

    @Autowired
    private CarroService service;
    
    @GetMapping
    public CarroDTO findDisponivel() {
        return service.findByDisponivel().stream().findAny().orElse(null);
    }
    
    @GetMapping("/disponivel")
    public List<CarroDTO> getAll() {
        return service.findAll();
    }
    
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CarroDTO create(@RequestBody @Valid CarroDTO carroDTO) {
    	return service.create(carroDTO);
    }
    
    @PutMapping
    public CarroDTO update(@RequestBody @Valid CarroDTO carroDTO) {
    	return service.update(carroDTO);
    }
    
    @DeleteMapping
    public void delete(@RequestBody @Valid CarroDTO carroDTO) {
    	service.delete(carroDTO);
    }

}
