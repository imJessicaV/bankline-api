package com.dev.week.banklineapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.week.banklineapi.model.Correntista;

public interface CorrentistaRepository extends JpaRepository<Correntista, Integer> {

}
