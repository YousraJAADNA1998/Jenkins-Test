package com.example.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="student")
public class Student {
	
	@Id//primarykey
	@GeneratedValue//autoincrement
	@Column(nullable=false)
	private long id;
	
	@Column(nullable=false, length=20)
	private String firstname;
	
	@Column(nullable=false, length=20)
	private String lastname;
	
	@Column(nullable=false)
	private int age;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	

}
