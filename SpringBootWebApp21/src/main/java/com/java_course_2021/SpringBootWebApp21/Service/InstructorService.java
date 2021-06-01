package com.java_course_2021.SpringBootWebApp21.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java_course_2021.SpringBootWebApp21.DAO.InstructorDAO;
import com.java_course_2021.SpringBootWebApp21.Model.Instructor;

@Service
public class InstructorService {

	@Autowired
	private InstructorDAO instructorDAO;

	public List<Instructor> findAll() {
		return instructorDAO.findAll();
	}
}
