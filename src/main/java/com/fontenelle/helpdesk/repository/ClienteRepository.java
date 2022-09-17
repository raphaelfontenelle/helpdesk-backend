package com.fontenelle.helpdesk.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fontenelle.helpdesk.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}
