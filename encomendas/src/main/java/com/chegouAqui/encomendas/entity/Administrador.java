package com.chegouAqui.encomendas.entity;

// Os comentários desta classe são iniciais, para estudo das funcionalidades do JPA e Lombok

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// Anotações do JPA para mapeamento com o banco de dados
@Entity // Indica que esta classe é uma entidade JPA e será mapeada para uma tabela
@Table(name = "administrador") // Mapeia a classe para a tabela "sindico" no banco. Sem,iria criar com o nome da classe (padrão)

// Anotações do Lombok para gerar código automaticamente
@Getter @Setter //Cria os métodos getters e setters
@NoArgsConstructor // Cria o construtor vazio (sem argumentos)
@AllArgsConstructor // Cria o construtor com todos os atributos

public class Administrador {
    @Id // Marca o campo como a chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Define a estratégia de geração de ID
    private Long id; // O Long armazena números inteiros e também podem ser vazios

    private String nome;
    private String login;
    private String senha;
    private String cpf;
}
