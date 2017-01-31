package com.vivek.spring;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDAO {
	
	private JdbcTemplate myJDBCTemplate;
	
	
	public JdbcTemplate getMyJDBCTemplate() {
		return myJDBCTemplate;
	}
	public void setMyJDBCTemplate(JdbcTemplate myJDBCTemplate) {
		this.myJDBCTemplate = myJDBCTemplate;
	}
	public void findAll(){

		String sql = "SELECT * FROM employee";
		String name = null;
		int id;

		List<Map<String, Object>> rows = myJDBCTemplate.queryForList(sql);
		for (Map row : rows) {
			
			name = (String) row.get("name");
			id = (int)row.get("id");
			
			System.out.println(id +" " +name);
		}

		//System.out.println(name);
	}

}
