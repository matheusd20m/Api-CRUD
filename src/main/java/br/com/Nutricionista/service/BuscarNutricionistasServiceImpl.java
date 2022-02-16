package br.com.Nutricionista.service;

import java.util.List;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.Nutricionista.EsquelletoBD.Nutricionista;
import br.com.Nutricionista.repository.Repository;



@Service
public class BuscarNutricionistasServiceImpl {


	private static final Logger LOG = Logger
			.getLogger(BuscarNutricionistasServiceImpl.class); 
	
	@Autowired
	private Repository repository;
	
	public List<Nutricionista> buscarTodosOsNutricionistas(){
		List<Nutricionista> listNutricionista = repository.findAll();
		return listNutricionista;
	
	}
}
