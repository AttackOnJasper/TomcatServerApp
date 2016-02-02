package services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import beans.DataModel;
import DAO.DataDAOImpl;

@Service
public class DataService {
	@Autowired
	private DataDAOImpl dataDAOImpl;
	
	public List<DataModel> getAllData(int id){
		dataDAOImpl.setID(id);
		return dataDAOImpl.getAllData();
	}
}
