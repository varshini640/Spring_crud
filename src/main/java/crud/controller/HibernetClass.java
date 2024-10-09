package crud.controller;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import crud.dao.Student;
import crud.dao.StudentLogin;

@Component
public class HibernetClass {

//	
//    static EntityManagerFactory factory=Persistence.createEntityManagerFactory("m5");
//	static EntityManager manager=factory.createEntityManager();
//	static EntityTransaction transaction=manager.getTransaction();

	@Autowired
	EntityManager manager;

	void save(Student student) {
		manager.getTransaction().begin();
		manager.persist(student);
		manager.getTransaction().commit();
	}

	List<Student> fetchAll() {
		Query details = manager.createNativeQuery("select * from Student", Student.class);
		List<Student> l = details.getResultList();
//	    for(Student s:l)
//	    {
//	    	System.out.println(s.getRegNo());
//	    	System.out.println(s.getName());
//	    	System.out.println(s.getAddress());
//	    	System.out.println(s.getAge());
//	    	System.out.println(s.getGender());
//	    	System.out.println(s.getMobile());
//	    }
		return l;
	}

	Student fetch(int id)
	{
		return manager.find(Student.class,id);
	}
	
	void edit(Student student) {
		manager.getTransaction().begin();
		manager.merge(student);
		manager.getTransaction().commit();
		System.out.println("updated");

	}

	void delete(int id) {
		Student student = manager.find(Student.class, id);
		manager.getTransaction().begin();
		manager.remove(student);
		manager.getTransaction().commit();

	}
	
	

}
