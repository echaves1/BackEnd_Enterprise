package br.com.fiap.testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.entity.Pizza;

public class TesteRemocao {

	public static void main(String[] args) {

		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
		EntityManager em = fabrica.createEntityManager();
		
		Pizza pizza  =em.find(Pizza.class, 1);
		pizza.setSabor("Marguerita");
		em.remove(pizza);
		
		em.getTransaction().begin(); //inicia uma transação
		em.persist(pizza);
		em.getTransaction().commit();//finaliza com commit
		System.out.println("Pizza deletada!");
		System.exit(0);
		
	}

}
