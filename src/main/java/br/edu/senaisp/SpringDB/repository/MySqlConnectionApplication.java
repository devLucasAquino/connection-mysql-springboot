package br.edu.senaisp.SpringDB.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.jdbc.core.JdbcTemplate;

public class MySqlConnectionApplication {
	
	@Autowired
    private JdbcTemplate jdbcTemplate;
     
    public static void main(String[] args) {
        SpringApplication.run(MySqlConnectionApplication.class, args);
    }
 
    public void run(String... args) throws Exception {
        String sql = "INSERT INTO BANDA (nome, anoLaunch) VALUES (?, ?)";
         
        int result = jdbcTemplate.update(sql, "Calcinha Preta", 1996);
         
        if (result > 0) {
            System.out.println("A new row has been inserted.");
        }
         
    }


}
