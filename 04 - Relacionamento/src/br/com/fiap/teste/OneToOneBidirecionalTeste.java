package br.com.fiap.teste;

import javax.persistence.EntityManager;

import br.com.fiap.dao.GrupoDAO;
import br.com.fiap.entity.GrupoAM;
import br.com.fiap.entity.ProjetoAM;
import br.com.fiap.factory.EntityManagerFactorySingleton;
import br.com.fiap.impl.GrupoAmDaoImpl;

public class OneToOneBidirecionalTeste {

	public static void main(String[] args) {
//Buscar um grupo e exibir as propriedades do projeto
		
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		
		GrupoDAO dao = new GrupoAmDaoImpl(em);
		
		//Pesquisa pelo grupo
		GrupoAM grupo = dao.pesquisar(1);
		
		ProjetoAM projeto = grupo.getProjeto();
		
		System.out.println("Tema:" + projeto.getTema());
		System.out.println("Nota:" + projeto.getNota());
		
		em.close();
		System.exit(0);
	}

}
