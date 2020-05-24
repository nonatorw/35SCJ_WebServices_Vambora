package br.com.fiap.scj35.vamborams.enums;

public enum StatusViagemEnum {
    INICIANDO_VIAGEM(0),
    INDO_ATE_CLIENTE(1),
    CARRO_NA_ORIGEM(2),
    INICIADA(3),
    FINALIZADA(4);

    private Integer status;

    StatusViagemEnum(Integer status) {
        this.status = status;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
