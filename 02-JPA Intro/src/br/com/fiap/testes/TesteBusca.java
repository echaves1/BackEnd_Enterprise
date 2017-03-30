package br.com.fiap.testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.entity.Pizza;

public class TesteBusca {

	public static void main(String[] args) {
		
			EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
			EntityManager em = fabrica.createEntityManager();
			
			Pizza pizza = em.find(Pizza.class, 1);
			System.out.println(pizza.getSabor().toString());
		
	}

}
