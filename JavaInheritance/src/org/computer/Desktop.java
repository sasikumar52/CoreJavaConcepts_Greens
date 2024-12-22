package org.computer;

//Task4 Single Inheritance
public class Desktop extends Computer {
	public void desktopSize() {
		System.out.println("The desktop size is 22.5Inch");
	}
	public static void main(String[] args) {
		Desktop desktop= new Desktop();
		desktop.desktopSize();
		desktop.computerModel();
	}

}
