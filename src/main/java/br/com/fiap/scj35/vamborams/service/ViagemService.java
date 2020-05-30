package br.com.fiap.scj35.vamborams.service;

import java.util.List;

import br.com.fiap.scj35.vamborams.dto.LocalizacaoDTO;
import br.com.fiap.scj35.vamborams.dto.ViagemDTO;
import br.com.fiap.scj35.vamborams.enums.StatusViagemEnum;

public interface ViagemService {

    List<ViagemDTO> findByCliente(Long idCliente);
    
    ViagemDTO findById(Long id);

    ViagemDTO create(ViagemDTO viagem);

    ViagemDTO update(ViagemDTO viagem);
    
    ViagemDTO criarViagem(ViagemDTO viagem, LocalizacaoDTO origem, LocalizacaoDTO destino);
    
    List<ViagemDTO> findByStatusViagem(StatusViagemEnum status);
    
    List<ViagemDTO> getAll();

}
