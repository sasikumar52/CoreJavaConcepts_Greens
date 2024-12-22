package org.india;

import org.tamilnadu.TamilNadu;
//Task2 Multilevel Inheritance
public class India extends TamilNadu{
	public void indias() {
		System.out.println("This is india");
	}
	public static void main(String[] args) {
		India india= new India();
		india.indias();
		india.malayalam();
		india.tamillanguage();
		india.telugu1();
		
	}

}
