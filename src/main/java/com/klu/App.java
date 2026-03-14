package com.klu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.klu.springcore_student.Student;

public class App {

    public static void main(String[] args) {

    System.out.println("Owner: Gangadhar (ID: 2400030058)");

        ApplicationContext context =
                new ClassPathXmlApplicationContext("beans.xml");

        Student student = (Student) context.getBean("studentBean");

        student.display();
    }
}