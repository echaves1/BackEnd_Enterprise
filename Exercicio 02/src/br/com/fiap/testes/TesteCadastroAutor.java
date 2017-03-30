package br.com.fiap.testes;

import java.util.Calendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.entity.Autor;
import br.com.fiap.entity.Sexo;

public class TesteCadastroAutor {

	public static void main(String[] args) {

		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
		EntityManager em = fabrica.createEntityManager();
		
		Autor autor = new Autor(1, 
				"Fulano",
				"Silva",
				Calendar.getInstance(),
				Sexo.FEMININO
				);
		
		em.getTransaction().begin();
		em.persist(autor);
		em.getTransaction().commit();
		System.out.println("Autor cadastrado!");
		
	}

}
