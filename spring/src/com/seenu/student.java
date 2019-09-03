package com.seenu;

class student{
	int id;
	String name;
	char gender;
	address address;
	public student(int id, String name, char gender, address address) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.address = address;
	}
	public void display() {
		System.out.println("******STUDENT DETAILS******");
		System.out.println("*************************************************");
		System.out.println("STUDENT ID  : "+id);
		System.out.println("STUDENT NAME: "+name);
		System.out.println("GENDER      : "+gender);
		System.out.println();
		System.out.println("address:.........");
		System.out.println();
		System.out.println("AREA :"+address.area);
		System.out.println("COUNTRY :"+address.country);
	}
	
}