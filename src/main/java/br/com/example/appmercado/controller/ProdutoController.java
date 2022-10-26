package br.com.example.appmercado.controller;

import br.com.example.appmercado.model.Produto;
import br.com.example.appmercado.service.IProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
public class ProdutoController {

    @Autowired
    private IProdutoService service;

    @PostMapping("/produtos")
    public ResponseEntity<Produto> cadastrarNovo(@RequestBody Produto novo){
        Produto prod = service.criarNovoProduto(novo);
        if (prod != null) {
            return ResponseEntity.status(201).body(prod);
        }
        return ResponseEntity.badRequest().build();
    }

    @GetMapping("/produtos/search")
    public ResponseEntity<List<Produto>> recuperarPorPalavraChave(@RequestParam(name="k") String keyword){
        return ResponseEntity.ok(service.buscarPorPalavraChave(keyword));
    }


    @GetMapping("/produtos/{id}")
    public ResponseEntity<Produto> recuperarPorId(@PathVariable Integer id){
        Produto res = service.buscarPorId(id);
        if (res != null) {
            return ResponseEntity.ok(res);
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping("/produtos")
    public ResponseEntity<List<Produto>> recuperarTodos(){
        return ResponseEntity.ok(service.listarTodos());
    }

}
