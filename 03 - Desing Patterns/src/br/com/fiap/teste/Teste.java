package br.com.fiap.teste;

import java.util.Calendar;
import java.util.GregorianCalendar;

import br.com.fiap.dao.AnimalDAO;
import br.com.fiap.entity.Animal;
import br.com.fiap.entity.Porte;
import br.com.fiap.exception.DBException;
import br.com.fiap.impl.AnimalDAOImpl;

public class Teste {

	public static void main(String[] args) throws DBException {

		
			Animal animal = new Animal(0, 
					"Nina", 
					"Felino", 
					Porte.PEQUENO, 
					null, 
					new GregorianCalendar(2013, Calendar.MARCH, 3));
			
			AnimalDAO dao = new AnimalDAOImpl(null);
			
		try {
			dao.cadastrar(animal);
			System.out.println("Animal Cadastrado");
		} catch (DBException e) {
		System.out.println("Erro ao cadastrar");
		e.printStackTrace();
		}
		
		System.exit(0);
	}

}
