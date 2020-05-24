package br.com.fiap.scj35.vamborams.service;

import java.util.List;

import br.com.fiap.scj35.vamborams.dto.ClienteDTO;

public interface ClienteService {

    ClienteDTO find(ClienteDTO inCliente);

    ClienteDTO findByDocumento(Integer inDocumento);

    ClienteDTO findByNome(String inNomeCliente);

    List<ClienteDTO> findAll();

    ClienteDTO create(ClienteDTO inCliente);

    ClienteDTO update(ClienteDTO inCliente);

    void delete(ClienteDTO inCliente);

}
