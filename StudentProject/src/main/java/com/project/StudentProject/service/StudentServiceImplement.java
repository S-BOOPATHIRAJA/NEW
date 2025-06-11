package com.project.StudentProject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.StudentProject.entity.Student;
import com.project.StudentProject.repository.StudentRepo;

@Service
public class StudentServiceImplement implements StudentService {
	@Autowired
	public StudentRepo studentrepo;

	@Override
	public Student studata(Student stu) {
		// TODO Auto-generated method stub
		return studentrepo.save(stu);
	}

	@Override
	public Student getStudentById(Long sid) {
		// TODO Auto-generated method stub
		return studentrepo.findById(sid).get();
	}

	@Override
	public void deletedata(Long td) {
		// TODO Auto-generated method stub
		studentrepo.deleteById(td);
	}

	@Override
	public Student getByName(String name) {
		// TODO Auto-generated method stub
		return studentrepo.findByStud_name(name);
	}

	/*@Override
	public Student getByName(String name) {
		// TODO Auto-generated method stub
		return studentrepo.getByName(name);
	}*/


	

}
