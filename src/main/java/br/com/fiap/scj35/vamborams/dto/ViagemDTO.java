package br.com.fiap.scj35.vamborams.dto;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.StringJoiner;

import br.com.fiap.scj35.vamborams.entity.Viagem;
import br.com.fiap.scj35.vamborams.enums.StatusViagemEnum;

public class ViagemDTO implements Serializable {
    private Long             id;
    private Long             idCarro;
    private Long             idCliente;
    private Long             idLocalizacaoOrigem;
    private Long             idLocalizacaoDestino;
    private LocalDateTime    partida;
    private LocalDateTime    chegada;
    private StatusViagemEnum statusViagem;

    public ViagemDTO() {}

    public ViagemDTO(Long id ,Long idCarro ,Long idCliente ,Long idLocalizacaoOrigem ,Long idLocalizacaoDestino ,
                     LocalDateTime partida ,LocalDateTime chegada ,StatusViagemEnum statusViagem) {
        this.id                   = id;
        this.idCarro              = idCarro;
        this.idCliente            = idCliente;
        this.idLocalizacaoOrigem  = idLocalizacaoOrigem;
        this.idLocalizacaoDestino = idLocalizacaoDestino;
        this.partida              = partida;
        this.chegada              = chegada;
        this.statusViagem         = statusViagem;
    }

    public ViagemDTO(Viagem viagem) {
        this.id                   = viagem.getId();
        this.idCarro              = viagem.getIdCarro();
        this.idCliente            = viagem.getIdCliente();
        this.idLocalizacaoOrigem  = viagem.getIdLocalizacaoOrigem();
        this.idLocalizacaoDestino = viagem.getIdLocalizacaoDestino();
        this.partida              = viagem.getPartida();
        this.chegada              = viagem.getChegada();
        this.statusViagem         = viagem.getStatusViagem();
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

    public Long getIdLocalizacaoOrigem() {
        return idLocalizacaoOrigem;
    }

    public void setIdLocalizacaoOrigem(Long idLocalizacaoOrigem) {
        this.idLocalizacaoOrigem = idLocalizacaoOrigem;
    }

    public Long getIdLocalizacaoDestino() {
        return idLocalizacaoDestino;
    }

    public void setIdLocalizacaoDestino(Long idLocalizacaoDestino) {
        this.idLocalizacaoDestino = idLocalizacaoDestino;
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
        return new StringJoiner(", " ,ViagemDTO.class.getSimpleName() + "[" ,"]")
                .add("id =" + id)
                .add("idCarro=" + idCarro)
                .add("idCliente=" + idCliente)
                .add("idLocalizacaoOrigem=" + idLocalizacaoOrigem)
                .add("idLocalizacaoDestino=" + idLocalizacaoDestino)
                .add("partida=" + partida)
                .add("chegada=" + chegada)
                .add("statusViagem=" + statusViagem)
                .toString();
    }

}
