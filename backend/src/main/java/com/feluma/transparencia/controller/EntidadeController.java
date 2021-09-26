package com.feluma.transparencia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.feluma.transparencia.DTO.EntidadeDto;
import com.feluma.transparencia.service.EntidadeService;

@RestController
@RequestMapping("/entidades")
public class EntidadeController {

	@Autowired
	private EntidadeService service;
	
	@GetMapping
	public ResponseEntity<List<EntidadeDto>> listarTodos(){
		List<EntidadeDto> lista = service.findAll();
		
		return ResponseEntity.ok(lista);
	}
}
