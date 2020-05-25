package br.com.fiap.scj35.vamborams.service;

import java.util.List;

import br.com.fiap.scj35.vamborams.dto.ViagemDTO;

public interface ViagemService {

    List<ViagemDTO> findByCliente(Long idCliente);

    ViagemDTO create(ViagemDTO viagem);

    ViagemDTO update(ViagemDTO viagem);
    
    ViagemDTO criarViagem(Long idCliente);

}
