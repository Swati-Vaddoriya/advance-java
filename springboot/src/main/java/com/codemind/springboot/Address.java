package com.codemind.springboot;

public class Address {
	public Address() {
	}

	public Address(int houseNo, String street, String city) {
		this.houseNo = houseNo;
		this.street = street;
		this.city = city;
	}

	public int houseNo;
	public String street;
	public String city;

	public int getHouseNo() {
		return houseNo;
	}

	public void setHouseNo(int houseNo) {
		this.houseNo = houseNo;
	}

	@Override
	public String toString() {
		return "Address [houseNo=" + houseNo + ", street=" + street + ", city=" + city + "]";
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
