package com.project.StudentProject.service;

import com.project.StudentProject.entity.Student;

public interface StudentService {

	public Student studata(Student stu);
	
	public Student getStudentById(Long sid);

	public void  deletedata(Long td);

	public Student getByName(String name);

	

	
	

}
