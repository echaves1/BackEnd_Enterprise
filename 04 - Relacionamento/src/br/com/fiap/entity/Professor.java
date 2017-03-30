package br.com.fiap.entity;

import java.util.Calendar;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="TB_PROFESSOR")
@SequenceGenerator(name="seqProf", sequenceName="SQ_TB_PROFESSOR", allocationSize=1)
public class Professor {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seqProf")
	@Column(name="CD_CODIGO")
	private int codigo;
	
	@Column(name="NM_NOME")	
	private String nome;
	
	@Temporal(TemporalType.DATE) //somente a data
	@Column(name="DT_ADIMISSAO")
	private Calendar dataAdimisao;
	
	@Column(name="VL_SALARIO")
	private float salario;
	
	
	//prof faz parte de um grupo
	@ManyToMany
	@JoinTable(name="TB_PROFESSOR_PROJETO", 
	joinColumns=@JoinColumn(name="NM_NOME"),
	inverseJoinColumns=@JoinColumn(name="CD_PROJETO"))
	
	private List<ProjetoAM> projeto;
	
	
	
	
	
	public List<ProjetoAM> getProjeto() {
		return projeto;
	}
	public void setProjeto(List<ProjetoAM> projeto) {
		this.projeto = projeto;
	}
	public Professor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Professor(int codigo, String nome, Calendar dataAdimisao, float salario) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.dataAdimisao = dataAdimisao;
		this.salario = salario;
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
	public Calendar getDataAdimisao() {
		return dataAdimisao;
	}
	public void setDataAdimisao(Calendar dataAdimisao) {
		this.dataAdimisao = dataAdimisao;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	
	
	
}
