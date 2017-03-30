package br.com.fiap.factory;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerFactorySingleton {

	private static EntityManagerFactory fabrica;
	
	private EntityManagerFactorySingleton() {
	}
	
	@SuppressWarnings("unused")
	private static EntityManagerFactory getInstance(){
		
		if(fabrica==null){
			fabrica = Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
			
		}
		
		return fabrica;
		
	}
	
}
