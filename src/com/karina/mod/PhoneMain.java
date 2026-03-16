package com.karina.mod;

public class PhoneMain {
	
	public void method() {
		System.out.println(Phone.company);
	}

	public static void main(String[] args) {
		//Phone p1=new Phone();
		Phone.company="삼성전자";
		Phone.info();
		
		
		
	}

}
