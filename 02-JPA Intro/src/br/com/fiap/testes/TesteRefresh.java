package br.com.fiap.testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.entity.Pizza;

public class TesteRefresh {

	public static void main(String[] args) {

		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
		EntityManager em =fabrica.createEntityManager();
		
		//Buscar uma pizza no banco
		Pizza pizza = em.find(Pizza.class, 1);
		
		System.out.println(pizza.getSabor());
		pizza.setSabor("Milho e atum");
		System.out.println(pizza.getSabor());
		
		//Atualizar a pizza com as info do banco
		em.refresh(pizza);
		System.out.println(pizza.getSabor());
		
		System.exit(0);
	}

}
