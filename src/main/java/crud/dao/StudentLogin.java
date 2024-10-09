package crud.dao;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class StudentLogin {	
	@Id
	private String username;
	private String password;
	
	
	

}
