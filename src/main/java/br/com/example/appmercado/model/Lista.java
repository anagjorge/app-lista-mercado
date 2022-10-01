package br.com.example.appmercado.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Data
@Entity
@Table(name = "tbl_lista")
public class Lista {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_lista")
    private Integer id;

    @Column(name = "data_criacao", nullable = false)
    private LocalDate data;

    @Column(name = "nome_mercado", length = 50)
    private String nomeMercado;

    @Column(name = "valor_total")
    private Double valorTotal;

    @Column(name = "status")
    private Integer status;

    @OneToMany(mappedBy = "lista", cascade = CascadeType.ALL)
    private List<ItemLista> itens;


}
