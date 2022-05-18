package com.mindgate.pojo;

public class Product {
	private int productId;
	private String name;
	private double price;
	
	
public Product() {
	System.out.println("default called");
}


public Product(int productId, String name, double price) {
	
	super();
//	System.out.println("parameterized called");
	this.productId = productId;
	this.name = name;
	this.price = price;
	System.out.println("Overloaded COnstructor product");
}


public int getProductId() {
	return productId;
}


public void setProductId(int productId) {
	this.productId = productId;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public double getPrice() {
	return price;
}


public void setPrice(double price) {
	this.price = price;
}


@Override
public String toString() {
	return "Product [productId=" + productId + ", name=" + name + ", price=" + price + "]";
}	
	


}
