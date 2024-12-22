package org.set.testpaper;

public  class Employee {
	//empId,name,phone,address,dob,doj,eMail,gender,Sal
	private  int empId;
	private String name;
	private	String phone;
	private String address;
	private String dob;
	private	String doj;
	private	String email;
	private	String gender;
	private	float salary;
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getDoj() {
		return doj;
	}
	public void setDoj(String doj) {
		this.doj = doj;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	public Employee(int empId, String name, String phone, String address, String dob, String doj, String email,
			String gender, float salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.phone = phone;
		this.address = address;
		this.dob = dob;
		this.doj = doj;
		this.email = email;
		this.gender = gender;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", phone=" + phone + ", address=" + address + ", dob="
				+ dob + ", doj=" + doj + ", email=" + email + ", gender=" + gender + ", salary=" + salary + "]";
	}
	
	
	
}
