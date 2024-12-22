package org.Hierarchical;

public class ChildOne extends ParentClass {

	public void childMethodOne() {

		System.out.println("This is Child Method");
	}
	
	public static void main(String[] args) {
		
		ChildOne childOne=new ChildOne();
		childOne.childMethodOne();
		childOne.methodOne();
	}
}
