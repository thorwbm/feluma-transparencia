package com.feluma.transparencia.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.feluma.transparencia.DTO.CursoDto;
import com.feluma.transparencia.model.Curso;
import com.feluma.transparencia.repository.CursoRepository;

@Service
public class CursoService {
	
	@Autowired
	private CursoRepository repository;
	
	public Page<CursoDto> findAll(Pageable pageable){
		Page<Curso> lista = repository.findAll(pageable);
		
		return lista.map(curso -> new CursoDto(curso));
	}

}
