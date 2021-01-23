package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {

	private String name, email;
	private Date birthDate;
	
	SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
	
	public Client (String name, String email, Date birthDate) {
		this.name = name;
		this.email = email;
		this.birthDate = birthDate;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	
	public String toString( ) {
		return "Client: "
				+ name
				+ " ("
				+sdf1.format(birthDate)
				+") "
				+ "- "
				+ email;
	}
		
	

	
}
