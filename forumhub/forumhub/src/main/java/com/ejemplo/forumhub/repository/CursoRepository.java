package com.ejemplo.forumhub.repository;

import com.ejemplo.forumhub.model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository extends JpaRepository<Curso, Long> {
}
