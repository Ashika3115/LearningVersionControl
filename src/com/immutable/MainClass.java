package com.immutable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MainClass {
public static void main(String[] args) {
	Address address = new Address("abc", "cdk", "hello");
	List<String> hobbyList = new ArrayList<String>();
	hobbyList.add("cricket");
	
	Employee employee = new Employee("f874", "ashika", address, hobbyList);
	System.out.println(employee);

	address.setCity("Berlin");
	address.setZipCode("763473");
	
	hobbyList.add("football");
	System.out.println(employee);
	Date d = new Date();

	//s1 - Make all the fields private
	//s2 - Make class final
	//s3 - for all the mutable fields, create deep copy of objects and initiallise them
	 		//at constructor level
	// also return the same from the getter methods.
	
	
	
}
}
