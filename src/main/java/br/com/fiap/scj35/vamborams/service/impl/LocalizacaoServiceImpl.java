package br.com.fiap.scj35.vamborams.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fiap.scj35.vamborams.converter.LocalizacaoConverter;
import br.com.fiap.scj35.vamborams.dto.LocalizacaoDTO;
import br.com.fiap.scj35.vamborams.entity.Localizacao;
import br.com.fiap.scj35.vamborams.repository.LocalizacaoRepository;
import br.com.fiap.scj35.vamborams.service.LocalizacaoService;

@Service
public class LocalizacaoServiceImpl implements LocalizacaoService {
    
	@Autowired
	private LocalizacaoRepository repository;
	
	@Autowired
	private LocalizacaoConverter converter;
	
	@Override
    public List<LocalizacaoDTO> findAll() {
		List<Localizacao> localizacoes = repository.findAll();
        return converter.toListDTO(localizacoes);
    }

    @Override
    public LocalizacaoDTO createOrUpdate(LocalizacaoDTO localizacao) {
    	Localizacao localizacaoEntity = repository.save(converter.toEntity(localizacao));
        return converter.toDTO(localizacaoEntity);
    }

    @Override
    public void delete(LocalizacaoDTO localizacao) {
    	repository.delete(converter.toEntity(localizacao));
    }

}
