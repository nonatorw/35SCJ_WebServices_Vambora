package br.com.fiap.scj35.vamborams.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "TB_CARROS")
@EntityListeners(AuditingEntityListener.class)
public class Carro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String placa;

    @Column
    private Boolean disponivel;

    @Column
    private Long idUltimaViagem;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public Boolean getDisponivel() {
		return disponivel;
	}

	public void setDisponivel(Boolean disponivel) {
		this.disponivel = disponivel;
	}

	public Long getIdUltimaViagem() {
		return idUltimaViagem;
	}

	public void setIdUltimaViagem(Long idUltimaViagem) {
		this.idUltimaViagem = idUltimaViagem;
	}

    

}
