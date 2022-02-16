package br.com.Nutricionista.service;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.Nutricionista.EsquelletoBD.Nutricionista;
import br.com.Nutricionista.exception.NutricionistaRecursosException;
import br.com.Nutricionista.recursos.model.Recursos;
import br.com.Nutricionista.repository.Repository;


@Service
public class CadastroService {
	
	private static final Logger LOG = Logger.getLogger(CadastroService.class);
	
	@Autowired
	private Repository repository;
	
	@Autowired
	private NutricionistaConversor service;
	
	
	public void cadastro(Recursos nutricionistaRecursos) {
		
		
		try {
			Nutricionista nutricionista = service.conversor(nutricionistaRecursos);
			repository.saveAndFlush(nutricionista);
			
		} catch (NutricionistaRecursosException e) {
			LOG.error("Erro ao salvar o nutricionista: " + e.getMessage(), e);		}
		
	}
	
	
}
