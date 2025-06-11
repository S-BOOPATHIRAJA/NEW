package com.example.Spring.bean;

public class PythonCourse implements CourseStatus
{

	@Override
	public void startLearn() {
		// TODO Auto-generated method stub
		System.out.println("py learn");
	}

	@Override
	public void stopLearn() {
		// TODO Auto-generated method stub
		System.out.println("py stop");
	}

}
