package br.edu.senaisp.SpringDB.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table( name = "BANDA")
public class Banda {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private int anoLauch;
	
	
	
	public Banda() {
	}
	
	

	public Banda(Integer id, String nome, int anoLauch) {
		this.id = id;
		this.nome = nome;
		this.anoLauch = anoLauch;
	}



	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getAnoLauch() {
		return anoLauch;
	}
	
	public void setAnoLauch(int anoLauch) {
		this.anoLauch = anoLauch;
	}

	public void addAttribute(Banda banda, List<Banda> listBandas) {
		listBandas.add(banda);
	}
	

}
