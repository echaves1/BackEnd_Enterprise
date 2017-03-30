package br.com.fiap.testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.entity.Pizza;

public class TesteAtualizacao {

	public static void main(String[] args) {
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
		EntityManager em = fabrica.createEntityManager();
		
		Pizza pizza = em.find(Pizza.class, 1);
		
		pizza.setPreco(50);
		em.getTransaction().begin();
		em.merge(pizza);
		em.getTransaction().commit();
		
		System.out.println("Pizza cadastrada!");
		System.exit(0);
		
	}

}
