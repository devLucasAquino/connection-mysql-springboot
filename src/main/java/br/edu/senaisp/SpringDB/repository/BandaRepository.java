package br.edu.senaisp.SpringDB.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import br.edu.senaisp.SpringDB.model.Banda;
@Repository
public class BandaRepository implements iCRUD{
	
	
	private String qrSelectAll = 
			"SELECT id, nome, anoLaunch FROM BANDA;";
	
	private String insertRow = 
			"INSERT INTO BANDA (nome, anoLaunch) VALUES (?, ?)";
	
	private String deleteRow = 
			"DELETE FROM BANDA WHERE id = ?";
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	

	@Override
	public List<Banda> lista() {
		
		return jdbcTemplate.query(qrSelectAll, 
				(rs, rowNum) -> {		
			return new Banda(rs.getInt("id"), 
						rs.getString("nome"), 
						rs.getInt("anoLaunch"));
		});
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
	public void insere(String nome, int anoLaunch) {
		int result = jdbcTemplate.update(insertRow, nome, anoLaunch);
	}

	@Override
	public void delete(int id) {
		jdbcTemplate.update(deleteRow, id); 
	}

}
