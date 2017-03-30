package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="TB_TECNICO")
@SequenceGenerator(name="seqTecnico", sequenceName="SQ_TB_TECNICO", allocationSize=1)
public class Tecnico {

	@Id
	@GeneratedValue(generator="seqTecnico", strategy=GenerationType.SEQUENCE)
	@Column(name="CD_TECNICO")
	private int codigo;
	
	@Column(name="NM_TECNICO")
	private String nome;



	public Tecnico() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Tecnico(int codigo, String nome) {
		super();
		this.codigo = codigo;
		this.nome = nome;
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

}
