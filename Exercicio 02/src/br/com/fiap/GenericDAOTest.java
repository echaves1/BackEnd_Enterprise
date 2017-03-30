package br.com.fiap;


import javax.persistence.EntityManager;

import org.junit.Test;

import br.com.fiap.entity.Livro;
import br.com.fiap.factory.EntityMagagerFactorySingleton;
import fiap.com.br.dao.LivroDAO;

public class GenericDAOTest {

	@Test
	public void Cadastro() {
		
		EntityManager em = EntityMagagerFactorySingleton.getInstance().createEntityManager();
		
	
	
	}

}
