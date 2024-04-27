package br.edu.senaisp.SpringDB.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.senaisp.SpringDB.model.Banda;
import br.edu.senaisp.SpringDB.repository.BandaRepository;

@RestController
@RequestMapping("/banda")
public class BandaController {
	
	@Autowired
	private BandaRepository repository;
	
	@GetMapping("/inserir")
		public void InserirBanda() {
		repository.insere("teste banda", 2024);
			
	}
	
	@GetMapping("/lista")
	public List<Banda> ListaBandas() {
		
		return repository.lista();
	}

}