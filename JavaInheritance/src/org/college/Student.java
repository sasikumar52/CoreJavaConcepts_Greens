package org.college;

//Task3 Multilevel Inheritance
public class Student extends Department {
	private void studentName() {
		System.out.println("Sasikumar");
	}
	private void studentDept() {

		System.out.println("CSE");
	}
	private void studentId() {

		System.out.println("101");
	}
	public static void main(String[] args) {
		Student student=new Student();
		student.studentId();
		student.studentName();
		student.studentDept();
		student.deptName();
		student.hostelName();
		student.collegeCode();
		student.collegeName();
		student.collegeRank();
	}

}
