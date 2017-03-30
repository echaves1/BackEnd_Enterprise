package br.com.fiap.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="TB_TIME")
@SequenceGenerator(name="seqTime", sequenceName="SQ_TB_TIME",allocationSize=1 )
public class Time {

	@Id
	@GeneratedValue(generator="seqTime", strategy=GenerationType.SEQUENCE)
	@Column(name="CD_CODIGO")
	private int codigo;
	
	@Column(name="NM_NOME")
	private String  nome;
	
	@Column(name="DT_FUNCACAO")
	private Calendar dtFundacao;
	
	@Column(name="NR_TITULO")
	private int nrTitulo;


	
	public Time(int codigo, String nome, Calendar dtFundacao, int nrTitulo) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.dtFundacao = dtFundacao;
		this.nrTitulo = nrTitulo;
	}

	public Time() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Calendar getDtFundacao() {
		return dtFundacao;
	}

	public void setDtFundacao(Calendar dtFundacao) {
		this.dtFundacao = dtFundacao;
	}

	public int getNrTitulo() {
		return nrTitulo;
	}

	public void setNrTitulo(int nrTitulo) {
		this.nrTitulo = nrTitulo;
	}
	
	
	
}
