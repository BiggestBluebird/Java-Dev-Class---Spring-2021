package com.java_course_2021.SpringBootWebApp21.DAO;

import org.springframework.data.repository.CrudRepository;

import com.java_course_2021.SpringBootWebApp21.Model.Course;

public interface CourseDAO extends CrudRepository<Course, Long> {

}
