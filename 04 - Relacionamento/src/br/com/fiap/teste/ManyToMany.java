package br.com.fiap.teste;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import javax.persistence.EntityManager;

import br.com.fiap.dao.ProfessorDAO;
import br.com.fiap.dao.ProjetoDAO;
import br.com.fiap.entity.GrupoAM;
import br.com.fiap.entity.Professor;
import br.com.fiap.entity.ProjetoAM;
import br.com.fiap.exception.DBException;
import br.com.fiap.factory.EntityManagerFactorySingleton;
import br.com.fiap.impl.ProfessorDaoImpl;
import br.com.fiap.impl.ProjetoAmDaoImpl;

public class ManyToMany {

	public static void main(String[] args) throws DBException{
		// TODO cadastrar um projeto, grupo e orientadores

		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		//Instancias 2 grupos
		GrupoAM grupo1 = new GrupoAM(0, "SIGLO");
		GrupoAM grupo2 = new GrupoAM(0, "Grupinho Topzera");
		
		//Instanciar 2 professores
		Professor professor1 = new Professor(0, "Humberto", new GregorianCalendar(1998, Calendar.MAY, 07), 1500);
		Professor professor2 = new Professor(0, "Rita", new GregorianCalendar(1998, Calendar.MAY, 07), 1500);
		
		/*List<Professor> professores = new ArrayList<Professor>();
		professores.add(professor1);
		professores.add(professor2);
			*/
		
		//Instancia de projetos passando o grupo
		ProjetoAM projeto1 = new ProjetoAM(0, "Seila", 10, new GregorianCalendar(1998, Calendar.MAY, 07), new GregorianCalendar(1998, Calendar.MAY, 07), grupo1);
		ProjetoAM projeto2= new ProjetoAM(0, "Seila", 10, new GregorianCalendar(1998, Calendar.MAY, 07), new GregorianCalendar(1998, Calendar.MAY, 07), grupo2);
		
		//Relacionar os Professores com o Projeto
		List<ProjetoAM> projetos = new ArrayList<>();
		projetos.add(projeto1);
		projetos.add(projeto2);
		
		//Relacionar o projeto com os professores
		professor1.setProjeto(projetos);
		professor2.setProjeto(projetos);
		
		//Instanciar DAO do projeto e do professor
		ProjetoDAO projetoDao = new ProjetoAmDaoImpl(em);
		ProfessorDAO profDao = new ProfessorDaoImpl(em);
		
		
		//Cadastrar os projetos
		profDao.cadastrar(professor1);
		profDao.cadastrar(professor2);
		projetoDao.cadastrar(projeto1);
		projetoDao.cadastrar(projeto2);

		
		//COMMIT
		try {
			projetoDao.salvar();
		} catch (DBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Sucesso !!
		em.close();
		System.exit(0);
				
		
	}


}
