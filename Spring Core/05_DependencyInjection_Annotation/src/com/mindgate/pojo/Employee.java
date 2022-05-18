package com.mindgate.pojo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("employee")
@Scope("prototype")
public class Employee {
	private int employeeID;
	private String name;
	private double salary;
	private Address homeaddress;

	public Employee() {
		System.out.println("deafult constructor of employee called");
	}

	public Employee(int employeeID, String name, double salary, Address homeaddress) {
		super();
		this.employeeID = employeeID;
		this.name = name;
		this.salary = salary;
		this.homeaddress = homeaddress;
		System.out.println("overloaded constructor of employee called");
	}

	public int getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(int employeeID) {
		System.out.println("Setting addressId ::" +employeeID);
		this.employeeID = employeeID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("Setting name ::" +name);
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		System.out.println("Setting salary ::" +salary);
		this.salary = salary;
	}

	public Address getHomeaddress() {
		return homeaddress;
	}

	public void setHomeaddress(Address homeaddress) {
		System.out.println("Setting homeaddress ::" +homeaddress);
		this.homeaddress = homeaddress;
	}

	@Override
	public String toString() {
		return "Employee [employeeID=" + employeeID + ", name=" + name + ", salary=" + salary + ", homeaddress="
				+ homeaddress + "]";
	}
	
	
	
}
