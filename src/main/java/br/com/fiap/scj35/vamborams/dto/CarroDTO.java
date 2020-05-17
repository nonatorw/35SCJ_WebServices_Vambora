package br.com.fiap.scj35.vamborams.dto;

import br.com.fiap.scj35.vamborams.entity.Carro;
import br.com.fiap.scj35.vamborams.enums.StatusEnum;

public class CarroDTO {
	
	private Long id;
	private String nome;
	private StatusEnum status;
	private ViagemDTO viagem;
	
	public CarroDTO() {	}
	
	public CarroDTO(Carro carro) {
		this.id = carro.getId();
		this.nome = carro.getNome();
		this.status = carro.getStatus();
		this.viagem = new ViagemDTO(carro.getViagem()); 
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
	public ViagemDTO getViagem() {
		return viagem;
	}
	public void setViagem(ViagemDTO viagem) {
		this.viagem = viagem;
	}
	
}
