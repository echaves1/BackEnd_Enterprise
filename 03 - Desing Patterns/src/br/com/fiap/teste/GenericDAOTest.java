package br.com.fiap.teste;


import javax.persistence.EntityManager;

import org.junit.Assert;
import org.junit.Test;

import br.com.fiap.dao.ServicoDAO;
import br.com.fiap.entity.Servico;
import br.com.fiap.exception.DBException;
import br.com.fiap.factory.EntityManagerFactorySingleton;
import br.com.fiap.impl.ServicoDAOimpl;

public class GenericDAOTest {

	@Test
	public void cadastroTest() {
		//CHAMAR O ENTITY MANAGER
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		//INSTANCIAR OS OBJETO
		ServicoDAO dao = new ServicoDAOimpl(em);
		Servico servico = new Servico();
		servico.setNome("Banho");
		servico.setPreco(40);
		//CHAMAR O SERVIÇO
				try {
					dao.cadastrar(servico);
					dao.salvar();
		//TESTAR O RESULTADO
				Assert.assertNotEquals(servico.getCodigo(), 0);
	
				} catch (Exception e) {
					e.printStackTrace();
					Assert.fail();
				}
				finally {
					em.close();
				}
	}
	
	@Test
	public void buscaTeste(){
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
	
		ServicoDAO dao = new ServicoDAOimpl(em);
		
		Servico s = new Servico();
		
		s.setNome("Hue");
		s.setPreco(500);
		
		try {
			
			dao.cadastrar(s);
			dao.salvar();
		} catch (DBException e) {
			e.printStackTrace();
			Assert.fail("Erro no cadastro");
		} 
		
		Servico  buscar = dao.pesquisar(s.getCodigo());
		
		Assert.assertNotNull(buscar);
	
		em.close();
	}
	
	@Test
	public void removeTest(){
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		//instanciar os objetos
		ServicoDAO dao = new ServicoDAOimpl(em);
		
		Servico s = new Servico();
		s.setCodigo(2);
		s.setNome("Hue");
		s.setPreco(500);
		
		try {
			//cadastrar um serviço
			dao.cadastrar(s);
			dao.salvar();
			
			//remover um serviço
			dao.remover(s.getCodigo());
			dao.salvar();
			
			//testar o resultado
			Servico busca = dao.pesquisar(s.getCodigo());
			Assert.assertNull(busca);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
		finally{
			
			em.close();
			
		}
		
	}
	
	@Test
	public void atualizaTest(){
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		ServicoDAO dao = new ServicoDAOimpl(em);
	
		Servico servico = new Servico();
		servico.setNome("Banho e tosa");
		servico.setPreco(60);
		
		try {
			//cadastra servico
			dao.cadastrar(servico);
			dao.salvar();
			
			//Atualizar o servico
			servico.setNome("Jantar");
			servico.setPreco(50);
			
			dao.alterar(servico);
			dao.salvar();
			
			//Valida as atualizaçoes
			Servico busca = dao.pesquisar(servico.getCodigo());
			Assert.assertEquals(busca.getPreco(), servico.getPreco(), 0.0);
			Assert.assertEquals(busca.getNome(), servico.getNome());
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	
	
	
	
	}

}
