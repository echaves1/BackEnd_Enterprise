package br.com.fiap.impl;

import javax.persistence.EntityManager;

import fiap.com.br.dao.GenericDAO;

public abstract class GenericImplements<T, K> implements GenericDAO<T, K>{

	private EntityManager em;
	
	private Class<T> classes;
	
	
}
