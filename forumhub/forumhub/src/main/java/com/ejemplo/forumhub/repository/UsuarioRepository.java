package com.ejemplo.forumhub.repository;

import com.ForoHub.api.modelos.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

/**
 *
 * @author JuanAstaiza
 */
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

    UserDetails findByUsername(String username);

}