package com.karina.lang.ex2;

public class WeatherDTO {
	
	private String cityname;
	private int kion;
	private double humidity;

	public int getKion() {
		return kion;
	}

	public void setKion(int kion) {
		this.kion = kion;
	}

	public double getHumidity() {
		return humidity;
	}

	public void setHumidity(double humidity) {
		this.humidity = humidity;
	}

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
