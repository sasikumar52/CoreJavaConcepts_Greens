package org.all;
import org.tamil.Tamil;
//Task 1 Multilevel Inheritance
public class LanguageClass extends Tamil {
	public void allLanguage() {
		System.out.println("Employee speaks all languages");
	}
	public static void main(String[] args) {
		LanguageClass l=new LanguageClass();
		l.allLanguage();
		l.tamilLanguage();
		l.englishLanguage();
		l.teluguLanguage();
	}

}
