package com.feluma.transparencia.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.feluma.transparencia.model.Registro;

public interface RegistroRepository extends JpaRepository<Registro, Long> {

	@Query("SELECT reg FROM Registro reg inner join fetch reg.aluno alu "
			+ "                          inner join fetch reg.curso cur "
			+ "                          inner join fetch reg.entidadeExpedidora entExp"
			+ "                          left  join fetch reg.entidadeRegistradora entReg"
			+ " order by alu.nome" )
	List<Registro> listarRegistros();
		
	@Query("SELECT reg FROM Registro reg inner join reg.aluno alu "
			+ " where alu.nome = :pesquisa or "
			+ "       alu.cpf  = :pesquisa or "
			+ "       alu.rne  = :pesquisa or "
			+ "       alu.rg   = :pesquisa    " )
	Page<Registro> pesquisarRegistrosPorNomeCpfRgRne(String pesquisa, Pageable pageable);
	
	
	@Query("SELECT reg FROM Registro reg inner join fetch reg.aluno alu "
			+ "                          inner join fetch reg.curso cur "
			+ "                          inner join fetch reg.entidadeExpedidora entExp"
			+ "                          left  join fetch reg.entidadeRegistradora entReg"
			+ " where reg.id in :listaRegistros   " )	
	List<Registro> listarRegistrosFiltrados(List<Long> listaRegistros);
}
