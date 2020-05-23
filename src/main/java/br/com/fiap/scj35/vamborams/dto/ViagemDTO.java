package br.com.fiap.scj35.vamborams.dto;

import java.time.LocalDateTime;
import java.util.StringJoiner;

import br.com.fiap.scj35.vamborams.entity.Localizacao;
import br.com.fiap.scj35.vamborams.entity.Viagem;

public class ViagemDTO {
    private Long          id;
    private Long          idCarro;
    private Long          idCliente;
    private Localizacao   origem;
    private Localizacao   destino;
    private LocalDateTime partida;
    private LocalDateTime chegada;

    public ViagemDTO() {}

    public ViagemDTO(Long id ,Long idCarro ,Long idCliente ,Localizacao origem ,Localizacao destino ,
                     LocalDateTime partida ,LocalDateTime chegada) {
        this.id        = id;
        this.idCarro   = idCarro;
        this.idCliente = idCliente;
        this.origem    = origem;
        this.destino   = destino;
        this.partida   = partida;
        this.chegada   = chegada;
    }

    public ViagemDTO(Viagem viagem) {
        this.id        = viagem.getId();
        this.idCarro   = viagem.getIdCarro();
        this.idCliente = viagem.getIdCliente();
        this.origem    = viagem.getOrigem();
        this.destino   = viagem.getDestino();
        this.partida   = viagem.getPartida();
        this.chegada   = viagem.getChegada();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdCarro() {
        return idCarro;
    }

    public void setIdCarro(Long idCarro) {
        this.idCarro = idCarro;
    }

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public Localizacao getOrigem() {
        return origem;
    }

    public void setOrigem(Localizacao origem) {
        this.origem = origem;
    }

    public Localizacao getDestino() {
        return destino;
    }

    public void setDestino(Localizacao destino) {
        this.destino = destino;
    }

    public LocalDateTime getPartida() {
        return partida;
    }

    public void setPartida(LocalDateTime partida) {
        this.partida = partida;
    }

    public LocalDateTime getChegada() {
        return chegada;
    }

    public void setChegada(LocalDateTime chegada) {
        this.chegada = chegada;
    }

    @Override
    public String toString() {
        return new StringJoiner(", " ,ViagemDTO.class.getSimpleName() + "[" ,"]").add("id=" + id).add(
                "idCarro=" + idCarro).add("idCliente=" + idCliente).add("origem='" + origem + "'").add(
                "destino='" + destino + "'").add("partida=" + partida).add("chegada=" + chegada).toString();
    }

}
