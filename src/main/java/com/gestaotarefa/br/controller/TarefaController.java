package com.gestaotarefa.br.controller;

import com.gestaotarefa.br.domain.dto.TarefaDTO;
import com.gestaotarefa.br.service.TarefaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tarefas")
@CrossOrigin(origins = "http://localhost:4200")
public class TarefaController {

    @Autowired
    private TarefaService tarefaService;

    @PostMapping
    public ResponseEntity<TarefaDTO> criar(@RequestBody TarefaDTO dto) {
        return ResponseEntity.ok(tarefaService.criar(dto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable Long id) {
        tarefaService.excluir(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public ResponseEntity<Page<TarefaDTO>> listar(
            @RequestParam(required = false) Long idProjeto,
            Pageable pageable
    ) {
        return ResponseEntity.ok(tarefaService.listar(idProjeto, pageable));
    }
}
