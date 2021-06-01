package com.java_course_2021.SpringBootWebApp21.Model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Instructor {

	@Id
	private Long Id;
	private String name;
	private LocalDate dob;

	@OneToMany(mappedBy = "instructor")
	private List<Course> courses;

	public Instructor() {
		super();

	}

	public Instructor(Long id, String name, LocalDate dob) {
		super();
		Id = id;
		this.name = name;
		this.dob = dob;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "Instructor [Id=" + Id + ", name=" + name + ", dob=" + dob + "]";
	}

}
