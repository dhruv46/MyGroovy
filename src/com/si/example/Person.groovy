package com.si.example

public class Person{
	String firstName
	String lastName
	int age
	def address
	
	static void main(def args) {
		Person p = new Person()
		p.setFirstName("Lars")
		p.lastName = "Vogel" 
		p.address = ("Homestreet 3");
		println(p.firstName + " " + p.lastName);
		// Use the generated constructor
		p = new Person(firstName: "Peter", lastName:"Mueller");
		println(p.firstName + " " + p.lastName);
	}	
}