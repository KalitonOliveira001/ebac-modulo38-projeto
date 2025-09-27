package br.com.ebac.controller;

import br.com.ebac.entity.Produto;
import br.com.ebac.service.ProdutoService;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

@Named
@RequestScoped
public class ProdutoController {

    private Produto produto = new Produto();

    public String salvar() {
        ProdutoService service = new ProdutoService();
        service.cadastrar(this.produto);
        this.produto = new Produto(); // Limpa os campos para um novo cadastro
        return null; // Fica na mesma página
    }

    // Getters e Setters para o JSF acessar os dados
    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
}
