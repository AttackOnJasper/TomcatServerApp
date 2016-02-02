
package beans;

public class DataModel {
	
	public String name;
	public int id;
	
	public void setString(String name){
		this.name = name;
	}
	
	public String getString(){
		return this.name;
	}
	
	public void setID(int id){
		this.id = id;
	}
	
	public int getID(){
		return this.id;
	}
	
}
