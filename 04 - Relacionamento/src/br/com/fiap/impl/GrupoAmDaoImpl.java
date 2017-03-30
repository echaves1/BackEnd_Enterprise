package br.com.fiap.impl;

import javax.persistence.EntityManager;

import br.com.fiap.dao.GrupoDAO;
import br.com.fiap.entity.GrupoAM;

public class GrupoAmDaoImpl extends GenericDAOimpl<GrupoAM, Integer> implements GrupoDAO{

	public GrupoAmDaoImpl(EntityManager em) {
		super(em);
		// TODO Auto-generated constructor stub
	}

}
