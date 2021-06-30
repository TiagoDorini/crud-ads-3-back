package br.com.tiago.tat.ads.cliente.dto;

import java.util.List;
import java.util.stream.Collectors;

import br.com.tiago.tat.ads.cliente.model.Cliente;

public class ClienteDTO {

	public Long id;

	public String nome;

	public String sobreNome;

	public String nacionalidade;

	public String profissao;

	public String endereco;

	public String cpf;

	public ClienteDTO(Cliente cliente) {
		this.id = cliente.getId();
		this.nome = cliente.getNome();
		this.sobreNome = cliente.getSobreNome();
		this.nacionalidade = cliente.getNacionalidade();
		this.endereco = cliente.getEndereco();
		this.cpf = cliente.getCpf();
		this.profissao = cliente.getProfissao();
	}

	Long getId() {
		return id;
	}

	void setId(Long id) {
		this.id = id;
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

	String getEndereco() {
		return endereco;
	}

	void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	String getCpf() {
		return cpf;
	}

	void setCpf(String cpf) {
		this.cpf = cpf;
	}

	String getProfissao() {
		return profissao;
	}

	void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public static List<ClienteDTO> converter(List<Cliente> clientes) {
		return clientes.stream().map(ClienteDTO::new).collect(Collectors.toList());
	}

}
