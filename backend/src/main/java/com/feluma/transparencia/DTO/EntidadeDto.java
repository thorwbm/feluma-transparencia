package com.feluma.transparencia.DTO;

import java.io.Serializable;

import com.feluma.transparencia.model.Entidade;

import lombok.Data;

@Data
public class EntidadeDto implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String nome;
	public EntidadeDto() {
		
	}
	
	public EntidadeDto(Long id, String nome) {
		this.id = id;
		this.nome = nome;
	}
	
	public EntidadeDto(Entidade entidade) {
		this.id = entidade.getId();
		this.nome = entidade.getNome();
	}
	
	
	
}
