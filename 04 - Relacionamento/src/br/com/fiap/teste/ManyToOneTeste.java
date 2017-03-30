package br.com.fiap.teste;

import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.persistence.EntityManager;
import br.com.fiap.dao.GrupoDAO;
import br.com.fiap.entity.Aluno;
import br.com.fiap.entity.GrupoAM;
import br.com.fiap.exception.DBException;
import br.com.fiap.factory.EntityManagerFactorySingleton;
import br.com.fiap.impl.GrupoAmDaoImpl;

public class ManyToOneTeste {

	public static void main(String[] args) throws DBException {
		//cadastrar grupo e aluno
		
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		
		GrupoDAO dao = new GrupoAmDaoImpl(em);
		
		GrupoAM grupo = new GrupoAM(0, "Siglo XXII");
		Aluno aluno = new Aluno(0, "Eri", new GregorianCalendar(1998, Calendar.MAY, 07), grupo);
		
//		//CRIAR UMA LISTA BDE ALUNOS E ADICIONA-LOS
//		List<Aluno> alunos = new ArrayList<Aluno>();
//		alunos.add(aluno);
//		
//		grupo.setAlunos(alunos);
		
		grupo.addAluno(aluno);

		dao.cadastrar(grupo);
		
		try {
			dao.salvar();;
		} catch (DBException e) {
			e.printStackTrace();
		}
		
		
	}

}
