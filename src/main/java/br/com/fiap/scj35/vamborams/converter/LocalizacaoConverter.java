package br.com.fiap.scj35.vamborams.converter;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import br.com.fiap.scj35.vamborams.dto.LocalizacaoDTO;
import br.com.fiap.scj35.vamborams.entity.Localizacao;

@Service
public class LocalizacaoConverter {

    public LocalizacaoDTO toDTO(Localizacao inLocalizacao) {
        return new LocalizacaoDTO(inLocalizacao);
    }

    public List<LocalizacaoDTO> toListDTO(List<Localizacao> inLocalizacoes) {
        return inLocalizacoes.stream()
                             .map(this::toDTO)
                             .collect(Collectors.toList());
    }

    public Localizacao toEntity(LocalizacaoDTO inLocalizacao) {
        Localizacao localizacao = new Localizacao();

        localizacao.setId(inLocalizacao.getId());
        localizacao.setLongitude(inLocalizacao.getLongitude());
        localizacao.setLatitude(inLocalizacao.getLatitude());
        localizacao.setDataHoraLocalizacao(inLocalizacao.getDataHoraLocalizacao());

        return localizacao;
    }

    public List<Localizacao> toListEntity(List<LocalizacaoDTO> inLocalizacoesDTO) {
        return inLocalizacoesDTO.stream()
                                .map(this::toEntity)
                                .collect(Collectors.toList());
    }

}
