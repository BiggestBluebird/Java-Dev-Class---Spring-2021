package com.java_course_2021.SpringBootWebApp21.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java_course_2021.SpringBootWebApp21.Model.Instructor;

public interface InstructorDAO extends JpaRepository<Instructor, Long> {

}
