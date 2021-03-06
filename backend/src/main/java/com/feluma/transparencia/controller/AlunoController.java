package com.feluma.transparencia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.feluma.transparencia.DTO.AlunoDto;
import com.feluma.transparencia.service.AlunoService;

@RestController
@RequestMapping(value = "/alunos")
public class AlunoController {

	@Autowired
	private AlunoService service;
	
	@GetMapping
	public ResponseEntity<Page<AlunoDto>> listarTodos(Pageable pageable) {
		Page<AlunoDto> alunos = service.findAll(pageable);
		return ResponseEntity.ok(alunos);
	}
}
