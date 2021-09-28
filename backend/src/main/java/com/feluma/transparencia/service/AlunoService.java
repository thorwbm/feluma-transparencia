package com.feluma.transparencia.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.feluma.transparencia.DTO.AlunoDto;
import com.feluma.transparencia.model.Aluno;
import com.feluma.transparencia.repository.AlunoRepository;

@Service
public class AlunoService {

	@Autowired
	private AlunoRepository repository;
	

	@Transactional(readOnly = true)
	public Page<AlunoDto> findAll(Pageable pageable){
		Page<Aluno> resultado = repository.findAll(pageable);
		return resultado.map(x -> new AlunoDto(x));
	}
	
}
