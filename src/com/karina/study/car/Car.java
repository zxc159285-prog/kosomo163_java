package com.karina.study.car;

public class Car {
	
	String company="kia";
	String model;
	int price;
	boolean manual;//true 수동, false 자동
	
	//인스턴스 초가화 블럭
	{
		System.out.println("인스턴스 초기화 블럭 :"+this.company);
		this.company="현대자동차";
		
	}
	//메서드 헤더, {}메서드 바디
	public Car() {
		this("그랜저");	
		System.out.println("기본생성자 호출");
	}
	public Car(String model) {
		this(model, 50000000);
	}
	public Car(String model,int price) {
		this.company="현대자동차";
		this.model=model;
		this.price=price;
		this.manual=false;
	}
	public Car(String model,int price,boolean manual) {
		System.out.println("생성자 :"+this.company);
		this.company="르노자동차";
		this.model=model;
		this.price=price;
		this.manual=false;
	}
	
	public void info() {
		
		System.out.println(this);
		System.out.println("제조사 : "+this.company);
		System.out.println("이름 : "+this.model);
		System.out.println("가격 : "+this.price);
		System.out.println("수동 여부 : "+this.manual);
	}
}
