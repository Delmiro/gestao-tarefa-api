package com.gestaotarefa.br.service;

import com.gestaotarefa.br.domain.dto.TarefaDTO;
import com.gestaotarefa.br.domain.entity.Projeto;
import com.gestaotarefa.br.domain.entity.Tarefa;
import com.gestaotarefa.br.domain.exception.ProjetoNotFoundException;
import com.gestaotarefa.br.domain.exception.TarefaNotFoundException;
import com.gestaotarefa.br.mapper.TarefaMapper;
import com.gestaotarefa.br.repository.ProjetoRepository;
import com.gestaotarefa.br.repository.TarefaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class TarefaService {

    @Autowired
    private TarefaRepository tarefaRepository;
    @Autowired
    private ProjetoRepository projetoRepository;
    @Autowired
    private TarefaMapper tarefaMapper;

    public TarefaDTO criar(TarefaDTO dto) {
        Projeto projeto = projetoRepository.findById(dto.idProjeto())
                .orElseThrow(() -> new ProjetoNotFoundException(dto.idProjeto()));

        Tarefa tarefa = tarefaMapper.toEntity(dto);
        tarefa.setProjeto(projeto);
        tarefa.setDataCriacao(LocalDateTime.now());

        return tarefaMapper.toDto(tarefaRepository.save(tarefa));
    }

    public void excluir(Long id) {
        if (!tarefaRepository.existsById(id)) {
            throw new TarefaNotFoundException(id);
        }
        tarefaRepository.deleteById(id);
    }

    public Page<TarefaDTO> listar(Long idProjeto, Pageable pageable) {
        Page<Tarefa> tarefas = (idProjeto != null)
                ? tarefaRepository.findByProjetoId(idProjeto, pageable)
                : tarefaRepository.findAll(pageable);

        return tarefas.map(tarefaMapper::toDto);
    }
}

