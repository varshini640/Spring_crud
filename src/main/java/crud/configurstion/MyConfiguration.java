package crud.configurstion;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.jsp.el.VariableResolver;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@ComponentScan("crud")
public class MyConfiguration {

	@Bean
ViewResolver get()
	{
	 InternalResourceViewResolver resolver=new InternalResourceViewResolver();
	 resolver.setPrefix("frontend/");
	 resolver.setSuffix(".jsp");
	 return resolver;
		
//	 return new InternalResourceViewResolver("frontend/",".jsp");
	}
	
	@Bean
	EntityManager entitymanager()
	{
		return Persistence.createEntityManagerFactory("m5").createEntityManager();
	}

}

