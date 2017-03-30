package br.com.fiap.impl;

import javax.persistence.EntityManager;

import br.com.fiap.dao.ProjetoDAO;
import br.com.fiap.entity.ProjetoAM;

public class ProjetoAmDaoImpl extends GenericDAOimpl<ProjetoAM, Integer> implements ProjetoDAO {

	public ProjetoAmDaoImpl(EntityManager em) {
		super(em);
		// TODO Auto-generated constructor stub
	}

}
