package br.com.fiap.scj35.vamborams.dto;

import br.com.fiap.scj35.vamborams.entity.Carro;
import br.com.fiap.scj35.vamborams.entity.Viagem;
import br.com.fiap.scj35.vamborams.enums.StatusEnum;

public class CarroDTO {
	
	private Long id;
	private String nome;
	private StatusEnum status;
	private Viagem viagem;
	private LocalizacaoDTO localizacao;
	
	public CarroDTO() {	}
	
	public CarroDTO(Carro carro) {
		this.id = carro.getId();
		this.nome = carro.getNome();
		this.status = carro.getStatus();
		this.viagem = carro.getViagem(); 
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public StatusEnum getStatus() {
		return status;
	}
	public void setStatus(StatusEnum status) {
		this.status = status;
	}
	public Viagem getViagem() {
		return viagem;
	}
	public void setViagem(Viagem viagem) {
		this.viagem = viagem;
	}
	public LocalizacaoDTO getLocalizacao() {
		return localizacao;
	}
	public void setLocalizacao(LocalizacaoDTO localizacao) {
		this.localizacao = localizacao;
	}
}
