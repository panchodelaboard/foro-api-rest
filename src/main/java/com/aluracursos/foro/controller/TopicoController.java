package com.aluracursos.foro.controller;

import com.aluracursos.foro.domain.topico.Topico;
import com.aluracursos.foro.domain.topico.TopicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/topicos")
public class TopicoController {

    @Autowired
    private TopicoRepository topicoRepository;

    @GetMapping
    public List<Topico> listarTopicos() {
        return topicoRepository.findAll();
    }

    @PostMapping
    public Topico crearTopico(@RequestBody Topico topico) {
        return topicoRepository.save(topico);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Topico> actualizarTopico(@PathVariable Long id, @RequestBody Topico topico) {
        Optional<Topico> optionalTopico = topicoRepository.findById(id);
        if (optionalTopico.isPresent()) {
            Topico topicoExistente = optionalTopico.get();
            topicoExistente.setTitulo(topico.getTitulo());
            topicoExistente.setMensaje(topico.getMensaje());
            topicoExistente.setStatus(topico.getStatus());
            return ResponseEntity.ok(topicoRepository.save(topicoExistente));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarTopico(@PathVariable Long id) {
        if (topicoRepository.existsById(id)) {
            topicoRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}

