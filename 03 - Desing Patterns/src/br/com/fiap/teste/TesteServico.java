package br.com.fiap.teste;


import br.com.fiap.dao.ServicoDAO;
import br.com.fiap.entity.Servico;
import br.com.fiap.exception.DBException;
import br.com.fiap.impl.ServicoDAOimpl;

public class TesteServico {

	public static void main(String[] args) {

		Servico servico = new Servico(0, 
				"tosa", 
				50
				);
		
		ServicoDAO dao = new ServicoDAOimpl(null);
		
	try {
		dao.cadastrar(servico);
		System.out.println("Serviço Cadastrado");
	} catch (DBException e) {
	System.out.println("Erro ao cadastrar");
	e.printStackTrace();
	}
	
	System.exit(0);
		
		
	}

}
