package br.com.fiap.impl;

import java.lang.reflect.ParameterizedType;

import javax.persistence.EntityManager;

import br.com.fiap.dao.GenericDAO;
import br.com.fiap.exception.DBException;
import br.com.fiap.exception.IdNotFoundException;

public abstract class GenericDAOimpl<T, K> implements GenericDAO<T, K>{

	private EntityManager em;
	
	// .class da entidade (usado na busca)
	private Class<T> classe;
	
	@SuppressWarnings("unchecked")
	public GenericDAOimpl(EntityManager em) {
		this.em = em;
		classe = (Class<T>) ((ParameterizedType)getClass().getGenericSuperclass()).getActualTypeArguments()[0];
	}

	@Override
	public void cadastrar(T entity) throws DBException {
		em.persist(entity);
		
	}

	@Override
	public void alterar(T entity) throws DBException {
		em.merge(entity);
		
	}

	@Override
	public void remover(K codigo) throws DBException, IdNotFoundException {
		T entidade = pesquisar(codigo);
		if(entidade == null){
			throw new IdNotFoundException("Entidade nao encontrada!");
		}
			em.remove(entidade);
		
	}

	@Override
	public T pesquisar(K codigo) {
		return em.find(classe , codigo);
	}

	public void salvar() throws DBException{
		try {
			em.getTransaction().begin();
			em.getTransaction().commit();
		} catch (Exception e) {
			if(em.getTransaction().isActive())em.getTransaction().rollback();
			throw new DBException("Erro no commit", e);
		
		}
	}
	
	
	
}
