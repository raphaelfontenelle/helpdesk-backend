package com.fontenelle.helpdesk.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fontenelle.helpdesk.domain.Tecnico;

public interface TecnicoRepository extends JpaRepository<Tecnico, Integer>{

}
