package org.set.testpaper;

import java.util.HashSet;
import java.util.Set;

public class Program4 {
	public static void main(String[] args) {
		Employee e1=new Employee(101, "Sasi", "904789", "Chennai","27/06/97","05/01/18","Sasi@123","Male",75000f);
		Employee e2=new Employee(102, "Vini", "902588", "Erode","16/04/2002","04/10/22","Vini@123","Female",55000f);
		Employee e3=new Employee(103, "Dinesh", "701028", "Kumbakonam","28/05/99","15/04/19","Dinesh@123","Male",60000f);
		Employee e4=new Employee(104, "Arima", "702588", "Chennai","05/04/97","05/01/18","Arima@123","Male",20000f);
		Employee e5=new Employee(105, "Raju", "898390", "Thanjai","18/07/97","02/12/18","Raju@123","Male",36000f);
		
		Set<Employee>s=new HashSet<Employee>();
		s.add(e1);
		s.add(e2);
		s.add(e3);
		s.add(e4);
		s.add(e5);
		for (Employee employee : s) {
			System.out.println(employee);
		}
	}

}
