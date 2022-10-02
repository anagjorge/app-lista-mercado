package br.com.example.appmercado.service;

import br.com.example.appmercado.model.ItemLista;
import br.com.example.appmercado.model.Lista;
import br.com.example.appmercado.repository.ListaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ListaServiceImpl implements IListaService{

    @Autowired
    private ListaRepository repo;

    @Override
    public Lista criarNovaLista(Lista nova){
        return repo.save(nova);
    }

    @Override
    public void removerLista(Integer id){
        repo.deleteById(id);
    }

    @Override
    public Lista fecharLista(Integer id) {
        Lista l = repo.findById(id).get();
        double total=0.0;
        for (ItemLista item: l.getItens()) {
            total += l.getValorTotal();
        }
        l.setValorTotal(total);
        l.setStatus(1); // lista concluida;
        return repo.save(l);
    }
    @Override
    public Lista buscarPeloId(Integer id){
        return repo.findById(id).orElse(null);
    }

    @Override
    public List<Lista> buscarTodas() {
        return (List<Lista>) repo.findAll();
    }


}
