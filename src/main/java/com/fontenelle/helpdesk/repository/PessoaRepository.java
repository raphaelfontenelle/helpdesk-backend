package com.fontenelle.helpdesk.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fontenelle.helpdesk.domain.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer>{

}
