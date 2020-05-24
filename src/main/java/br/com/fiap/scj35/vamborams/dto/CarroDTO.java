package br.com.fiap.scj35.vamborams.dto;

import java.io.Serializable;
import java.util.StringJoiner;

import br.com.fiap.scj35.vamborams.entity.Carro;

public class CarroDTO implements Serializable {
    private Long    id;
    private String  placa;
    private Boolean disponivel;
    private Long    idUltimaViagem;

    public CarroDTO(String placa ,Boolean disponivel ,Long idUltimaViagem) {
        this.placa          = placa;
        this.disponivel     = disponivel;
        this.idUltimaViagem = idUltimaViagem;
    }

    public CarroDTO(Carro carro) {
        this.id             = carro.getId();
        this.placa          = carro.getPlaca();
        this.disponivel     = carro.getDisponivel();
        this.idUltimaViagem = carro.getIdUltimaViagem();
    }

    

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

	@Override
    public String toString() {
        return new StringJoiner(", " ,CarroDTO.class.getSimpleName() + "[" ,"]")
                .add("id=" + id)
                .add("placa='" + placa + "'")
                .add("disponivel=" + disponivel)
                .add("idUltimaViagem=" + idUltimaViagem)
                .toString();
    }

}
