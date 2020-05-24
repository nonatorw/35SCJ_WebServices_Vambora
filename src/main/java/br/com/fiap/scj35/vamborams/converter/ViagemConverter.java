package br.com.fiap.scj35.vamborams.converter;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import br.com.fiap.scj35.vamborams.dto.ViagemDTO;
import br.com.fiap.scj35.vamborams.entity.Viagem;

@Service
public class ViagemConverter {

    public ViagemDTO toDTO(Viagem viagem) {
        return new ViagemDTO(viagem);
    }

    public List<ViagemDTO> toListDTO(List<Viagem> viagens) {
        return viagens.stream()
                      .map(this::toDTO)
                      .collect(Collectors.toList());
    }

    public Viagem toEntity(ViagemDTO viagemDTO) {
        Viagem viagem = new Viagem();

        viagem.setId(viagemDTO.getId());
        viagem.setIdCarro(viagemDTO.getIdCarro());
        viagem.setIdCliente(viagemDTO.getIdCliente());
        viagem.setIdLocalizacaoOrigem(viagemDTO.getIdLocalizacaoOrigem());
        viagem.setIdLocalizacaoDestino(viagemDTO.getIdLocalizacaoDestino());
        viagem.setPartida(viagemDTO.getPartida());
        viagem.setChegada(viagemDTO.getChegada());

        return viagem;
    }

    public List<Viagem> toListEntity(List<ViagemDTO> viagensDTO) {
        return viagensDTO.stream()
                         .map(this::toEntity)
                         .collect(Collectors.toList());
    }

}
