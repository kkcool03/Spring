package com.mindgate.pojo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProductMain {

	public static void main(String[] args) {
		System.out.println("main start");
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		System.out.println("applicationcontext created");
		Product product = applicationContext.getBean("product", Product.class);
		System.out.println("product is created");
		System.out.println(product);
		System.out.println(product.hashCode());
		
		System.out.println("=================================================================");

		Product product2 = applicationContext.getBean("product", Product.class);
		System.out.println("product is created");
		System.out.println(product2);
		System.out.println(product2.hashCode());
		System.out.println("main end");
	}

}
