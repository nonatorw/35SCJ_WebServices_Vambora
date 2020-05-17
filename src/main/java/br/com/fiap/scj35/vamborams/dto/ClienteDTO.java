package br.com.fiap.scj35.vamborams.dto;

import br.com.fiap.scj35.vamborams.entity.Cliente;

public class ClienteDTO {
	
	private Long id;
	private String nome;
	private ViagemDTO viagem;
	
	public ClienteDTO() { }
	
	public ClienteDTO(Cliente cliente) {
		this.id = cliente.getId();
		this.nome = cliente.getNome();
		this.viagem = new ViagemDTO(cliente.getViagem());
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
	public ViagemDTO getViagem() {
		return viagem;
	}
	public void setViagem(ViagemDTO viagem) {
		this.viagem = viagem;
	}

}
