package mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import beans.DataModel;

public class DataMapper implements RowMapper<DataModel>{
	public DataModel mapRow(ResultSet r, int rowNum) throws SQLException{
		DataModel data = new DataModel();
		//data.setXXX(rs.getString("XXX"));
		return data;
	}
}