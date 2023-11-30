package com.solmart.spring_core_1.controller;

import com.solmart.spring_core_1.beans.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        System.out.println("inside main");
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationcontext.xml");
        Employee employee = (Employee) applicationContext.getBean("employee");
        System.out.println(employee.getFirstName());
    }
}
