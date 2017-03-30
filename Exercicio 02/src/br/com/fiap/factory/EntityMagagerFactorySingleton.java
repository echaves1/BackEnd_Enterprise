package br.com.fiap.factory;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityMagagerFactorySingleton {

	private static EntityManagerFactory fabrica;
	
	private EntityMagagerFactorySingleton(){
		
	}
	
	public static EntityManagerFactory getInstance(){
		if(fabrica == null){
			fabrica = Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
		}
		
		return fabrica;
		
	}
}
