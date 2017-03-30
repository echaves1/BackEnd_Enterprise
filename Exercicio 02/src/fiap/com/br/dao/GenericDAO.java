package fiap.com.br.dao;

public interface GenericDAO<T, K> {

	void cadastrar(T entity);
	void alterar(T entity);
	void remover(T codigo);
	T pesquisar(K codigo);
	void salvar();
	
	
	
}
