package com.fontenelle.helpdesk.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fontenelle.helpdesk.domain.Chamado;
import com.fontenelle.helpdesk.repository.ChamadoRepository;
import com.fontenelle.helpdesk.services.exception.ObjectnotFoundException;

@Service
public class ChamadoService {

	@Autowired
	private ChamadoRepository repository;
	
	public Chamado findByID(Integer id) {
		Optional<Chamado> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectnotFoundException("Objeto não encontrad ID" + id));
	}
	
}
