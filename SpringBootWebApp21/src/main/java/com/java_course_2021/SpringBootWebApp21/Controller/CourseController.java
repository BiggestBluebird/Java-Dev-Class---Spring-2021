package com.java_course_2021.SpringBootWebApp21.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.java_course_2021.SpringBootWebApp21.DAO.CourseDAO;

@Controller
public class CourseController {

	@Autowired
	CourseDAO courseDAO;

	@RequestMapping("/course")
	public String course() {
		return "Courde Page";
	}

}
