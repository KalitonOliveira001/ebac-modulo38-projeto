package br.com.ebac.service;

import br.com.ebac.entity.Produto;
import br.com.ebac.repository.ProdutoRepository;

public class ProdutoService {

    private ProdutoRepository repository = new ProdutoRepository();

    public void cadastrar(Produto produto) {
        // Regra de negócio: não salvar produto sem nome ou com preço negativo
        if (produto.getNome() == null || produto.getNome().isEmpty() || produto.getPreco() < 0) {
            System.out.println("Erro: Produto inválido!");
            return; // Não faz nada
        }
        repository.salvar(produto);
        System.out.println("Produto salvo com sucesso!");
    }
}
