package org.test;

public class Singleton {
	private Singleton() {
		
	}
	static Singleton singleton;
	public static Singleton getObjectSingleton() {
		if (singleton==null) {
			singleton=new Singleton();
			return singleton;
		}
		
		else {
			return singleton;
		}

	}
	
	public static void main(String[] args) {
	
		Singleton s=getObjectSingleton();
		System.out.println(System.identityHashCode(s));
		
		Singleton s1=getObjectSingleton();
		System.out.println(System.identityHashCode(s1));
	}

}
