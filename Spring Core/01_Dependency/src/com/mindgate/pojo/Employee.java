package com.mindgate.pojo;

public class Employee {
	private int employeeID;
	private String name;
	private double salary;
	private Address address;

	public Employee() {
		
	}

	public Employee(int employeeID, String name, double salary, Address address) {
		super();
		this.employeeID = employeeID;
		this.name = name;
		this.salary = salary;
		this.address = address;
	}

	public int getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [employeeID=" + employeeID + ", name=" + name + ", salary=" + salary + ", address=" + address
				+ "]";
	}	
	
}
