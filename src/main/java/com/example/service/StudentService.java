package com.example.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.entities.Student;

public interface StudentService {

	public List<Student>getAllStudents();
	public Student AddStudent(Student s);
	public Student UpdateStudent(Student s);
	public void DeleteStudent(long id);
	public List<Student>getStudentsByAge();
	
	
}
