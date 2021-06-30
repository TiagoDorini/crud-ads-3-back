package br.com.tiago.tat.ads.cliente.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import br.com.tiago.tat.ads.cliente.form.ClienteFORM;

@Entity
public class Cliente implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull
	private String nome;

	@NotNull
	@Column(name = "sobre_nome")
	private String sobreNome;

	@NotNull
	private String nacionalidade;

	@NotNull
	private String profissao;

	@NotNull
	private String endereco;

	@NotNull
	private String cpf;

	public Cliente() {

	}

	public Cliente(ClienteFORM clienteForm) {
		this.nome = clienteForm.getNome();
		this.sobreNome = clienteForm.getSobreNome();
		this.nacionalidade = clienteForm.getNacionalidade();
		this.profissao = clienteForm.getProfissao();
		this.endereco = clienteForm.getEndereco();
		this.cpf = clienteForm.getCpf();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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

	@Override
	public String toString() {
		return "id:" + id + ", nome:" + nome + ", sobreNome:" + sobreNome + ", nacionalidade:" + nacionalidade
				+ ", profissao:" + profissao + ", endereco:" + endereco + ", cpf:" + cpf;
	}

}
