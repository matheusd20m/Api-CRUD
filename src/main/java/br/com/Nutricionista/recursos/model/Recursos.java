package br.com.Nutricionista.recursos.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Recursos {

	@JsonProperty("id")
	private String id;
	
	@JsonProperty("nome_nutricionista")
	private String nome;
	
	@JsonProperty("idade")
	private String idade;
	
	@JsonProperty("codigo_registro")
	private String codigoRegistro;
	
	@JsonProperty("id_paciente")
	private String idPaciente;
	
	
	public Recursos(String id, String nome, String idade, String codigoRegistro, String idPaciente) {
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.codigoRegistro = codigoRegistro;
		this.idPaciente = idPaciente;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getIdPaciente() {
		return idPaciente;
	}
	
	public void setIdPaciente(String idPaciente) {
		this.idPaciente = idPaciente;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	public String getCodigoRegistro() {
		return codigoRegistro;
	}

	public void setCodigoRegistro(String codigoRegistro) {
		this.codigoRegistro = codigoRegistro;
	}



	@Override
	public String toString() {
		return "Recursos [nome=" + nome + ", idade=" + idade + ", codigoRegistro=" + codigoRegistro + ", idPaciente="
				+ idPaciente + "]";
	}
	
	
	
	
}
