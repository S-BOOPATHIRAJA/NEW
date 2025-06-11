package com.project.StudentProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.StudentProject.entity.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Long> {

	public Student findByStud_name(String Stud_name);
}
