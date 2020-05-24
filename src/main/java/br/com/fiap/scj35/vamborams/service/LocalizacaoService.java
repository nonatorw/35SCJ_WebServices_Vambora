package br.com.fiap.scj35.vamborams.service;

import java.util.List;

import br.com.fiap.scj35.vamborams.dto.CarroDTO;
import br.com.fiap.scj35.vamborams.dto.LocalizacaoDTO;

public interface LocalizacaoService {

    List<LocalizacaoDTO> findAll();

    LocalizacaoDTO create(LocalizacaoDTO localizacao);

    void delete(LocalizacaoDTO localizacao);

}
