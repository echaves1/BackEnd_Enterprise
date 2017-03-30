package br.com.fiap.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="TB_GRUPO_AM")
@SequenceGenerator(name="seqGrupo", sequenceName="SQ_TB_GRUPO_AM", allocationSize=1)
public class GrupoAM {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="seqGrupo")
	@Column(nullable=false, name="ID_CODIGO")
	private int codigo;
	
	@Column(nullable=false,length=50, name="NM_GRUPO")
	private String nome;

	@OneToOne(mappedBy="grupo", fetch=FetchType.EAGER)
	private ProjetoAM projeto;
	
	@OneToMany(mappedBy="grupo", cascade=CascadeType.PERSIST)
	private List<Aluno> alunos = new ArrayList<Aluno>();
	
	
	
	public List<Aluno> getAlunos() {
		return alunos;
	}

	//Add os alunos no grupo
	public void addAluno(Aluno aluno){
		alunos.add(aluno);
		aluno.setGrupo(this);
	}
	
	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}

	public ProjetoAM getProjeto() {
		return projeto;
	}

	public void setProjeto(ProjetoAM projeto) {
		this.projeto = projeto;
	}

	public GrupoAM() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GrupoAM(int codigo, String nome) {
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
