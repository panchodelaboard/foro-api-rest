package com.aluracursos.foro.domain.respuesta;

import com.aluracursos.foro.domain.topico.TopicoDTO;
import com.aluracursos.foro.domain.usuario.UsuarioDTO;

import java.util.Date;

public record RespuestaDTO(
        Long id,
        String mensaje,
        TopicoDTO topico,
        Date fechaCreacion,
        UsuarioDTO autor,
        Boolean solucion
) {
}
