package org.test;
//Task 1
public class A {
	public A()
	{
		this("Java");
		System.out.println("Default cons....");
	}

	public A(String name) {
		this(124);
		System.out.println(name);
	}

	public A(int id) {
		this(2234.33f);
		System.out.println(id);
	}

	public A(float sal) {
		System.out.println(sal);
	}
	public static void main(String[] args) {
		A a=new A();
	}

}
