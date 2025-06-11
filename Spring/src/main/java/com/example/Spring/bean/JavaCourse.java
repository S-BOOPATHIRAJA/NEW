package com.example.Spring.bean;

public class JavaCourse implements CourseStatus
{

	@Override
	public void startLearn() {
		// TODO Auto-generated method stub
		System.out.println("java start");
	}

	@Override
	public void stopLearn() {
		// TODO Auto-generated method stub
		System.out.println("java stop");
	}

}
