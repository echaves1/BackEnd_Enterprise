package br.com.fiap.dao;

import br.com.fiap.exception.DBException;
import br.com.fiap.exception.IdNotFoundException;

public interface GenericDAO<T, K> {

	void cadastrar(T entity) throws DBException;
	void alterar(T entity) throws DBException;
	void remover(K codigo) throws DBException, IdNotFoundException;
	T pesquisar(K codigo) ;
	void salvar() throws DBException;
	
}
