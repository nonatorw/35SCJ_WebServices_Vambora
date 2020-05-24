package br.com.fiap.scj35.vamborams.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.scj35.vamborams.entity.Carro;

public interface CarroRepository extends JpaRepository<Carro, Long> {

    List<Carro> findAllByDisponivel(Boolean disponivel);

}
