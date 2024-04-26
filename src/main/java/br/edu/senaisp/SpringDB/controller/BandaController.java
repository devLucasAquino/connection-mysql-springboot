package br.edu.senaisp.SpringDB.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.senaisp.SpringDB.model.Banda;

@RestController
@RequestMapping("/banda")
public class BandaController {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@GetMapping("/inserir")
		public List<String> listaBandas() {
			String sql = "INSERT INTO BANDA (nome, anoLaunch) VALUES (?, ?)";
			
			String nome = "Nilson Forró";
			int anoLaunch = 1970;
			String novo = "";
        
			int result = jdbcTemplate.update(sql, nome, anoLaunch);
         
			if (result > 0) {
				System.out.println("A new row has been inserted.");
				
				novo = nome + ", " + anoLaunch;
			}
			
			List <String>listar = new ArrayList<>();
			
			listar.add(novo);
			
			return listar;
			
			

	}

}