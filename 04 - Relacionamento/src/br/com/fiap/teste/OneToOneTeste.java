package br.com.fiap.teste;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;

import br.com.fiap.dao.GrupoDAO;
import br.com.fiap.dao.ProjetoDAO;
import br.com.fiap.entity.GrupoAM;
import br.com.fiap.entity.ProjetoAM;
import br.com.fiap.exception.DBException;
import br.com.fiap.factory.EntityManagerFactorySingleton;
import br.com.fiap.impl.GrupoAmDaoImpl;
import br.com.fiap.impl.ProjetoAmDaoImpl;

public class OneToOneTeste {

	public static void main(String[] args) throws DBException {
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		
		GrupoDAO gamdao = new GrupoAmDaoImpl(em);
		ProjetoDAO pamdao = new ProjetoAmDaoImpl(em);
		GrupoAM gam = new GrupoAM(0, "SigloXXII");
		
		ProjetoAM pam = new ProjetoAM(0, "Advocacia LCA", 0, Calendar.getInstance(), new GregorianCalendar(2017, Calendar.OCTOBER, 2), gam);
	
		//gamdao.cadastrar(gam);
		pamdao.cadastrar(pam);;
		
		try {
			gamdao.salvar();
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
			em.close();
			System.exit(0);
		
	}
}
