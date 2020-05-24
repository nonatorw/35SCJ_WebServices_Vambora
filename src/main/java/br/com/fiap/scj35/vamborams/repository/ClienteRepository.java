package br.com.fiap.scj35.vamborams.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.scj35.vamborams.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    Cliente findByDocumento(Integer documento);

    Cliente findByNome(String Nome);


}
