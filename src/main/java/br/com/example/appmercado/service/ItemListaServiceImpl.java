package br.com.example.appmercado.service;

import br.com.example.appmercado.model.ItemLista;
import br.com.example.appmercado.repository.ItemListaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ItemListaServiceImpl implements IItemListaService {

    @Autowired
    private ItemListaRepository repo;

    @Override
    public ItemLista inserirItem(ItemLista novo) {
        return repo.save(novo);
    }

    @Override
    public ItemLista alterarItem(ItemLista item) {
        return repo.save(item);
    }

    @Override
    public void removerItem(Integer numSeq) {
         repo.deleteById(numSeq);
    }
}
