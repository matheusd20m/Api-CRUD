package br.com.Nutricionista.service;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

import br.com.Nutricionista.EsquelletoBD.Nutricionista;
import br.com.Nutricionista.exception.NutricionistaRecursosException;
import br.com.Nutricionista.recursos.model.Recursos;

@Component
public class NutricionistaConversor {

	
	public Nutricionista conversor(Recursos recursos) 
			throws NutricionistaRecursosException{
		
		try {
			Nutricionista nutricionista = new Nutricionista();
			
			Long idPaciente = checkIdPaciente(
					recursos.getIdPaciente());
			
			LocalDate idade = checkIdade(recursos.getIdade());
			
			nutricionista.setIdPaciente(idPaciente);
			nutricionista.setIdade(idade);
			nutricionista.setCodigoRegistro(recursos.getCodigoRegistro());
			nutricionista.setNome(recursos.getNome());
			return nutricionista;
			
		}catch (Exception e) {
			throw new NutricionistaRecursosException("Falha ao Converter o Resource para entidade, resource: " 
					+ recursos);
			
		}
	}
	
	private Long checkIdPaciente(String idPaciente) {
		return Long.parseLong(idPaciente);
		}
	private LocalDate checkIdade(String idade) {
		return LocalDate.parse(idade);
	}
}
