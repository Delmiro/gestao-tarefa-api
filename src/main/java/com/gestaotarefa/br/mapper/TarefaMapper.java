package com.gestaotarefa.br.mapper;

import com.gestaotarefa.br.domain.dto.TarefaDTO;
import com.gestaotarefa.br.domain.entity.Tarefa;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface TarefaMapper {
    @Mapping(source = "projeto.id", target = "idProjeto")
    @Mapping(source = "projeto.nome", target = "nomeProjeto")
    TarefaDTO toDto(Tarefa entity);

    @InheritInverseConfiguration
    Tarefa toEntity(TarefaDTO dto);
}
