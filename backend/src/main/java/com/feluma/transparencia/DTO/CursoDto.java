package com.feluma.transparencia.DTO;

import java.io.Serializable;

import com.feluma.transparencia.model.Curso;

import lombok.Data;

@Data
public class CursoDto implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String nome;
	
	public CursoDto() {
		
	}

	public CursoDto(Long id, String nome) {
		this.id = id;
		this.nome = nome;
	}

	public CursoDto(Curso entidade) {
		this.id = entidade.getId();
		this.nome = entidade.getNome();
	}
	
	

}
