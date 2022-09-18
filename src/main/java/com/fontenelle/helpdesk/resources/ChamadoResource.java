package com.fontenelle.helpdesk.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fontenelle.helpdesk.domain.Chamado;
import com.fontenelle.helpdesk.domain.dtos.ChamadoDTO;
import com.fontenelle.helpdesk.services.ChamadoService;

@RestController
@RequestMapping(value = "/Chamados")
public class ChamadoResource {

	@Autowired
	private ChamadoService service;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<ChamadoDTO> findById(@PathVariable Integer id){
		Chamado obj = service.findByID(id);
		return ResponseEntity.ok().body(new ChamadoDTO(obj));
	}
			
}
