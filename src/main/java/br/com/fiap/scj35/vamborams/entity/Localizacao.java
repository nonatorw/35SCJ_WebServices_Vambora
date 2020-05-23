package br.com.fiap.scj35.vamborams.entity;

import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity(name = "TB_LOCALIZACOES")
@EntityListeners(AuditingEntityListener.class)
public class Localizacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private Double longitude;

    @Column
    private Double latitude;

    @Column
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

}
