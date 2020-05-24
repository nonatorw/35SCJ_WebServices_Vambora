package br.com.fiap.scj35.vamborams.dto;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.StringJoiner;

import br.com.fiap.scj35.vamborams.entity.Localizacao;

public class LocalizacaoDTO implements Serializable {
    private long          id;
    private Double        longitude;
    private Double        latitude;
    private LocalDateTime dataHoraLocalizacao;

    public LocalizacaoDTO() {}

    public LocalizacaoDTO(long id ,Double longitude ,Double latitude ,LocalDateTime dataHoraLocalizacao) {
        this.id                  = id;
        this.longitude           = longitude;
        this.latitude            = latitude;
        this.dataHoraLocalizacao = dataHoraLocalizacao;
    }

    public LocalizacaoDTO(Localizacao localizacao) {
        this.id                  = localizacao.getId();
        this.longitude           = localizacao.getLongitude();
        this.latitude            = localizacao.getLatitude();
        this.dataHoraLocalizacao = localizacao.getDataHoraLocalizacao();
    }

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
                .add("id=" + id).add("longitude=" + longitude)
                .add("latitude=" + latitude)
                .add("dataHoraLocalizacao=" + dataHoraLocalizacao)
                .toString();
    }

}
