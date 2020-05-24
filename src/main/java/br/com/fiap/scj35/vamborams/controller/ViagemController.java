package br.com.fiap.scj35.vamborams.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.scj35.vamborams.dto.ViagemDTO;
import br.com.fiap.scj35.vamborams.service.ViagemService;

@RestController
@RequestMapping("viagens")
public class ViagemController {

    @Autowired
    private ViagemService service;

    @GetMapping("/viagens")
    public List<ViagemDTO> buscaViagensDoCliente(Long idCliente) {
        return null;
    }

    @PostMapping
    public ViagemDTO solicitaViagem(Long idCliente) {
        return null;
    }

}
