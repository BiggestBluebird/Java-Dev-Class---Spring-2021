package com.java_course_2021.SpringBootWebApp21.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.java_course_2021.SpringBootWebApp21.Model.Instructor;
import com.java_course_2021.SpringBootWebApp21.Service.InstructorService;

@Controller // serves a view
@RequestMapping("api/v1") // root folder
public class InstructorController {

	@Autowired
	private InstructorService instructorService;

	@GetMapping("/instructors") // Append after @RequestMapping root
	public String getInstructors(Model model) {
		List<Instructor> instructors = instructorService.findAll();
		model.addAttribute("instructors", instructors);
		return "instructor-list.html";
	}
}
