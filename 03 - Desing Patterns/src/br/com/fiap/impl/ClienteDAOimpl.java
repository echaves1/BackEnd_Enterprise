package br.com.fiap.impl;

import javax.persistence.EntityManager;

import br.com.fiap.dao.ClienteDAO;
import br.com.fiap.entity.Servico;

public class ClienteDAOimpl extends GenericDAOimpl<Servico, Integer>implements ClienteDAO{

	public ClienteDAOimpl(EntityManager em) {
		super(em);
		// TODO Auto-generated constructor stub
	}

	
	
}
