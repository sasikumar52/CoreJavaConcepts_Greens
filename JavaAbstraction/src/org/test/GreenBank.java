package org.test;

//Partial Abstraction
public class GreenBank extends AxisBank{

	@Override
	void savings() {
		System.out.println("6%");
	}

	@Override
	void deposit() {
		System.out.println("7%");
	}
	public static void main(String[] args) {
		GreenBank bank=new GreenBank();
		bank.savings();
		bank.deposit();
		bank.fixed();
	}

}
