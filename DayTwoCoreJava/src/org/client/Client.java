package org.client;
import org.emp.Employee;
import org.emp.Company;

//Different package and different class
public class Client   {
	private void clientId() {
		System.out.println("Client id is : 101");
	}
	private void clientName() {
		System.out.println("Client name is : TCS");
	}
	public static void main(String[] args) {
		Client c= new Client();
		c.clientId();
		c.clientName();
		Employee e1= new Employee();
		e1.empId();
		e1.empName();
		Company c1= new Company();
		c1.compId();
		c1.compName();
	}

}
