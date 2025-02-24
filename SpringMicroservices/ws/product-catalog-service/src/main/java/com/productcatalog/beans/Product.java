package com.productcatalog.beans;

public class Product {
	private String name;
	private int pid;
	private int price;
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	int getPid() {
		return pid;
	}
	void setPid(int pid) {
		this.pid = pid;
	}
	int getPrice() {
		return price;
	}
	void setPrice(int price) {
		this.price = price;
	}
	
}
