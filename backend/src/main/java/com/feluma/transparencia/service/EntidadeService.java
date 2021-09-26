package com.feluma.transparencia.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.feluma.transparencia.DTO.EntidadeDto;
import com.feluma.transparencia.model.Entidade;
import com.feluma.transparencia.repository.EntidadeRepository;

@Service
public class EntidadeService {

	@Autowired
	private EntidadeRepository repository;
	
	public List<EntidadeDto> findAll(){
		List<Entidade> entidades = repository.findAll();
		
		return entidades.stream().map(entidade -> new EntidadeDto(entidade)).collect(Collectors.toList());
	}
}
