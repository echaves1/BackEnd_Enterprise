package br.com.fiap.impl;

import javax.persistence.EntityManager;

import br.com.fiap.dao.ServicoDAO;
import br.com.fiap.entity.Servico;

public class ServicoDAOimpl extends GenericDAOimpl<Servico, Integer>implements ServicoDAO{
	
	public ServicoDAOimpl(EntityManager em){
		super(em);
	}
	
	
}
