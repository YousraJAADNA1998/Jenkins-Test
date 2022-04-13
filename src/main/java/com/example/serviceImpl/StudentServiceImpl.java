package com.example.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entities.Student;
import com.example.repository.StudentRepository;
import com.example.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	StudentRepository repository;
	
	@Override
	public List<Student> getAllStudents() {
		return (List<Student>) repository.findAll();
	}

	@Override
	public Student AddStudent(Student s) {
		return repository.save(s);
	}

	@Override
	public Student UpdateStudent(Student s) {
		return repository.save(s);
		
	}

	@Override
	public void DeleteStudent(long id) {
		repository.deleteById(id);
		
	}

	@Override
	public List<Student> getStudentsByAge() {
      return repository.findStudentsByAge();
	}

}
