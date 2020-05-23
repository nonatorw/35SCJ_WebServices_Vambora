package br.com.fiap.scj35.vamborams.dto;

import java.time.LocalDateTime;
import java.util.StringJoiner;

public class LocalizacaoDTO {
    private long          id;
    private Double        longitude;
    private Double        latitude;
    private LocalDateTime dataHoraLocalizacao;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public LocalDateTime getDataHoraLocalizacao() {
        return dataHoraLocalizacao;
    }

    public void setDataHoraLocalizacao(LocalDateTime dataHoraLocalizacao) {
        this.dataHoraLocalizacao = dataHoraLocalizacao;
    }

    @Override
    public String toString() {
        return new StringJoiner(", " ,LocalizacaoDTO.class.getSimpleName() + "[" ,"]")
                .add("id=" + id)
                .add("longitude=" + longitude).add("latitude=" + latitude)
                .add("dataHoraLocalizacao=" + dataHoraLocalizacao)
                .toString();
    }

}
