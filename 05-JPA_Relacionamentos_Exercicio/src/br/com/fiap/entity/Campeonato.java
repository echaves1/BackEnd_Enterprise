package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="TB_CAMPEONATO")
@SequenceGenerator(name="seqCampeonato", sequenceName="SQ_TB_CAMPEONATO",allocationSize=1)

public class Campeonato {
	
	@Id
	@GeneratedValue(generator="seqCampeonato", strategy=GenerationType.SEQUENCE)
	@Column(name="CD_CODIGO")
	private int codigo;
	
	@Column(name="NM_CAMPEONATO")
	private String nome;
	
	
	
}
