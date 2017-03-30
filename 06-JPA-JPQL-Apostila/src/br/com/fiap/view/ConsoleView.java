package br.com.fiap.view;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.fiap.dao.ClienteDAO;
import br.com.fiap.dao.EntityManagerFactorySingleton;
import br.com.fiap.dao.PacoteDAO;
import br.com.fiap.dao.TransporteDAO;
import br.com.fiap.dao.impl.ClienteDAOImpl;
import br.com.fiap.dao.impl.PacoteDAOImpl;
import br.com.fiap.dao.impl.TransporteDAOImpl;
import br.com.fiap.entity.Cliente;
import br.com.fiap.entity.Pacote;
import br.com.fiap.entity.Transporte;

public class ConsoleView {

	public static void main(String[] args) {

		//Executar a listagem de pacotes
		System.out.println("****** LISTAGEM DE PACOTES ***** ");
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		PacoteDAO dao = new PacoteDAOImpl(em);
		
		List<Pacote> lista = dao.listar();
		for (Pacote pacote : lista){
				System.out.print("Descrição" + pacote.getDescricao() + "\nPreço: " + pacote.getPreco() + "\nDias:" + pacote.getQtdDias() );
		}
		
		System.out.println("\n ****** BUSCA POR QUANTIDADE DE DIAS MINIMO ***** ");
		lista = dao.buscarPorQuantidadeDiasMinimos(9);
		
		for(Pacote pacote:lista){
			System.out.println("Descrição: " + pacote.getDescricao() + "\n R$" + pacote.getPreco());
		}
		Transporte t = new Transporte();
		List<Transporte> listaT = dao.listar();
		
		
		
		
		
//		System.out.println("\n****** LISTAGEM DE CLIENTES ***** ");
//		ClienteDAO daoCliente = new ClienteDAOImpl(em);
//		List<Cliente> listaCliente = daoCliente.listar();
//		for(Cliente cliente : listaCliente){
//			System.out.println("Nome:" + cliente.getNome() + "Endereço: " + cliente.getEndereco()+ "CPF: " + cliente.getCpf());
//		}
//		
//		System.out.println("\n ****** BUSCA POR TRANSPORTE ESPECIFICO ***** ");
//		TransporteDAO daoTransp  = new TransporteDAOImpl(em);
//		List<Transporte> listaTransporte = daoTransp.buscaPorTransporteEspecifico(5);
//		for(Transporte transporte:listaTransporte){
//			System.out.println("Empresa: " + transporte.getEmpresa());
//		}
//		
		em.close();
		System.exit(0);
		
	}

}
