package com.mindgate.main;

import com.mindgate.pojo.Address;
import com.mindgate.pojo.Employee;

public class Main {
	public static void main(String[] args) {
		Employee employee = new Employee(101, "Baburao", 150, new Address(1201,"Alephata road","Mumbai","Maharshtra"));
		System.out.println(employee);
	}
}
