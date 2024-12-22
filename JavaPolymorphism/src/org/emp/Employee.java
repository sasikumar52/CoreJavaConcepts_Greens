package org.emp;
//Task1 Method Overload in polymorphism
public class Employee {

	public void empId(int id) {
		System.out.println("Employee id is :"+id);
	}
	public void empId(float salary) {
		System.out.println("Employee salary is :"+salary);
	}
	public void empId(String name,String city) {
		System.out.println("Employee name is :"+name+"\nEmployee city is :"+city);

	}
	public void empId(int pincode, long phone) {
		System.out.println("Employee pincode is :"+pincode+"\nEmployee Phone is :"+phone);
	}
	public static void main(String[] args) {
		Employee employee=new Employee();
		employee.empId(123);
		employee.empId("Sasi", "Kumbakonam");
		employee.empId(30000);
		employee.empId(612504, 9047898091l);
	}
}
