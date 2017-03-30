package br.com.fiap.factory;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerFactorySingleton {

	//Atributo private e estatico 
	private static EntityManagerFactory fabrica;
	
	//construtor privado
	private EntityManagerFactorySingleton(){	}
	
	//Metodo que retorna a unica instancia de EntityManagerFactorySingleton
	public static EntityManagerFactory getInstance(){
		if(fabrica == null){
			fabrica = Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
		}
		return fabrica;
	}
	
}
