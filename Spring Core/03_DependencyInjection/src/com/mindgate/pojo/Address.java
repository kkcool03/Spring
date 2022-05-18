package com.mindgate.pojo;

public class Address {
	private int addressID;
	private String street;
	private String city;
	private String state;
	
	public Address() {
		System.out.println("deafult constructor of address called");
	}

	public Address(int addressID, String street, String city, String state) {
		super();
		this.addressID = addressID;
		this.street = street;
		this.city = city;
		this.state = state;
		System.out.println("overloaded constructor of address called");
	}

	public int getAddressID() {
		return addressID;
	}

	public void setAddressID(int addressID) {
		System.out.println("Setting addressId ::" +addressID);
		this.addressID = addressID;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		System.out.println("Setting street ::" +street);
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		System.out.println("Setting city ::" +city);
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		System.out.println("Setting state ::" +state);
		this.state = state;
	}

	@Override
	public String toString() {
		return "Address [addressID=" + addressID + ", street=" + street + ", city=" + city + ", state=" + state + "]";
	}
	
	
	
	
}
