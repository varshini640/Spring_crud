package crud.dao;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;



import lombok.Data;


@Entity
@Data
public class Student {
    @GeneratedValue
	@Id
	private int RegNo;
    private String Name;
    private long Mobile;
    private int Age;
    private String Gender;
    private String Address;
	
	
	
}
