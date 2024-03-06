package com.immutable;

import java.util.ArrayList;
import java.util.List;

public final class Employee {

	private String empCode;
	private String empName;
	private Address address;
	private List<String> hobbies;
	public String getEmpCode() {
		return empCode;
	}
	public String getEmpName() {
		return empName;
	}
	public Address getAddress() {
		return address;
	}
	public List<String> getHobbies() {
		return hobbies;
	}
	Employee(String empCode, String empName, Address address, List<String> hobbies) {
		
		this.empCode = empCode;
		this.empName = empName;
		this.address = new Address(address.getStreetName(), address.getCity(), address.getZipCode());
		this.hobbies = new ArrayList<String>(hobbies);
	}
	@Override
	public String toString() {
		return "Employee [empCode=" + empCode + ", empName=" + empName + ", address=" + address + ", hobbies=" + hobbies
				+ "]";
	}
	
	
	
	
	
}
