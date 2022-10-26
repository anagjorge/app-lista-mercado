package br.com.example.appmercado.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "tbl_itemlista")
public class ItemLista {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "num_seq")
    private Integer numSeq;

    @Column(name = "quantidade")
    private Double  quantidade;

    @Column(name = "preco_total")
    private Double  precoTotal;

    @Column(name = "concluido")
    private Integer concluido;

    @ManyToOne
    @JoinColumn(name = "tbl_produto_id_produto")
    private Produto produto;

    @ManyToOne
    @JoinColumn(name = "tbl_lista_id_lista")
    @JsonIgnoreProperties("itens")
    private Lista lista;
}
