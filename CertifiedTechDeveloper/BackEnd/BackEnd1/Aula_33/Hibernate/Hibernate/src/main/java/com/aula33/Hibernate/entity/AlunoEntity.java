package com.aula33.Hibernate.entity;

import javax.persistence.*;

@Entity
@Table(name = "aluno")
public class AlunoEntity {
    @Id
    @SequenceGenerator(name = "aluno_sequence", sequenceName = "aluno_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "aluno_sequence")
    private Long id;
    private String nome;
    private String idade;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    // cascadeType.REMOVE - quando remover o professor, todos os alunos associados serao removidos
    @JoinColumn(name = "professor_id")// Faz o join com a tabela professor
    private ProfessorEntity professorEntity;

    public AlunoEntity() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }
}
