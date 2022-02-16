package br.com.Nutricionista.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.Nutricionista.EsquelletoBD.Nutricionista;

public interface Repository
	extends JpaRepository<Nutricionista, Long>{

	
	
}
