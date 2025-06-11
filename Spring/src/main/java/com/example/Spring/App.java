package com.example.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.Spring.bean.CourseStatus;
import com.example.Spring.bean.JavaCourse;
import com.example.Spring.bean.PythonCourse;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       /* JavaCourse jav = new JavaCourse();
        jav.startLearn();
        PythonCourse py = new PythonCourse();
        py.startLearn();*/
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("./Resources/bean.xml");
    	
    	CourseStatus status = context.getBean(PythonCourse.class);
    	status.startLearn();
    	
    	
    }
}
