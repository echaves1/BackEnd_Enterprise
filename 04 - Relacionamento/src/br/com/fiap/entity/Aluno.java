package br.com.fiap.entity;

import java.util.Calendar;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="TB_ALUNO")
@SequenceGenerator(name="seqAluno", sequenceName="SQ_TB_ALUNO", allocationSize=1)
public class Aluno {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seqAluno")
	private int rm;
	
	@Column(name="NM_NOME", length=150, nullable=false)
	private String nome;
	
	@Temporal(TemporalType.DATE)
	@Column(name="DT_DATA")
	private Calendar dataNascimento;
	
	
	@ManyToOne(cascade=CascadeType.PERSIST)
	private GrupoAM grupo;

	
	public Aluno(int rm, String nome, Calendar dataNascimento, GrupoAM grupo) {
		super();
		this.rm = rm;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.grupo = grupo;
	}


	public Aluno() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getRm() {
		return rm;
	}


	public void setRm(int rm) {
		this.rm = rm;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Calendar getDataNascimento() {
		return dataNascimento;
	}


	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}


	public GrupoAM getGrupo() {
		return grupo;
	}


	public void setGrupo(GrupoAM grupo) {
		this.grupo = grupo;
	}
	
	
	
	
}
