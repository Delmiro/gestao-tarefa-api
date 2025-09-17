package com.gestaotarefa.br.domain.enumeration;

public enum StatusTarefa {
    ABERTA,
    EM_ANDAMENTO,
    CONCLUIDA,
    CANCELADA;

    public static StatusTarefa fromString(String status) {
        for (StatusTarefa s : StatusTarefa.values()) {
            if (s.name().equalsIgnoreCase(status)) {
                return s;
            }
        }
        throw new IllegalArgumentException("Status inválido: " + status);
    }

}
