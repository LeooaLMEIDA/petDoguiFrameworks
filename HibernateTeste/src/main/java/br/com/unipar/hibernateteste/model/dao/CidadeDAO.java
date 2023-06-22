package br.com.unipar.hibernateteste.model.dao;

import br.com.unipar.hibernateteste.model.Cidade;
import javax.persistence.TypedQuery;

public class CidadeDAO extends GenericDAO<Cidade> {

    public CidadeDAO() {
        super(Cidade.class);
    }
    
    public Cidade findByNome(String nome) {
        String jpql = "from Cidade where nome = :nome";
        TypedQuery<Cidade> query = em.createQuery(jpql,Cidade.class).setParameter("nome", nome);
        return query.getSingleResult();
    }
}
