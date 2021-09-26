package com.feluma.transparencia.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table
public class Registro {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long   id;
	
	@Column
	private String livro;
	
	@Column
	private String pagina;
	
	@Column(name="data_ingresso")
	private Date   dataIngresso;
	
	@Column(name="data_conclusao")
	private Date   dataConclusao;
	
	@Column(name="data_expedicao")
	private Date   dataExpedicao;
	
	@Column(name="data_registro")
	private Date   dataRegistro;
	
	@ManyToOne
	@JoinColumn(name="aluno_id")
	private Aluno aluno;
	
	@ManyToOne
	@JoinColumn(name="curso_id")
	private Curso curso;
	
	@ManyToOne
	@JoinColumn(name="entidade_expedidora_id")
	private Entidade entidadeExpedidora;
	
	@ManyToOne
	@JoinColumn(name="entidade_registradora_id")
	private Entidade entidadeRegistradora;
	
	public Registro() {
		
	}
}
