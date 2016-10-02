package application;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Person {
	
	private StringProperty firstname=new SimpleStringProperty(this,"firstname","");

	//Retun StringProperty Object
	public StringProperty firstnameProperty() {
		return firstname;
	}
	
	public String getFirstname() {
		return firstname.get();
	}

	public void setFirstname(String firstname) {
		this.firstname .set(firstname);
	}
	

}
