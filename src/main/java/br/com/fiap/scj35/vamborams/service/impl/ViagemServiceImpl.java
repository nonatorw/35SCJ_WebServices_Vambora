package br.com.fiap.scj35.vamborams.service.impl;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fiap.scj35.vamborams.converter.ViagemConverter;
import br.com.fiap.scj35.vamborams.dto.CarroDTO;
import br.com.fiap.scj35.vamborams.dto.LocalizacaoDTO;
import br.com.fiap.scj35.vamborams.dto.ViagemDTO;
import br.com.fiap.scj35.vamborams.entity.Viagem;
import br.com.fiap.scj35.vamborams.enums.StatusViagemEnum;
import br.com.fiap.scj35.vamborams.repository.ViagemRepository;
import br.com.fiap.scj35.vamborams.service.CarroService;
import br.com.fiap.scj35.vamborams.service.LocalizacaoService;
import br.com.fiap.scj35.vamborams.service.ViagemService;

@Service
public class ViagemServiceImpl implements ViagemService {

    @Autowired
    private ViagemRepository repository;

    @Autowired
    private ViagemConverter converter;
    
    @Autowired
    private CarroService carroService;
    
    @Autowired
    private LocalizacaoService localizacaoService;

    private ViagemDTO handleReturnedViagem(Viagem inViagem) {
        ViagemDTO outViagem = null;

        if (inViagem != null) {
            outViagem = converter.toDTO(inViagem);
        }

        return outViagem;
    }

    private List<ViagemDTO> handleReturnedViagemList(List<Viagem> inViagens) {
        List<ViagemDTO> outViagens = null;

        if (!inViagens.isEmpty()) {
            outViagens = converter.toListDTO(inViagens);
        }

        return outViagens;
    }

    private ViagemDTO saveOrUpdate(ViagemDTO inViagem) {
        Viagem save = repository.save(converter.toEntity(inViagem));

        return converter.toDTO(save);
    }

    @Override
    public List<ViagemDTO> findByCliente(Long idCliente) {
        return this.handleReturnedViagemList(repository.findByIdCliente(idCliente));
    }

    @Override
    public ViagemDTO create(ViagemDTO viagemDTO) {
        return this.saveOrUpdate(viagemDTO);
    }

    @Override
    public ViagemDTO update(ViagemDTO viagemDTO) {
        return this.saveOrUpdate(viagemDTO);
    }
    
    @Override
    public ViagemDTO criarViagem(Long idCliente) {
    	CarroDTO carroDisponivel = carroService.findByDisponivel().stream()
    			.findAny().get();
    	
    	Random random = new Random();
    	
    	LocalizacaoDTO localizacao = new LocalizacaoDTO();
    	
    	localizacao.setLatitude(random.nextDouble());
    	localizacao.setLongitude(random.nextDouble());
    	
    	LocalizacaoDTO localizacaoOrigem;
    	localizacaoOrigem = localizacaoService.createOrUpdate(localizacao);
    	
    	localizacao.setLatitude(random.nextDouble());
    	localizacao.setLongitude(random.nextDouble());
    	
    	LocalizacaoDTO localizacaoDestino;
    	localizacaoDestino = localizacaoService.createOrUpdate(localizacao);
    	
    	ViagemDTO viagem = new ViagemDTO();
    	viagem.setIdCliente(idCliente);
    	viagem.setIdCarro(carroDisponivel.getId());
    	viagem.setIdLocalizacaoOrigem(localizacaoOrigem.getId());
    	viagem.setIdLocalizacaoDestino(localizacaoDestino.getId());
    	viagem.setStatusViagem(StatusViagemEnum.CARRO_INDO_AO_CLIENTE);
    	
    	return viagem;
    }

}