package com.feluma.transparencia.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table
public class Aluno {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column
	private String nome;

	@Column
	private String cpf;

	@Column
	private String rg;

	@Column
	private String rne;
	
	
	@OneToMany(mappedBy = "aluno")
	private List<Registro> registros = new ArrayList<>();
	
	public Aluno() {
		
	}

	public Aluno(String nome) {
		this.nome = nome;
	}
	
	
	
}
