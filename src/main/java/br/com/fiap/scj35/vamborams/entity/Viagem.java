package br.com.fiap.scj35.vamborams.entity;

import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import br.com.fiap.scj35.vamborams.enums.StatusViagemEnum;

@Entity
@Table(name = "TB_VIAGENS")
@EntityListeners(AuditingEntityListener.class)
public class Viagem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private Long idCarro;

    @Column
    private Long idCliente;

    @Column
    private Long idLocalizacaoOrigem;

    @Column
    private Long idLocalizacaoDestino;

    @Column
    private LocalDateTime partida;

    @Column
    private LocalDateTime chegada;

    @Column
    private StatusViagemEnum statusViagem;

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

    public StatusViagemEnum getStatusViagem() {
        return statusViagem;
    }

    public void setStatusViagem(StatusViagemEnum statusViagem) {
        this.statusViagem = statusViagem;
    }

}
