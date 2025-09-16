package com.gestaotarefa.br.domain.exception;

public class TarefaNotFoundException extends RuntimeException {
    public TarefaNotFoundException(Long id) {
        super("Tarefa com ID " + id + " não encontrada.");
    }
}

