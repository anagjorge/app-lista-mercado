package br.com.example.appmercado.model;

import lombok.Data;

import javax.persistence.*;
@Data
@Entity
@Table(name = "tbl_produto")

public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_produto")
    private Integer id;

    @Column(name = "nome_produto", length = 70, nullable = false)
    private String nome;

}
