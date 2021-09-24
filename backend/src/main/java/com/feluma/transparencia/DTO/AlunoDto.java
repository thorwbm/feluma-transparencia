package com.feluma.transparencia.DTO;

import java.io.Serializable;

import com.feluma.transparencia.model.Aluno;

import lombok.Data;

@Data
public class AlunoDto implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String nome;
	
	public AlunoDto() {
		
	}
	
	public AlunoDto(Long id, String nome) {
		this.id = id;
		this.nome = nome;
	}
	
	public AlunoDto(Aluno entidade) {
		this.id = entidade.getId();
		this.nome = entidade.getNome();
	} 
}
