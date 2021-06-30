package br.com.tiago.tat.ads.cliente.form;

import javax.validation.constraints.NotNull;

public class ClienteFORM {

	@NotNull(message = "NOME Não deve ser nulo")
	private String nome;

	@NotNull(message = "SOBRENOME não deve ser nulo")
	private String sobreNome;

	@NotNull(message = "NACIONALIDADE não deve ser nulo")
	private String nacionalidade;

	@NotNull(message = "PROFISSÃO não deve ser nulo")
	private String profissao;

	@NotNull(message = "ENDEREÇO não deve ser nulo")
	private String endereco;

	@NotNull(message = "CPF não deve ser nulo")
	private String cpf;

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

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	

}
