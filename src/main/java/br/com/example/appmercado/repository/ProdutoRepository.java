package br.com.example.appmercado.repository;

import br.com.example.appmercado.model.Produto;
import org.springframework.data.repository.CrudRepository;


public interface ProdutoRepository extends CrudRepository<Produto, Integer> {
}
