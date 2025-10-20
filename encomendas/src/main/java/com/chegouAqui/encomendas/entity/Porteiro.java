package com.chegouAqui.encomendas.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "porteiro")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Porteiro {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String login;
    private String senha;
    private String cpf;

    @ManyToOne
    @JoinColumn(name = "fk_id_administrador")
    private Administrador administrador;
}
