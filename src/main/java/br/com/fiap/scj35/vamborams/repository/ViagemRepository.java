package br.com.fiap.scj35.vamborams.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.scj35.vamborams.entity.Viagem;
import br.com.fiap.scj35.vamborams.enums.StatusViagemEnum;

public interface ViagemRepository extends JpaRepository<Viagem, Long> {

    List<Viagem> findByIdCliente(Long idCliente);
    
    List<Viagem> findByStatusViagem(StatusViagemEnum statusViagem);
    
}
