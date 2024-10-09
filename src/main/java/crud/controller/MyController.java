package crud.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import crud.dao.Student;
import crud.dao.StudentLogin;

@Controller
public class MyController {
	
	@Autowired
	HibernetClass hibernetClass;
		
	@GetMapping("/")
	public String HomeFile()
	{
		return "home";
	}
	
	@GetMapping("/add-student")
	public String loadForm()
	{
		return "form";
	}
	
	
	@PostMapping("/add-student")
	public String Adding(@ModelAttribute Student  student,ModelMap map)
	{
		map.put("msg","Record Added successfully!!!!");
		hibernetClass.save(student);
		return "home";
	}	
	
	
	@RequestMapping("/fetch-all")
	public String Fetching(ModelMap map)
	{
	 List<Student> data = hibernetClass.fetchAll();
	 
		map.put("values", data);
		return "FetchAll";
	}
	
	
	@SuppressWarnings("unlikely-arg-type")
	@GetMapping("/edit")
	public String Editing(@RequestParam int id,ModelMap map ,Student student)
	{
		  student = hibernetClass.fetch(id);
		  if(student.equals("null"))
		  {
			  return "home";
		  }
		  else {
		map.put("Name", student.getName());
		map.put("Mobile", student.getMobile());
		map.put("Age", student.getAge());
		map.put("Address", student.getAddress());
		map.put("regno", student.getRegNo());
			return "edit";
		  }
	}
	
	@PostMapping("/edit")
	public String updated(Student student,ModelMap map,RedirectAttributes redirectAttributes)
	{			
		hibernetClass.edit(student);
		redirectAttributes.addFlashAttribute("edit", "record has been updated successfully");
//		map.put("edit", "record has been updated successfully!!!!");
		return "redirect:/fetch-all";
	}

	
	@GetMapping("delete")
	public String deleteing(@RequestParam int id,ModelMap map,RedirectAttributes redirectAttributes)
	{    
		 hibernetClass.delete(id);	
//	   		map.put("delete","record has been deleted successfully!!!!");	
	   		redirectAttributes.addFlashAttribute("edit", "record deleted successfully");
		return "redirect:/fetch-all";
	}
	
	
	
}
