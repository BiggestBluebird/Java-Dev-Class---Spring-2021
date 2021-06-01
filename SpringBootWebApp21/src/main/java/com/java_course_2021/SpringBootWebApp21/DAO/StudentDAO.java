package com.java_course_2021.SpringBootWebApp21.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java_course_2021.SpringBootWebApp21.Model.Student;

public interface StudentDAO extends JpaRepository<Student, Long> {

}
