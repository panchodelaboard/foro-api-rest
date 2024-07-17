Descripción del proyecto:

API Rest para foro: crea, actualiza, elimina y visualiza tópicos/dudas/sugerencias. ¡Usa Insomnia para peticiones HTTP!

Funcionalidades:

Registrar tópico (POST)
Listar tópicos (GET)
Actualizar tópico (PUT)
Eliminar tópico (DELETE)
Autenticación
Tecnologías:

Spring Boot
Spring Web
Spring Data JPA
Flyway Migration
MySQL Driver
Validation
Spring Security
Lombok
Estructura:

controller: Controladores de la API
domain: Clases Java, DTOs, records y repositorios
infra:
errores: Manejo de errores
security: Autenticación (AutenticacionService, DatosJWTToken, SecurityConfiguration, SecurityFilter, TokenService, etc.)
springdoc: SpringDocConfiguration
Base de datos con Flyway:

Scripts para crear tablas en resources/db/migration/ (V1__create-table.sql)

Consideraciones:

Se utilizó Insomnia para peticiones HTTP.
