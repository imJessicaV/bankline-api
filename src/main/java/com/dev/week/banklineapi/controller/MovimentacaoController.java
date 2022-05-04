package com.dev.week.banklineapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dev.week.banklineapi.dto.NovoCorrentista;
import com.dev.week.banklineapi.model.Correntista;
import com.dev.week.banklineapi.model.Movimentacao;
import com.dev.week.banklineapi.repository.CorrentistaRepository;
import com.dev.week.banklineapi.repository.MovimentacaoRepository;
import com.dev.week.banklineapi.service.CorrentistaService;

@RestController
@RequestMapping("/movimentacoes")
public class MovimentacaoController {
	@Autowired
	private MovimentacaoRepository repository;
	
	@Autowired
	private CorrentistaService service;
	
	@GetMapping
	public List<Movimentacao> findAll(){
		return repository.findAll();
	}
	
	@PostMapping
	public void save(@RequestBody NovoCorrentista correntista) {
		service.save(correntista);
		
	}
}
