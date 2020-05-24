package br.com.fiap.scj35.vamborams.service.impl;

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

}
