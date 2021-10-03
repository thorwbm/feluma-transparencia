package com.feluma.transparencia.DTO;

import java.io.Serializable;
import java.util.Date;

import com.feluma.transparencia.model.Aluno;
import com.feluma.transparencia.model.Curso;
import com.feluma.transparencia.model.Entidade;
import com.feluma.transparencia.model.Registro;

import lombok.Data;

@Data
public class RegistroDto implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long   id;
	private String aluno;
	private String curso;
	private String livro;
	private String pagina;
	private String entidadeExpedidora;
	
	public RegistroDto() {
		
	}

	public RegistroDto(Long id, String aluno, String curso, String livro, String pagina, String entidadeExpedidora) {
		this.id = id;
		this.aluno = aluno;
		this.curso = curso;
		this.livro = livro;
		this.pagina = pagina;
		this.entidadeExpedidora = entidadeExpedidora;
	}


	public RegistroDto(Registro entidade) {
		this.id = entidade.getId();
		this.aluno = entidade.getAluno().getNome();
		this.curso = entidade.getCurso().getNome();
		this.livro = entidade.getLivro();
		this.pagina = entidade.getPagina();
		this.entidadeExpedidora = entidade.getEntidadeExpedidora().getNome();
	}

	

	
	
}
