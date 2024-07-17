package com.aluracursos.foro.domain.usuario;

import com.aluracursos.foro.domain.perfil.PerfilDTO;

import java.util.List;

public record UsuarioDTO(
        Long id,
        String nombre,
        String correoElectronico,
        List<PerfilDTO> perfiles
) {}
