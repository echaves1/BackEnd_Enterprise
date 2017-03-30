package br.com.fiap.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="TB_LIVRO")
public class Livro {
	
	public Livro(int isbn, String titulo, double preco, Calendar data_lancamento, byte[] foto) {
		super();
		this.isbn = isbn;
		this.titulo = titulo;
		this.preco = preco;
		this.data_lancamento = data_lancamento;
		this.foto = foto;
	}

	public Livro() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Id
	@Column(name="NR_ISBN")
	private int isbn;
	
	@Column(name="NM_TITULO")
	private String titulo;
	
	@Column(name="VL_PRECO")
	private double preco;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DT_DATAL",nullable=false)
	private Calendar data_lancamento;
	
	@Lob
	private byte[] foto;

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public Calendar getData_lancamento() {
		return data_lancamento;
	}

	public void setData_lancamento(Calendar data_lancamento) {
		this.data_lancamento = data_lancamento;
	}

	public byte[] getFoto() {
		return foto;
	}

	public void setFoto(byte[] foto) {
		this.foto = foto;
	}
	
	
	
	
}
