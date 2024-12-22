package org.bank;

public class BankInfo extends AxisBank{
	public void savings() {

		System.out.println("9% Savings");
	}
	public void fixed()
	{
		System.out.println("7% Fixed");
	}
	public void deposit() {

		System.out.println("Successfully deposited");
		super.deposit();
	}
	public static void main(String[] args) {
		BankInfo bank=new BankInfo();
		bank.savings();
		bank.fixed();
		bank.deposit();
	}

}
