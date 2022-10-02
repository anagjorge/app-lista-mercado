package br.com.example.appmercado.repository;

import br.com.example.appmercado.model.ItemLista;
import br.com.example.appmercado.model.Produto;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ItemListaRepository extends CrudRepository<ItemLista, Integer> {

}
