package org.test;

public class Employee {
	//non parameterized constructor
	public Employee()
	{
		this("Sasi");
		System.out.println("Default constructor");
	}
	//parameterized constructor
	public Employee(String name) {
		this(123);
		System.out.println("String para constructor:"+name);
	}
	public Employee(int id) {
		System.out.println("Int para constructor:"+id);
	}
	public static void main(String[] args) {
		Employee e=new Employee();
	}

}
