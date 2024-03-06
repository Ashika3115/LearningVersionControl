package com.immutable;

public class Address {
	
	private String streetName;
	private String city;
	private String zipCode;
	public String getStreetName() {
		return streetName;
	}
	public String getCity() {
		return city;
	}
	public String getZipCode() {
		return zipCode;
	}
	
	
	
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public Address(String streetName, String city, String zipCode) {
		super();
		this.streetName = streetName;
		this.city = city;
		this.zipCode = zipCode;
	}
	@Override
	public String toString() {
		return "Address [streetName=" + streetName + ", city=" + city + ", zipCode=" + zipCode + "]";
	}
	
	
	

}
