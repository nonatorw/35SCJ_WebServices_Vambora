package br.com.fiap.scj35.vamborams.enums;

public enum StatusViagemEnum {
    VIAGEM_SOLICITADA(0),
    CARRO_INDO_AO_CLIENTE(1),
    CARRO_CHEGOU_A_ORIGEM(2),
    VIAGEM_INICIADA(3),
    CARRO_CHEGOU_AO_DESTINO(4),
    VIAGEM_FINALIZADA(5),
    VIAGEM_CANCELADA(9);

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
