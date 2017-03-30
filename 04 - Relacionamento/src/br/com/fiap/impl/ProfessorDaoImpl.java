package br.com.fiap.impl;

import javax.persistence.EntityManager;

import br.com.fiap.dao.ProfessorDAO;
import br.com.fiap.entity.Professor;

public class ProfessorDaoImpl extends GenericDAOimpl<Professor, Integer> implements ProfessorDAO{

	public ProfessorDaoImpl(EntityManager em) {
		super(em);
		// TODO Auto-generated constructor stub
	}

}
