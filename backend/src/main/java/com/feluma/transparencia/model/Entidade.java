package com.feluma.transparencia.model;

import java.util.ArrayList;
import java.util.List;

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
public class Entidade {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	
	@OneToMany(mappedBy = "entidadeExpedidora")
	private List<Registro> registros = new ArrayList<>();
	
	
	public Entidade() {
		
	}

	public Entidade(String nome) {
		this.nome = nome;
	}	
}
