package com.gestaotarefa.br.domain.dto;

import java.time.LocalDateTime;

public record TarefaDTO(
        Long id,
        String titulo,
        String descricao,
        String status,
        LocalDateTime dataCriacao,
        Long idProjeto,
        String nomeProjeto
) { }
