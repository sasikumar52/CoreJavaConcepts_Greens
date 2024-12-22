package org.testpaper;
//Count of even number 1 to 100
public class Program5 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i=0;i<100;i++)
		{
			if(i%2==0)
			{
				sum++;
			}
		}
		System.out.println(sum);
	}

}
