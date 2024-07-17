package com.aluracursos.foro.infra.security;

public class DatosJWTToken {
    private String token;

    public DatosJWTToken(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }
}
