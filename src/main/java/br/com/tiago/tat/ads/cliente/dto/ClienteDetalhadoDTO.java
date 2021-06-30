package br.com.tiago.tat.ads.cliente.dto;

import java.util.List;
import java.util.stream.Collectors;

import br.com.tiago.tat.ads.cliente.model.Cliente;

public class ClienteDetalhadoDTO {

	private String nome;

	private String sobreNome;

	private String nacionalidade;

	private String profissao;

	private String endereco;

	private String cpf;

	public ClienteDetalhadoDTO(Cliente cliente) {
		this.nome = cliente.getNome();
		this.sobreNome = cliente.getSobreNome();
		this.nacionalidade = cliente.getNacionalidade();
		this.profissao = cliente.getProfissao();
		this.endereco = cliente.getEndereco();
		this.cpf = cliente.getCpf();
	}

	String getNome() {
		return nome;
	}

	void setNome(String nome) {
		this.nome = nome;
	}

	String getSobreNome() {
		return sobreNome;
	}

	void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}

	String getNacionalidade() {
		return nacionalidade;
	}

	void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	String getProfissao() {
		return profissao;
	}

	void setProfissao(String profissao) {
		this.profissao = profissao;
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

	public static List<ClienteDetalhadoDTO> converter(List<Cliente> cliente) {
		return cliente.stream().map(ClienteDetalhadoDTO::new).collect(Collectors.toList());
	}

}
