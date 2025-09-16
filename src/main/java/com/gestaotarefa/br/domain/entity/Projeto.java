package com.gestaotarefa.br.domain.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Projeto")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class Projeto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;
}
