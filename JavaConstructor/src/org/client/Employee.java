package org.client;

public class Employee extends Company {
	//Non Parameterized constructor
	public Employee()
	{
		super(1234);
		System.out.println("Default constructor");
	}
	//Parameterized constructor
	public Employee(String name)
	{
		System.out.println("String para constructor:"+name);
	}
	public static void main(String[] args) {
		Employee employee=new Employee();
		Employee e1=new Employee("Sasi");
	}
}
