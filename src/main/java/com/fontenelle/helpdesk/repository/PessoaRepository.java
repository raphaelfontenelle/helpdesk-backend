package com.fontenelle.helpdesk.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fontenelle.helpdesk.domain.Chamado;

public interface PessoaRepository extends JpaRepository<Chamado, Integer>{

}
