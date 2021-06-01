package com.java_course_2021.SpringBootWebApp21.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java_course_2021.SpringBootWebApp21.DAO.StudentDAO;
import com.java_course_2021.SpringBootWebApp21.Model.Student;

@Service
public class StudentService {

	@Autowired
	private StudentDAO studentDAO;

	public List<Student> getStudents() {
		return Arrays.asList(
				new Student(102L, "He Man", "he_man@greyskull.cave", LocalDate.of(1955, Month.OCTOBER, 10), 40));
	}

	public List<Student> findAll() {
		return studentDAO.findAll();
	}

}
