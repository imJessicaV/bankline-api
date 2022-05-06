package com.dev.week.banklineapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.week.banklineapi.model.Movimentacao;

public interface MovimentacaoRepository extends JpaRepository<Movimentacao, Integer>{
	public List<Movimentacao>findByIdConta(Integer idConta);
}
