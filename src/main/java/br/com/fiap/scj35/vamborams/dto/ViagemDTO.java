package br.com.fiap.scj35.vamborams.dto;

import br.com.fiap.scj35.vamborams.entity.Viagem;

public class ViagemDTO {
	
	private String origem;
	private String destino;

	public ViagemDTO() { }
	
	public ViagemDTO(Viagem viagem) {
		this.origem = viagem.getOrigem();
		this.destino = viagem.getDestino();
	}
	
	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

}
