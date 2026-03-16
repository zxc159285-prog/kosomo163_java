package com.karina.lang.ex2;

public class WeatherDTO {
	
	private String cityname;

	public String getCityname() {
		return cityname;
	}

	public void setCityname(String cityname) {
		this.cityname = cityname;
		
		
	}
	public String toString(){
		
		
		System.out.println(this.getCityname());
		
		return "";
		
	}
	
}
