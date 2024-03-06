package com.comparator.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

 class EmployeeX {

	private String id;
	private String ame;
	private int salary;
	public String getId() {
		return id;
	} 
	public void setId(String id) {
		this.id = id;
	}
	public String getAme() {
		return ame;
	}
	public void setAme(String ame) {
		this.ame = ame;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public EmployeeX(String id, String ame, int salary) {
		super();
		this.id = id;
		this.ame = ame;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "EmployeeX [id=" + id + ", ame=" + ame + ", salary=" + salary + "]";
	}			
}
 
 class SortBySalary implements Comparator<EmployeeX>
 {
	@Override
	public int compare(EmployeeX o1, EmployeeX o2) {	
		int i = o1.getSalary() - o2.getSalary();
		if(i == 0)
			return o1.getAme().compareTo(o2.getAme());
		return i;
	}

	
 }

	public class EmloyeeM{
		public static void main(String args[])
		{
			ArrayList<EmployeeX> arrayList = new ArrayList<EmployeeX>();
			
			EmployeeX employeeX = new EmployeeX("ashika", "hello", 8238);
			EmployeeX employeeX2 = new EmployeeX("ashay", "bello", 234324);
			EmployeeX employeeX3 = new EmployeeX("viraj", "mello", 5345);
			EmployeeX employeeX4 = new EmployeeX("manu", "kello", 5345);
			EmployeeX employeeX5 = new EmployeeX("vaidehi", "sello", 2342);
		
			arrayList.add(employeeX);
			arrayList.add(employeeX2);
			arrayList.add(employeeX3);
			arrayList.add(employeeX4);
			arrayList.add(employeeX5);
			
			Collections.sort(arrayList, new SortBySalary() );
			
			System.out.println(arrayList);
		}
	}
	
	

