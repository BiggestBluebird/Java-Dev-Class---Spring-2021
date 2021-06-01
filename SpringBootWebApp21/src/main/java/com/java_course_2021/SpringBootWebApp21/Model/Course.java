package com.java_course_2021.SpringBootWebApp21.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Course {

	// MEM VARS
	@Id
	private Long id;
	private String name;
	private String department;

	@ManyToOne
	private Student student;

	@ManyToOne
	private Instructor instructor;

	// CONSTRUCTORS
	public Course() {
		super();
	}

	public Course(String name, String department, String instructor) {
		super();
		this.name = name;
		this.department = department;

	}

	public Course(Long id, String name, String department, String instructor) {
		super();
		this.name = name;
		this.department = department;

	}

	// GET/SET
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", department=" + department + ", student=" + student + "]";
	}

	// to String

}
