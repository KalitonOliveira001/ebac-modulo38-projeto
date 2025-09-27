package br.com.ebac.repository;

import br.com.ebac.entity.Produto;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class ProdutoRepository {

    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("PostgresPU");
    private EntityManager em = emf.createEntityManager();

    public void salvar(Produto produto) {
        em.getTransaction().begin();
        em.persist(produto);
        em.getTransaction().commit();
    }

    public void fechar() {
        em.close();
        emf.close();
    }
}
