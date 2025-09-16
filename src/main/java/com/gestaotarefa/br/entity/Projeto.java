package com.gestaotarefa.br.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "PROJETO")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class Projeto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;
}
