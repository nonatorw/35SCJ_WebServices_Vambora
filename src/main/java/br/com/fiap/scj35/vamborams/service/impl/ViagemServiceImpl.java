package br.com.fiap.scj35.vamborams.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fiap.scj35.vamborams.converter.ViagemConverter;
import br.com.fiap.scj35.vamborams.dto.ViagemDTO;
import br.com.fiap.scj35.vamborams.entity.Viagem;
import br.com.fiap.scj35.vamborams.repository.ViagemRepository;
import br.com.fiap.scj35.vamborams.service.ViagemService;

@Service
public class ViagemServiceImpl implements ViagemService {

    @Autowired
    private ViagemRepository repository;

    @Autowired
    private ViagemConverter converter;

    @Override
    public List<ViagemDTO> findByCliente(Long idCliente) {
        List<Viagem> viagens = new ArrayList<>();
        viagens.addAll(repository.findByIdCliente(idCliente));

        return viagens.isEmpty() ? null : converter.toListDTO(viagens);
    }

    @Override
    public ViagemDTO create(ViagemDTO viagemDTO) {
        Viagem viagem = converter.toEntity(viagemDTO);

        return converter.toDTO(repository.save(viagem));
    }

    @Override
    public ViagemDTO update(ViagemDTO viagemDTO) {
        Viagem viagem = converter.toEntity(viagemDTO);

        return converter.toDTO(repository.save(viagem));
    }

}
