package br.com.fiap.scj35.vamborams.controller;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.scj35.vamborams.dto.LocalizacaoDTO;
import br.com.fiap.scj35.vamborams.dto.ViagemDTO;
import br.com.fiap.scj35.vamborams.enums.StatusViagemEnum;
import br.com.fiap.scj35.vamborams.service.ViagemService;

@RestController
@RequestMapping("viagens")
public class ViagemController {

    @Autowired
    private ViagemService service;
    
    @GetMapping
    public List<ViagemDTO> getAll() {
    	return service.getAll();
    }
    
    @GetMapping("/viagens")
    public List<ViagemDTO> buscaViagensDoCliente(Long idCliente) {
    	return service.findByCliente(idCliente);
    }
    
    @GetMapping("/id/{id}")
    public ViagemDTO getById(@PathVariable(value = "id") Long id) {
    	return service.findById(id);
    }

    @PostMapping("/solicita-viagem")
    public ViagemDTO solicitaViagem(@RequestBody ViagemDTO viagem) {
    	Random random = new Random();
    	
    	LocalizacaoDTO origem = new LocalizacaoDTO();
    	origem.setLatitude(random.nextDouble());
    	origem.setLongitude(random.nextDouble());
    	
    	LocalizacaoDTO destino = new LocalizacaoDTO();
    	destino.setLatitude(random.nextDouble());
    	destino.setLongitude(random.nextDouble());
    	
        return service.criarViagem(viagem, origem, destino);
    }
    
    @GetMapping("/em-andamento")
    public List<ViagemDTO> buscaViagensEmAndamento(){
    	return service.findByStatusViagem(StatusViagemEnum.VIAGEM_INICIADA);
    }
    
    @PutMapping
    public ViagemDTO update(@RequestBody ViagemDTO viagem) {
    	return service.update(viagem);
    }
    
    @DeleteMapping
    public ViagemDTO delete(@RequestBody ViagemDTO viagem) {
    	return service.update(viagem);
    }

}
