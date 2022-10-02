package br.com.example.appmercado.service;

import br.com.example.appmercado.model.Produto;

import java.util.List;

public interface IProdutoService {

    public Produto criarNovoProduto(Produto prod);
    public List<Produto> listarTodos();
    public List<Produto> buscarPorPalavraChave(String key);

    public Produto buscarPorId(Integer id);



}
