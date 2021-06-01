package com.java_course_2021.SpringBootWebApp21.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.java_course_2021.SpringBootWebApp21.Model.Student;
import com.java_course_2021.SpringBootWebApp21.Service.StudentService;

@Controller // is a listener
@RequestMapping("api/v1")
public class StudentController {

	@Autowired
	StudentService studentService;

//	@Autowired
//	StudentRepo sRepo;

	// MEM VARS
	// am class obj ref
//*	private final StudentService studentService;
//
//	@Autowired
//	public StudentController(StudentService studentService) {
//		super();
//		this.studentService = studentService;
//	}
//
//	@GetMapping
//	public List<Student> getStudents() {
//		return studentService.getStudents();
//	}
//}

//	
//	@RequestMapping("/")	
//	public String home() {
//		return "home.jsp";
//	}

//	@GetMapping("student")
//	public String studentJSP() {
//		return "student.html";
//	}

	@GetMapping("addStudent")
	public String addStudent(Student student) {
		// studentService.save(student);
		return "student.html";
	}

	@GetMapping("/students") // Append after @RequestMapping root
	public String getStudents(Model model) {
		List<Student> students = studentService.findAll();
		model.addAttribute("students", students);
		return "student-list.html";
	}
}
