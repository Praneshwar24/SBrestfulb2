package dxc.b2.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

/**
 * this class will query the database and get the students required
 * @author Lenovo
 *
 */

@Service
public class StudentService {

	List<Student> students = new ArrayList<>();

	public void createStudents() {
		students.add(new Student(1, "Naruto", 1, 11));
		students.add(new Student(2, "Sasuke", 2, 22));
		students.add(new Student(3, "Sakura",3, 33));
		students.add(new Student(4, "Kakashi", 4, 44));

	}
	public List<Student> getStudents(){
		createStudents();
		return students;
	}

	public Student findStudent(int id) {

		Student student=  students.stream().
				filter(s -> s.getId() == id )
				.findFirst()
				.get();
		return student;
	}
	public void addStudent(Student student) {
		students.add(student);
		System.out.println("Added a student "+ student.getName());
	}










}
