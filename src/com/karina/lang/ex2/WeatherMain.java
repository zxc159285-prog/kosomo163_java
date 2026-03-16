package com.karina.lang.ex2;

public class WeatherMain {

	public static void main(String[] args) {
		WeatherMaker wm=new WeatherMaker(); //클래스명 이름 = 뉴 + 생성자
		WeatherDTO[]ar=wm.init();
		
		for(int i=0;i<ar.length;i++) {
			ar[i].toString();
		}

	}

}
