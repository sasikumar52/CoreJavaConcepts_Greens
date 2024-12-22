package org.Hierarchical;

public class ChildTwo extends ParentClass {
	public void childMethod() {

		System.out.println("This is child two method");
	}
	
	public static void main(String[] args) {
		
		ChildTwo childTwo=new ChildTwo();
		childTwo.childMethod();
		childTwo.methodTwo();
	}

}
