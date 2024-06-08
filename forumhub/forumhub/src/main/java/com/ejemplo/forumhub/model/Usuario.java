package com.ejemplo.forumhub.model;

import lombok.Data;
import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Data
@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String nombre;

    @Email
    @NotBlank
    private String correoElectronico;

    @NotBlank
    private String contrasena;

    @ManyToMany(fetch = FetchType.EAGER)
    private List<Perfil> perfiles;
}
