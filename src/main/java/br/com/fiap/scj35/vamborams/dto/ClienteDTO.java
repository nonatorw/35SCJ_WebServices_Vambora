package br.com.fiap.scj35.vamborams.dto;

import br.com.fiap.scj35.vamborams.entity.Cliente;
import br.com.fiap.scj35.vamborams.entity.Viagem;

public class ClienteDTO {
	
	private Long id;
	private String nome;
	private Viagem viagem;
	
	public ClienteDTO() { }
	
	public ClienteDTO(Cliente cliente) {
		this.id = cliente.getId();
		this.nome = cliente.getNome();
		this.viagem = cliente.getViagem();
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
	
	public Viagem getViagem() {
		return viagem;
	}
	
	public void setViagem(Viagem viagem) {
		this.viagem = viagem;
	}

}
