package com.ejemplo.forumhub.dto;

import javax.validation.constraints.NotBlank;

public class LoginDTO {

    @NotBlank
    private String correoElectronico;

    @NotBlank
    private String contrasena;

    // Getters y setters
}
