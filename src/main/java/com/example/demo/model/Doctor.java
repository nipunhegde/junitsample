package com.example.demo.model;

import javax.persistence.Entity;


import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table
@Setter
@Getter
@ToString
public class Doctor {
	@Id
	private int id;
	private String name;
	private String gender;
	private int age;
	private String specialistfield;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSpecialistfield() {
		return specialistfield;
	}
	public void setSpecialistfield(String specialistfield) {
		this.specialistfield = specialistfield;
	}
	@Override
	public String toString() {
		return "Doctor [id=" + id + ", name=" + name + ", gender=" + gender + ", age=" + age + ", specialistfield="
				+ specialistfield + "]";
	}
	
	
	

}