package br.com.fiap.testes;

import java.util.Calendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.entity.Livro;

public class TesteCadastroLivro {

	public static void main(String[] args) {

		EntityManagerFactory fabrica  =Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
		EntityManager em = fabrica.createEntityManager();
		
		Livro livro = new Livro(123, 
				"Prince Of Thorns", 
				50, 
				Calendar.getInstance(),
				null);
		
		em.getTransaction().begin();
		em.persist(livro);
		em.getTransaction().commit();
		System.out.println("Livro Cadastrado!");
			
	}

}
