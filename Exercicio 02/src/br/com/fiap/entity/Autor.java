package br.com.fiap.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="TB_AUTOR")
public class Autor {
	
	public Autor(int id, String name, String sobrenome, Calendar data_nascimento, Sexo sexo) {
		super();
		this.id = id;
		this.name = name;
		this.sobrenome = sobrenome;
		this.data_nascimento = data_nascimento;
		this.sexo = sexo;
	}

	public Autor() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Id
	@Column(name="ID_AUTOR")
	private int id;
	
	@Column(name="NM_NOME")
	private String name;
	
	@Column(name="NM_SOBRENOME")
	private String sobrenome;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DT_DATAN",nullable=false)
	private Calendar data_nascimento;
	
	@Column(name="DS_SEXO")
	private Sexo sexo;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public Calendar getData_nascimento() {
		return data_nascimento;
	}

	public void setData_nascimento(Calendar data_nascimento) {
		this.data_nascimento = data_nascimento;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
	
	
	
	
}
