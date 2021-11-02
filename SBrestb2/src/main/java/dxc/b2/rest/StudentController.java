package dxc.b2.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * Controller controls the incoming requests i.e maps the url to the method
 * @author Lenovo
 *
 */
@RestController
public class StudentController {
	@Autowired
	StudentService studentService;

	@RequestMapping("/students")
	public List<Student> getStudents(){
		return studentService.getStudents();
	}
	@RequestMapping("/students/{id}")
	public Student findStudent(@PathVariable int id) {//in url path there's a variable
		return studentService.findStudent(id);
	}


	@GetMapping("/")
	public String home() {
		return ("<h1>welcome home</h1>");
	}

	@GetMapping("/admin")
	public String admin() {
		return ("<h1>welcome admin</h1>");
	}

	@GetMapping("/user")
	public String user() {
		return ("<h1>welcome user</h1>");
	}

}
