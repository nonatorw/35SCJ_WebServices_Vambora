package br.com.fiap.scj35.vamborams.converter;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import br.com.fiap.scj35.vamborams.dto.ClienteDTO;
import br.com.fiap.scj35.vamborams.entity.Cliente;

@Service
public class ClienteConverter {

    public ClienteDTO toDTO(Cliente inCliente) {
        return new ClienteDTO(inCliente);
    }

    public List<ClienteDTO> toListDTO(List<Cliente> inClientes) {
        return inClientes.stream()
                         .map(this::toDTO)
                         .collect(Collectors.toList());
    }

    public Cliente toEntity(ClienteDTO inCliente) {
        Cliente cliente = new Cliente();

        cliente.setId(inCliente.getId());
        cliente.setNome(inCliente.getNome());
        cliente.setDocumento(inCliente.getDocumento());

        return cliente;
    }

    public List<Cliente> toListEntity(List<ClienteDTO> inClientes) {
        return inClientes.stream()
                         .map(this::toEntity)
                         .collect(Collectors.toList());
    }

}
