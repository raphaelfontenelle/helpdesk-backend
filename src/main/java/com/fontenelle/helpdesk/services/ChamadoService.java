package com.fontenelle.helpdesk.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.fontenelle.helpdesk.domain.Chamado;
import com.fontenelle.helpdesk.domain.dtos.ChamadoDTO;
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

	
	public List<Chamado> findAll(){
		return repository.findAll();
	}
}
