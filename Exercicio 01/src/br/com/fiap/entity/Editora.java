package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="TB_EDITORA")
public class Editora {

	public Editora() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Editora(int id, String cnpj, String nome, String endereco) {
		super();
		this.id = id;
		this.cnpj = cnpj;
		this.nome = nome;
		this.endereco = endereco;
	}
	@Id
	@Column(name="ID_PIZZA")
	private int id;
	
	@Column(name="NR_CNPJ")
	private String cnpj;
	
	@Column(name="NM_NOME")
	private String nome;
	
	@Column(name="DS_ENDERECO")
	private String endereco;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	
	
}
