package com.feluma.transparencia.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.feluma.transparencia.DTO.AlunoDto;
import com.feluma.transparencia.model.Aluno;
import com.feluma.transparencia.repository.AlunoRepository;

@Service
public class AlunoService {

	@Autowired
	private AlunoRepository repository;
	
	public List<AlunoDto> findAll(){
		List<Aluno> resultado = repository.findAll();
		return resultado.stream().map(x -> new AlunoDto(x)).collect(Collectors.toList());
	}
	
}
