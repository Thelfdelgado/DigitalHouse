package com.exercicio.FutebolHibernate.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "jogador")
public class JogadorEntity {
    @Id
    @SequenceGenerator(name = "jogador_sequence", sequenceName = "jogador_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "jogador_sequence")
    private Long id;
    private String nome;
    private String posicao;
    private double peso;
    private double altura;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    @JoinColumn(name = "time_id")
    private TimeEntity timeEntity;
}
