package com.feluma.transparencia.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.feluma.transparencia.DTO.RegistroDto;
import com.feluma.transparencia.model.Registro;
import com.feluma.transparencia.repository.RegistroRepository;

@Service
public class RegistroService {

	@Autowired
	private RegistroRepository repository;
	
	
	public Page<RegistroDto> findAll(Pageable pageable){
		Page<Registro> registros = repository.findAll(pageable);
		
		return registros.map(registro -> new RegistroDto(registro));
	}
	
	public List<RegistroDto> listarTodos(){
		List<Registro> registros = repository.listarRegistros();
		
		return registros.stream().map(registro -> new RegistroDto(registro)).collect(Collectors.toList());
	}
	
	public Page<RegistroDto> listarRegistroPorAluno (String pesquisa, Pageable pageable){
		Page<Registro> registros = repository.pesquisarRegistrosPorNomeCpfRgRne(pesquisa, pageable);
		List<Long> listaRegistro = registros.map(registro -> registro.getId()).toList();
		repository.listarRegistrosFiltrados(listaRegistro);
		return registros.map(registro -> new RegistroDto(registro));
	}
}
