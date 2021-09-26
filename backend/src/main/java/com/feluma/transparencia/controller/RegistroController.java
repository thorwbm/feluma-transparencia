package com.feluma.transparencia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.feluma.transparencia.DTO.RegistroDto;
import com.feluma.transparencia.service.RegistroService;

@RestController
@RequestMapping(value = "/registros")
public class RegistroController {
	
	@Autowired
	private RegistroService service;

	//@GetMapping
	//public ResponseEntity<Page<RegistroDto>> listarTodos(Pageable pageable){
	//	Page<RegistroDto> registros = service.findAll(pageable);
	//	return ResponseEntity.ok(registros);
	//}
	
	@GetMapping
	public ResponseEntity<List<RegistroDto>> listarRegistros(){
		List<RegistroDto> registros = service.listarTodos();
		return ResponseEntity.ok(registros);
	}
	
	@GetMapping("/pesquisa")
	public ResponseEntity<Page<RegistroDto>> pesquisarPorAluno(@RequestParam(name="pesquisa") String pesquisa, Pageable pageable){
		Page<RegistroDto> registros = service.listarRegistroPorAluno(pesquisa, pageable);
		
		return ResponseEntity.ok(registros);
	}

}
