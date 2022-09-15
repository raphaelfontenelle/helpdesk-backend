package com.fontenelle.helpdesk.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fontenelle.helpdesk.domain.Chamado;

public interface ChamadoRepository extends JpaRepository<Chamado, Integer>{

}
