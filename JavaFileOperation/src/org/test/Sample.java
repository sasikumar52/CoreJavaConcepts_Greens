package org.test;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class Sample {
	public static void main(String[] args) throws IOException {
		File f=new File("D:\\Java\\FileOperation");
		//To create folder
		boolean mkdir = f.mkdir();
		System.out.println(mkdir);
		
		//To create Sub folder
		File f1=new File("D:\\Java\\FileOperation\\sub\\Mul");
		boolean mkdirs = f1.mkdirs();
		System.out.println(mkdirs);
		
		//To create a file
		File f2=new File("D:\\Java\\FileOperation\\sub\\Mul\\inheritance.txt");
		boolean newFile = f2.createNewFile();
		System.out.println(newFile);
		
		//To check whether the file is readable or not
		boolean canRead = f2.canRead();
		System.out.println(canRead);
		boolean canWrite = f2.canWrite();
		System.out.println(canWrite);
	
		//To list out the files
		String[] list = f1.list();
		for (String x : list) {
			System.out.println(x);
			
		}
		
		//To list out the files along with path
		File[] listFiles = f1.listFiles();
		for (File y : listFiles) {
			System.out.println(y);
		}
		
		//To write the content in txt file
		FileUtils.write(f2, "Hi This is Inheritance file");
		//To join the content
		FileUtils.write(f2, "JavaSelenium",true);
		//To override the content
		FileUtils.write(f2, "API",false);
		//To Read the content
		List<String> lines = FileUtils.readLines(f2);
		for (String z : lines) {
			System.out.println(z);
		}
		
		//To copy files
		File f4=new File("D:\\Java\\FileOperation\\sub\\Mul\\polymorphism.txt");
		boolean newFile2 = f4.createNewFile();
		System.out.println(newFile2);
		FileUtils.copyFile(f2, f4);
		List<String> lines2 = FileUtils.readLines(f4);
		for (String a : lines2) {
			System.out.println(a);
			
		}

	
	}

}
