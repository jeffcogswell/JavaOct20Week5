package co.grandcircus.employees;

import java.util.HashMap;

public class Employee {
	
	public static HashMap<Integer, Employee> Employees = createEmployees();
	
	private int id;
	private String FirstName;
	private String LastName;
	private String PhoneNumber;
	private String Email;
	private String Department;

	public Employee(int id, String firstName, String lastName, String phoneNumber, String email, String department) {
		super();
		this.id = id;
		FirstName = firstName;
		LastName = lastName;
		PhoneNumber = phoneNumber;
		Email = email;
		Department = department;
	}	
	
	private static HashMap<Integer, Employee> createEmployees() {
		// TODO Auto-generated method stub
		HashMap<Integer, Employee> emps = new HashMap<Integer, Employee>();
		Employee emp = new Employee(1, "Fred", "Franklin", "734-111-2222", "fred@acme.com", "IT");
		emps.put(1, emp);
		emp = new Employee(2, "Julie", "Jones", "734-123-1234", "julie@acme.com", "ACCT");
		emps.put(2, emp);
		emp = new Employee(3, "Sam", "Simpson", "734-333-1122", "sam@acme.com", "ACCT");
		emps.put(3, emp);
		emp = new Employee(4, "Adam", "Apple", "734-155-5432", "adam@acme.com", "IT");
		emps.put(4, emp);
		emp = new Employee(5, "Bob", "Barker", "734-222-1111", "bob@acme.com", "MGT");
		emps.put(5, emp);
		emp = new Employee(6, "Jim", "Francis", "734-222-1112", "jim@acme.com", "MGT");
		emps.put(6, emp);
		return emps;
	}

	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getPhoneNumber() {
		return PhoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getDepartment() {
		return Department;
	}
	public void setDepartment(String department) {
		Department = department;
	}

	public int getId() {
		return id;
	}
}
