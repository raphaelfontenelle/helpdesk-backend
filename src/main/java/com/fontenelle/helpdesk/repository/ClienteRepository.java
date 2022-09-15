package com.fontenelle.helpdesk.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fontenelle.helpdesk.domain.Pessoa;

public interface ClienteRepository extends JpaRepository<Pessoa, Integer>{

}
