package br.com.example.appmercado.service;

import br.com.example.appmercado.model.Produto;
import br.com.example.appmercado.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProdutoServiceImpl implements IProdutoService{
    @Autowired
    private ProdutoRepository repo;
    @Override
    public Produto criarNovoProduto(Produto prod) {
        return repo.save(prod);
    }

    @Override
    public Produto alterarProduto(Produto prod) {
        return null;
    }

    @Override
    public List<Produto> listarTodos() {
        return null;
    }

    @Override
    public List<Produto> buscarPorPalavraChave(String key) {
        return null;
    }

    @Override
    public Produto buscarPorId(Integer id) {
        return null;
    }


}
