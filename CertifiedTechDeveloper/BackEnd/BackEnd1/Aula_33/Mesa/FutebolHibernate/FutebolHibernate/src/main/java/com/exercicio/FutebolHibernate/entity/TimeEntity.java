package com.exercicio.FutebolHibernate.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "time")
public class TimeEntity {
    @Id
    @SequenceGenerator(name = "time_sequence", sequenceName = "time_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "time_sequence")
    private Long id;
    private String nome;
    private String cidade;
    private String estado;

    @OneToMany(mappedBy = "timeEntity", fetch = FetchType.LAZY)
    private Set<JogadorEntity> jogadorEntitySet = new HashSet<>();
}
