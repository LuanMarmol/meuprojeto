package edu.unicesumar.meuprojeto.controller;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.unicesumar.meuprojeto.domain.Curso;
import edu.unicesumar.meuprojeto.service.CursoService;

@RestController
@RequestMapping("/curso")
public class CursoController {
	
		@Autowired
		private CursoService cursoService;
		
		@GetMapping("/nomeCurso")
		public Page<Curso> buscarCursoPaginadoPorNome(
				Pageable pageable,
				@PathParam(value = "nomeCurso") String nomeCurso){
					return cursoService.;
			
		}
			
		
}
