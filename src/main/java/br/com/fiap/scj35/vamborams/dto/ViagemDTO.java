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
    private LocalDateTime    dataHoraSolicitacao;
    private LocalDateTime    dataHoraPartida;
    private LocalDateTime    dataHoraChegada;
    private StatusViagemEnum statusViagem;

    public ViagemDTO() {}

    public ViagemDTO(Long idCarro ,Long idCliente ,Long idLocalizacaoOrigem ,Long idLocalizacaoDestino ,
                     LocalDateTime dataHoraSolicitacao ,LocalDateTime dataHoraPartida ,LocalDateTime dataHoraChegada ,
                     StatusViagemEnum statusViagem) {
        this.idCarro              = idCarro;
        this.idCliente            = idCliente;
        this.idLocalizacaoOrigem  = idLocalizacaoOrigem;
        this.idLocalizacaoDestino = idLocalizacaoDestino;
        this.dataHoraSolicitacao  = dataHoraSolicitacao;
        this.dataHoraPartida      = dataHoraPartida;
        this.dataHoraChegada      = dataHoraChegada;
        this.statusViagem         = statusViagem;
    }

    public ViagemDTO(Long id ,Long idCarro ,Long idCliente ,Long idLocalizacaoOrigem ,Long idLocalizacaoDestino ,
                     LocalDateTime dataHoraSolicitacao ,LocalDateTime dataHoraPartida ,LocalDateTime dataHoraChegada ,
                     StatusViagemEnum statusViagem) {
        this.id                   = id;
        this.idCarro              = idCarro;
        this.idCliente            = idCliente;
        this.idLocalizacaoOrigem  = idLocalizacaoOrigem;
        this.idLocalizacaoDestino = idLocalizacaoDestino;
        this.dataHoraSolicitacao  = dataHoraSolicitacao;
        this.dataHoraPartida      = dataHoraPartida;
        this.dataHoraChegada      = dataHoraChegada;
        this.statusViagem         = statusViagem;
    }

    public ViagemDTO(Viagem viagem) {
        this.id                   = viagem.getId();
        this.idCarro              = viagem.getIdCarro();
        this.idCliente            = viagem.getIdCliente();
        this.idLocalizacaoOrigem  = viagem.getIdLocalizacaoOrigem();
        this.idLocalizacaoDestino = viagem.getIdLocalizacaoDestino();
        this.dataHoraSolicitacao  = viagem.getDataHoraSolicitacao();
        this.dataHoraPartida      = viagem.getDataHoraPartida();
        this.dataHoraChegada      = viagem.getDataHoraChegada();
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

    public LocalDateTime getDataHoraSolicitacao() {
        return dataHoraSolicitacao;
    }

    public void setDataHoraSolicitacao(LocalDateTime dataHoraSolicitacao) {
        this.dataHoraSolicitacao = dataHoraSolicitacao;
    }

    public LocalDateTime getDataHoraPartida() {
        return dataHoraPartida;
    }

    public void setDataHoraPartida(LocalDateTime dataHoraPartida) {
        this.dataHoraPartida = dataHoraPartida;
    }

    public LocalDateTime getDataHoraChegada() {
        return dataHoraChegada;
    }

    public void setDataHoraChegada(LocalDateTime dataHoraChegada) {
        this.dataHoraChegada = dataHoraChegada;
    }

    public StatusViagemEnum getStatusViagem() {
        return statusViagem;
    }

    public void setStatusViagem(StatusViagemEnum statusViagem) {
        this.statusViagem = statusViagem;
    }

    @Override
    public String toString() {
        return new StringJoiner(", " ,ViagemDTO.class.getSimpleName() + "[" ,"]")
                .add("id=" + id)
                .add("idCarro=" + idCarro)
                .add("idCliente=" + idCliente)
                .add("idLocalizacaoOrigem=" + idLocalizacaoOrigem)
                .add("idLocalizacaoDestino=" + idLocalizacaoDestino)
                .add("dataHoraSolicitacao=" + dataHoraSolicitacao)
                .add("dataHoraPartida=" + dataHoraPartida)
                .add("dataHoraChegada=" + dataHoraChegada)
                .add("statusViagem=" + statusViagem)
                .toString();
    }

}
