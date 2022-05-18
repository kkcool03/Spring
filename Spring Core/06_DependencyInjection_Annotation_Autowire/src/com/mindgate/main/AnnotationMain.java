package com.mindgate.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mindgate.pojo.Address;
import com.mindgate.pojo.Employee;

public class AnnotationMain {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		
		Address address1 = applicationContext.getBean("address", Address.class);
		System.out.println(address1);
		address1.setAddressID(101);
		address1.setCity("mumbai");
		address1.setState("MH");
		address1.setStreet("MG ROAD");
		Employee employee = applicationContext.getBean("employee", Employee.class);
		
//		employee.setHomeaddress(address1);
		System.out.println(employee);
	}
}
