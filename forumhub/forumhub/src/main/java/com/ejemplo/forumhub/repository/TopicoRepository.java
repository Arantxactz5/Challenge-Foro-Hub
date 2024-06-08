package com.ejemplo.forumhub.repository;

import com.ejemplo.forumhub.model.Topico;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TopicoRepository extends JpaRepository<Topico, Long> {
    boolean existsByTituloAndMensaje(String titulo, String mensaje);
}
