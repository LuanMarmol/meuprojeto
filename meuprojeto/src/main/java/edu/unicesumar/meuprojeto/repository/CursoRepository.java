package edu.unicesumar.meuprojeto.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import edu.unicesumar.meuprojeto.domain.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long> {

		@Query(nativeQuery =  true, value = "select * from curso where nomecurso = :nomecurso")
		Page<Curso> findbyNome(@Param("nomecurso) String nomeCurso, Pageable pageable");
		
}
