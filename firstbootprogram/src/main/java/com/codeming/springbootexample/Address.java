package com.codeming.springbootexample;

import org.springframework.stereotype.Component;

@Component
public class Address {
	
	public String cityName ="Bangalore";
	

	public String getCityName() {
		return cityName;
	}


	public void setCityName(String cityName) {
		this.cityName = cityName;
	}


	@Override
	public String toString() {
		return "Address [cityName=" + cityName + "]";
	}
	
	

}
