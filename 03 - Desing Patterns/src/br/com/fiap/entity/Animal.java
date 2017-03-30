package br.com.fiap.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="TB_ANIMAL")
@SequenceGenerator(name="seqAnimal", sequenceName="SQ_ANIMAL", allocationSize=1)
public class Animal {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="seqAnimal")
	@Column(nullable=true, name="NM_ANIMAL")
	private int codigo;
	
	@Column(nullable=true, name="NM_NOME")
	private String nome;
	
	@Column(nullable=true, name="DS_ESPECIE")
	private String especie;
	
	@Column(nullable=true, name="DS_PORTE")
	private Porte porte;
	
	@Column(nullable=false, name="FL_FOTO")
	private byte[] foto;
	
	@Temporal(TemporalType.DATE)
	@Column(nullable=true, name="DT_NASCIMENTO")
	private Calendar dataNascimento;

	public Animal() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Animal(int codigo, String nome, String especie, Porte porte, byte[] foto, Calendar dataNascimento) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.especie = especie;
		this.porte = porte;
		this.foto = foto;
		this.dataNascimento = dataNascimento;
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

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public Porte getPorte() {
		return porte;
	}

	public void setPorte(Porte porte) {
		this.porte = porte;
	}

	public byte[] getFoto() {
		return foto;
	}

	public void setFoto(byte[] foto) {
		this.foto = foto;
	}

	public Calendar getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	
}
