package com.project.StudentProject.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data

@ToString
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long Student_id;
	private String Stud_name;
	private String Stud_address;
	private int Marks;
	public Long getStudent_id() {
		return Student_id;
	}
	public void setStudent_id(Long student_id) {
		Student_id = student_id;
	}
	public String getStud_name() {
		return Stud_name;
	}
	public void setStud_name(String stud_name) {
		Stud_name = stud_name;
	}
	public String getStud_address() {
		return Stud_address;
	}
	public void setStud_address(String stud_address) {
		Stud_address = stud_address;
	}
	public int getMarks() {
		return Marks;
	}
	public void setMarks(int marks) {
		Marks = marks;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(Long student_id, String stud_name, String stud_address, int marks) {
		super();
		Student_id = student_id;
		Stud_name = stud_name;
		Stud_address = stud_address;
		Marks = marks;
	}
	
	

}
