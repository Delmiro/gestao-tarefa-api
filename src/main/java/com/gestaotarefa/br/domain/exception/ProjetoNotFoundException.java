package com.gestaotarefa.br.domain.exception;

public class ProjetoNotFoundException extends RuntimeException {
    public ProjetoNotFoundException(Long id) {
        super("Projeto com ID " + id + " não encontrado.");
    }
}
