package br.com.fiap.entity;

import java.util.Calendar;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="TB_PROJETO_AM")
@SequenceGenerator(name="seqProj", sequenceName="SQ_TB_GRUPO_AM", allocationSize=1)

public class ProjetoAM {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="seqProj")
	@Column(nullable=false, name="ID_CODIGO")
	private int codigo;
	
	@Column(nullable=false, name="DS_TEMA", length=200)
	private String tema;
	
	@Column(name="VL_NOTA")
	private double nota;
	
	@Temporal(TemporalType.DATE)
	@Column(nullable=false, name="DT_INICIO")
	private Calendar data_Inicio;
	
	@Temporal(TemporalType.DATE)
	@Column(nullable=false, name="DT_ENTREGA")
	private Calendar data_Entrega;
	
	@OneToOne(cascade={CascadeType.PERSIST, CascadeType.REMOVE})
	@JoinColumn(name="CD_GRUPO", nullable=false)
	private GrupoAM grupo;

	@ManyToMany(mappedBy="projeto")
	private List<Professor> orientadores;
	
	
	
	
	public List<Professor> getOrientadores() {
		return orientadores;
	}

	public void setOrientadores(List<Professor> orientadores) {
		this.orientadores = orientadores;
	}

	public ProjetoAM(int codigo, String tema, double nota, Calendar data_Inicio, Calendar data_Entrega, GrupoAM grupo) {
		super();
		this.codigo = codigo;
		this.tema = tema;
		this.nota = nota;
		this.data_Inicio = data_Inicio;
		this.data_Entrega = data_Entrega;
		this.grupo = grupo;
	}

	public ProjetoAM() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	public Calendar getData_Inicio() {
		return data_Inicio;
	}

	public void setData_Inicio(Calendar data_Inicio) {
		this.data_Inicio = data_Inicio;
	}

	public Calendar getData_Entrega() {
		return data_Entrega;
	}

	public void setData_Entrega(Calendar data_Entrega) {
		this.data_Entrega = data_Entrega;
	}

	public GrupoAM getGrupo() {
		return grupo;
	}

	public void setGrupo(GrupoAM grupo) {
		this.grupo = grupo;
	}
	
	
	
	
	
}
