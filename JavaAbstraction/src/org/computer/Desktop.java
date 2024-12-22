package org.computer;
//Fully Abstraction
//Multiple Inheritance
public class Desktop implements Software,Hardware {
	private void desktopModel() {
     System.out.println("Desktop model is Apple");
	}
	@Override
	public void hardwareResources() {
		System.out.println("CPU and MONITER");	
	}

	@Override
	public void softwareResources() {
		System.out.println("Microsoft Office");
		
	}
	public static void main(String[] args) {
		Desktop desktop=new Desktop();
		desktop.desktopModel();
		desktop.hardwareResources();
		desktop.softwareResources();
	}

}
