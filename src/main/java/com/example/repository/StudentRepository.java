package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.entities.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student,Long>{

	@Query("SELECT s FROM student s WHERE s.age <= 22")
	 List<Student>findStudentsByAge();
}
