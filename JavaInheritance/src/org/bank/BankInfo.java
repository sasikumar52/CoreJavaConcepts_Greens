package org.bank;

//Task5 single Inheritance
public class BankInfo extends AxisBank {
	private void savings() {

		System.out.println("Savings is 9%");
	}
	private void fixedDeposit() {

		System.out.println("FD is 6%");
	}
	public static void main(String[] args) {
		BankInfo bank=new BankInfo();
		bank.savings();
		bank.fixedDeposit();
		bank.deposit();
	}

}
