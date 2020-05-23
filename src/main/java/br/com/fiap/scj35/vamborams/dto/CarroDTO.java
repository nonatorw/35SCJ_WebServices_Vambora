package br.com.fiap.scj35.vamborams.dto;

import java.util.StringJoiner;

import br.com.fiap.scj35.vamborams.entity.Carro;

public class CarroDTO {

    private Long    id;
    private String  placa;
    private Boolean disponivel;

    public CarroDTO(String placa ,Boolean disponivel) {
        this.placa      = placa;
        this.disponivel = disponivel;
    }

    public CarroDTO(Carro carro) {
        this.id         = carro.getId();
        this.placa      = carro.getPlaca();
        this.disponivel = carro.isDisponivel();
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

    public Boolean isDisponivel() {
        return this.isDisponivel();
    }

    public void toggleDisponivel() {
        this.disponivel = !this.isDisponivel();
    }

    @Override
    public String toString() {
        return new StringJoiner(", " ,CarroDTO.class.getSimpleName() + "[" ,"]")
                .add("id=" + id)
                .add("placa='" + placa + "'")
                .add("disponivel=" + disponivel)
                .toString();
    }

}
