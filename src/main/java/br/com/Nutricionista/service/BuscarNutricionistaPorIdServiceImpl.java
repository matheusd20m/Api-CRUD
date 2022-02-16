package br.com.Nutricionista.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.Nutricionista.EsquelletoBD.Nutricionista;
import br.com.Nutricionista.exception.NutricionistaNotFoundException;
import br.com.Nutricionista.repository.Repository;


@Service
public class BuscarNutricionistaPorIdServiceImpl {

	@Autowired
	private Repository repository;
	
	public Nutricionista buscarPorId(Long id) 
			throws NutricionistaNotFoundException {
		
		Optional<Nutricionista> optionalNutricionista = getOptional(id);
		
		Nutricionista nutricionista = null;
		
		if(!optionalNutricionista.isPresent()) {
			throw new NutricionistaNotFoundException("Nutricionista não encontrado atraves do ID: " + id);
		}else {
			nutricionista = optionalNutricionista.get();
		}
		return nutricionista;
		
	}


	private Optional<Nutricionista> getOptional(Long id) {
		Optional<Nutricionista> optionalNutricionista = repository
				.findById(id);
		return optionalNutricionista;
	}
	
	
	public void deletarPorId(Long id) 
			throws NutricionistaNotFoundException {
		
		Optional<Nutricionista> optionalNutricionista = getOptional(id);
		if(!optionalNutricionista.isPresent()) {
			throw new NutricionistaNotFoundException("Nutricionista não encontrado atraves do ID: " + id);
		}else {
			repository.delete(optionalNutricionista.get());;

		}
		
	}
}
