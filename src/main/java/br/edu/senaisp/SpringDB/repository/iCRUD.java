package br.edu.senaisp.SpringDB.repository;

import java.util.List;

import br.edu.senaisp.SpringDB.model.Banda;

public interface iCRUD {
	
	public List<Banda> lista();
	
	public Banda buscaPorId(int id);
	
	public Banda altera(Banda banda, int id);
	
	public void insere(String nome, int anoLaunch);
	
	public boolean delete(int id);
}
