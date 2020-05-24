package br.com.fiap.scj35.vamborams.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.scj35.vamborams.entity.Viagem;

public interface ViagemRepository extends JpaRepository<Viagem, Long> {

    List<Viagem> findByIdCliente(Long idCliente);

}
