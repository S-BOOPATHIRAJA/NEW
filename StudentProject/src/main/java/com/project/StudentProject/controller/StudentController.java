package com.project.StudentProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.StudentProject.entity.Student;
import com.project.StudentProject.service.StudentService;

@RestController

public class StudentController {

	@Autowired
	public StudentService stuserv;
	
	@PostMapping("/insert")
	public Student studata(@RequestBody Student stu)
	{
		System.out.println("The Student is "+stu.getStud_name());
		return stuserv.studata(stu);
	}
	
	@GetMapping("/get/{id}")
	public Student getStudentById(@PathVariable Long id)
	{
		System.out.println("Student_Id is: "+id);
		return stuserv.getStudentById(id);
	}
	
	@DeleteMapping("/delete/{td}")
	public void deletedata(@PathVariable Long td)
	{
		System.out.println("The deleted data is : "+td);
            stuserv.deletedata(td);
		
	}
	@GetMapping("/getbyname/{name}")
	public Student getByName(@PathVariable("name") String name)
	{
		return stuserv.getByName(name);
		
	}
	/*@PutMapping("/update/{id}")
	public Student updatestudentData(@PathVariable Long id, @RequestBody Student st)
	{
		return st;
		
	}*/
}
