package dao;

import java.util.List;
import beans.DataModel;

public interface DataDao{
	public void setID(int id);
	
	public List<DataModel> getAllData();
}