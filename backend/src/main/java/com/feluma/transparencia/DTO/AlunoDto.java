package com.feluma.transparencia.DTO;

import java.io.Serializable;

import com.feluma.transparencia.model.Aluno;

import lombok.Data;

@Data
public class AlunoDto implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String nome;
	private String cpf;
	private String rg;
	private String rne;
	
	public AlunoDto() {
		
	}
	
	public AlunoDto(Long id, String nome, String cpf, String rg, String rne) {
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.rne = rne;
	} 
	
	public AlunoDto(Aluno entidade) {
		this.id = entidade.getId();
		this.nome = entidade.getNome();
		this.cpf = entidade.getCpf();
		this.rg = entidade.getRg();
		this.rne = entidade.getRne();
	} 
}
