package dao.impl;

import java.util.List;

import java.sql.Connection;

import javax.sql.DataSource;

import mappers.DataMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import beans.DataModel;
import dao.DataDao;


@Component
public class DataDaoImpl implements DataDao {
	@Autowired
	private DataSource dataSource;
	
	private String sql;
	
	public void setID(int id){
		sql=""+id+"";
	}
	
	public List<DataModel> getAllData(){
		return new JdbcTemplate(dataSource).query(sql, new DataMapper());
	}
}