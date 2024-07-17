package com.aluracursos.foro.infra.errores;

import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

public class ApiErrores {
    private HttpStatus status;
    private String message;
    private LocalDateTime timestamp;

    public ApiErrores(HttpStatus status, String message) {
        this.status = status;
        this.message = message;
        this.timestamp = LocalDateTime.now();
    }

    public HttpStatus getStatus() {
        return status;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }
}

