package br.com.fiap.scj35.vamborams.dto;

import java.util.StringJoiner;

import br.com.fiap.scj35.vamborams.entity.Cliente;

public class ClienteDTO {
    private Long    id;
    private String  nome;
    private Integer documento;

    public ClienteDTO() { }

    public ClienteDTO(String nome) {
        this.nome = nome;
    }

    public ClienteDTO(Cliente cliente) {
        this.id   = cliente.getId();
        this.nome = cliente.getNome();
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

    public Integer getDocumento() {
        return documento;
    }

    public void setDocumento(Integer documento) {
        this.documento = documento;
    }

    @Override
    public String toString() {
        return new StringJoiner(", " ,ClienteDTO.class.getSimpleName() + "[" ,"]")
                .add("id=" + id)
                .add("nome='" + nome + "'")
                .add("documento=" + documento)
                .toString();
    }

}
