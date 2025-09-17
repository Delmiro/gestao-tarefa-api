package com.gestaotarefa.br.mapper;

import com.gestaotarefa.br.domain.dto.TarefaDTO;
import com.gestaotarefa.br.domain.entity.Tarefa;
import com.gestaotarefa.br.domain.enumeration.StatusTarefa;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface TarefaMapper {

    @Mapping(source = "projeto.id", target = "idProjeto")
    @Mapping(source = "projeto.nome", target = "nomeProjeto")
    @Mapping(target = "status", expression = "java(entity.getStatus().name())")
    TarefaDTO toDto(Tarefa entity);

    @InheritInverseConfiguration
    @Mapping(target = "status", expression = "java(this.mapStatus(dto.status()))") // note o dto.status()
    Tarefa toEntity(TarefaDTO dto);

    default StatusTarefa mapStatus(String status) {
        if (status == null) return null;
        switch (status.toLowerCase()) {
            case "aberta": return StatusTarefa.ABERTA;
            case "em andamento": return StatusTarefa.EM_ANDAMENTO;
            case "concluida": return StatusTarefa.CONCLUIDA;
            default:
                throw new IllegalArgumentException("Status inválido: " + status);
        }
    }
}

