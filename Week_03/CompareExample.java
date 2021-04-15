package com.batson_java_course_2021.Week_03;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

	public class CompareExample {
	    public void begin() {
	        Student student1 = new Student(5);
	        Student student2 = new Student(10);
	        Student student3 = new Student(7);

	        List<Student> students = new ArrayList<>();
	        students.add(student1);
	        students.add(student2);
	        students.add(student3);

	        System.out.println(students);
	        students.sort(new Comparator<Student>() {
	            @Override
	            public int compare(Student left, Student right) {
	                if (left.grade < right.grade) {
	                    return -1;
	                } else if (left.grade == right.grade) {
	                    return 0;
	                } else {
	                    return 1;
	                }
	            }
	        });
	        System.out.println(students);
	        students.sort(new StudentComparator());
	        System.out.println(students);
	    }

	    private class StudentComparator implements Comparator {
	        @Override
	        public int compare(Object left, Object right) {
	            Student a = (Student)left;
	            Student b = (Student)right;
	            return b.grade - a.grade;
	        }
	    }

	    private class Student implements Comparable {
	        public String firstName;
	        public String lastName;
	        public int grade;

	        public Student(int grade) {
	            this.grade = grade;
	        }

	        @Override
	        public String toString() {
	            return String.valueOf(this.grade);
	        }

	        @Override
	        public int compareTo(Object right) {
	            Student that = (Student)right;
	            return this.grade - that.grade;
	        }
	    }
	    
	}
}
