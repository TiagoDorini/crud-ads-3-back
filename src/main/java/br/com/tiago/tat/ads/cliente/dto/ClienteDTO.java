package br.com.tiago.tat.ads.cliente.dto;

import java.util.List;
import java.util.stream.Collectors;

import br.com.tiago.tat.ads.cliente.model.Cliente;

public class ClienteDTO {

	public String nome;

	public String sobreNome;

	public String nacionalidade;

	public ClienteDTO(Cliente cliente) {
		this.nome = cliente.getNome();
		this.sobreNome = cliente.getSobreNome();
		this.nacionalidade = cliente.getNacionalidade();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobreNome() {
		return sobreNome;
	}

	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public static List<ClienteDTO> converter(List<Cliente> clientes) {
		return clientes.stream().map(ClienteDTO::new).collect(Collectors.toList());
	}
	

}
