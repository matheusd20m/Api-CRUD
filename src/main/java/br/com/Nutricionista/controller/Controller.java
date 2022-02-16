package br.com.Nutricionista.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.Nutricionista.EsquelletoBD.Nutricionista;
import br.com.Nutricionista.exception.NutricionistaNotFoundException;
import br.com.Nutricionista.recursos.model.Recursos;
import br.com.Nutricionista.service.BuscarNutricionistaPorIdServiceImpl;
import br.com.Nutricionista.service.BuscarNutricionistasServiceImpl;
import br.com.Nutricionista.service.CadastroService;

@RestController
@RequestMapping(value = "/api")
public class Controller {
	
	@Autowired
	private BuscarNutricionistasServiceImpl serviceBuscar;
	
	@Autowired
	private CadastroService servicecadastro;
	
	@Autowired
	private BuscarNutricionistaPorIdServiceImpl serviceBuscarPorId;

	
	
	@GetMapping(path = "/nutricionista")
	public List<Nutricionista> buscarNutricionistas() {
		return serviceBuscar.buscarTodosOsNutricionistas();
	}
	
	@GetMapping(path = "/nutricionista/id/{id}")
	public Nutricionista buscarNutricionistasPorId(
			@PathVariable (name = "id", required = true) Long id) 
			throws NutricionistaNotFoundException {
		return serviceBuscarPorId.buscarPorId(id);
	}
	
	
	
	@PostMapping(path = "/nutricionista/save")
	public void salvarNutricionista(
			@RequestBody Recursos nutricionista ) {
		servicecadastro.cadastro(nutricionista);
		
	}
	
	
	@DeleteMapping(path = "/nutricionista/delete/{id}")
	public void deleteNutricionista(
			@PathVariable (name = "id", required = true) Long id) 
					throws NutricionistaNotFoundException {
		serviceBuscarPorId.deletarPorId(id);
		}
}
