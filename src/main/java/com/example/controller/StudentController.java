package com.example.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.Student;
import com.example.serviceImpl.StudentServiceImpl;

@RestController
@RequestMapping(value="/students")
public class StudentController {
	
	@Autowired
	StudentServiceImpl service;

	
	@GetMapping("/getAllStudents")
	public List<Student> GetStudents() {
		return service.getAllStudents();
	}
	
	@PostMapping("/creatStudent")
	public Student CreatStudent(@RequestBody Student student) {
		return service.AddStudent(student);
	}
	
	@PutMapping("/students/{id}")
	public Student UpdateStudent(@RequestBody Student student, @PathVariable long id) {
		student.setId(id);
		return service.UpdateStudent(student);
		
	}
	
	@DeleteMapping("/deleteStudent/{id}")
	public void DeleteStudent(@PathVariable long id) {
		service.DeleteStudent(id);
		
	}
	
	@GetMapping("/getStudentsByAge")
	public List<Student> GetStudentsByAge() {
		return service.getStudentsByAge();
	}
	
	

}
