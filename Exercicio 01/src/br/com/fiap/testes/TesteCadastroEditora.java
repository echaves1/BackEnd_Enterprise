package br.com.fiap.testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.entity.Editora;

public class TesteCadastroEditora {

	public static void main(String[] args) {

		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
		EntityManager em = fabrica.createEntityManager();
		
		Editora editora = new Editora(1,
				"12345678910", 
				"Darck",
				"Rua sei lá"
				);
		
		em.getTransaction().begin();
		em.persist(editora);
		em.getTransaction().commit();
		System.out.println("Editora Cadastrada!");
		
	}

}
