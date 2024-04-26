package br.edu.senaisp.SpringDB.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import br.edu.senaisp.SpringDB.model.Banda;
@Repository
public class BandaRepository implements iCRUD{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	

	@Override
	public List<Banda> lista() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Banda buscaPorId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Banda altera(Banda banda, int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Banda insere(Banda banda) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return false;
	}

}
