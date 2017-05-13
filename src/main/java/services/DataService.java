package services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import beans.DataModel;
import dao.impl.DataDaoImpl;

@Service
public class DataService {
	@Autowired
	private DataDaoImpl dataDaoImpl;
	
	public List<DataModel> getAllData(int id){
		dataDaoImpl.setID(id);
		return dataDaoImpl.getAllData();
	}
}
