package br.com.fiap.scj35.vamborams.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.scj35.vamborams.entity.Localizacao;

public interface LocalizacaoRepository extends JpaRepository<Localizacao, Long> {
	
}
