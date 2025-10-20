package com.chegouAqui.encomendas.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "morador")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Morador {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String bloco;
    private String apto;
    private String email;
    private String cpf;

    @ManyToOne
    @JoinColumn(name = "fk_id_administrador")
    private Administrador administrador;

}
