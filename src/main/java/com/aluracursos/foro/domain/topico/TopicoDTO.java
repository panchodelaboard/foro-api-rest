package com.aluracursos.foro.domain.topico;

import com.aluracursos.foro.domain.curso.CursoDTO;
import com.aluracursos.foro.domain.respuesta.RespuestaDTO;
import com.aluracursos.foro.domain.usuario.UsuarioDTO;

import java.util.Date;
import java.util.List;

public record TopicoDTO(
        Long id,
        String titulo,
        String mensaje,
        Date fechaCreacion,
        String status,
        UsuarioDTO autor,
        CursoDTO curso,
        List<RespuestaDTO> respuestas

) {
}
