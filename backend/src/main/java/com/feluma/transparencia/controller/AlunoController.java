package com.feluma.transparencia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
	public ResponseEntity<List<AlunoDto>> buscarTodos() {
		List<AlunoDto> alunos = service.findAll();
		return ResponseEntity.ok(alunos);
	}
}
