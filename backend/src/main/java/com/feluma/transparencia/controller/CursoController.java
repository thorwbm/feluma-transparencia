package com.feluma.transparencia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.feluma.transparencia.DTO.CursoDto;
import com.feluma.transparencia.service.CursoService;

@RestController
@RequestMapping("/cursos")
public class CursoController {
	
	@Autowired
	private CursoService service;
	
	@GetMapping
	public ResponseEntity<Page<CursoDto>> listarTodos(Pageable pageable){
		Page<CursoDto> lista = service.findAll(pageable);
		return ResponseEntity.ok(lista);
	}

}
