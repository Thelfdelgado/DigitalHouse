package com.aula33.Hibernate.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Professor") // Definir nome da tabela
public class ProfessorEntity {
    @Id
    @SequenceGenerator(name = "professor_sequence", sequenceName = "professor_sequence", allocationSize = 1)
    // "sequence" - Cria e controla toda a criancao dos ids
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "professor_sequence")
    // Forma que a sequencia é gerada
    private Long id;
    private String nome;
    private String titulo;

    @OneToMany(mappedBy = "professorEntity", fetch = FetchType.LAZY)
    // Fetch indica que quando eu trouxer os professores nao trazer os alunos
    // porque teria um trafego grande de dados
    private Set<AlunoEntity> alunoEntitySet = new HashSet<>();

    public ProfessorEntity() {
    }

    public ProfessorEntity(String nome, String titulo) {
        this.nome = nome;
        this.titulo = titulo;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
