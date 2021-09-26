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
	private String livro;
	private String pagina;
	private Date   dataIngresso;
	private Date   dataConclusao;
	private Date   dataExpedicao;
	private Date   dataRegistro;
	private AlunoDto aluno;
	private CursoDto curso;
	private EntidadeDto entidadeExpedidora;
	private EntidadeDto entidadeRegistradora;
	
	public RegistroDto() {
		
	}

	public RegistroDto(Long id, String livro, String pagina, Date dataIngresso,
			Date dataConclusao, Date dataExpedicao, Date dataRegistro, Aluno aluno, Curso curso,
			Entidade entidadeExpedidora, Entidade entidadeRegistradora) {
		this.id = id;
		this.livro = livro;
		this.pagina = pagina;
		this.dataIngresso = dataIngresso;
		this.dataConclusao = dataConclusao;
		this.dataExpedicao = dataExpedicao;
		this.dataRegistro = dataRegistro;
		this.aluno = new AlunoDto(aluno);
		this.curso = new CursoDto(curso);
		this.entidadeExpedidora = new EntidadeDto(entidadeExpedidora);
		this.entidadeRegistradora = new EntidadeDto(entidadeRegistradora);
	}

	public RegistroDto(Long id, String livro, String pagina, Aluno aluno, Curso curso, Entidade entidadeExpedidora) {
		this.id = id;
		this.livro = livro;
		this.pagina = pagina;
		this.aluno = new AlunoDto(aluno);
		this.curso = new CursoDto(curso);
		this.entidadeExpedidora = new EntidadeDto(entidadeExpedidora);
	}

	public RegistroDto(Registro entidade) {
		this.id = entidade.getId();
		this.livro = entidade.getLivro();
		this.pagina = entidade.getPagina();
		this.dataIngresso = entidade.getDataIngresso();
		this.dataConclusao = entidade.getDataConclusao();
		this.dataExpedicao = entidade.getDataExpedicao();
		this.dataRegistro = entidade.getDataRegistro();
		this.aluno = new AlunoDto(entidade.getAluno());
		this.curso = new CursoDto(entidade.getCurso());
		this.entidadeExpedidora = new EntidadeDto(entidade.getEntidadeExpedidora());
		//this.entidadeRegistradora = new EntidadeDto(entidade.getEntidadeRegistradora());
	}

	
	
}
