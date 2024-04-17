package com.tns.daysixstaticvariable;

public class Employee {
	// Declare instance variables.
	private String name;
	private int id;
	// TNS which is common for all the objects.
	static String companyName = "TNS";
	Employee()
	{
	System.out.println("default constructor");	
	}	
	
	Employee(String name, int id) {
	this.name = name;
	this.id = id;
	}

	@Override
	public String toString() {
	return "Employee [name=" + name + ", id=" + id + ", Company="+companyName+"]";
	}

	public static void main(String[] args) {
		Employee e = new Employee("Shubh", 123);
		System.out.println(e);
		
		e = new Employee("Deep", 321);
		System.out.println(e);
		}

}
