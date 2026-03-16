package com.karina.biman;

public class MemberMain {

	public static void main(String[] args) {
		Member m1=new Member();
		m1.setName("iu");
		m1.setAge(30);
		m1.setHeight(160.0);
		m1.setWeight(45.0);
		
		//=====
		
		m1.getName();
		m1.getAge();
		m1.getHeight();
		m1.getWeight();
		
		System.out.println("이름: "+m1.getName());
		System.out.println("나이: "+m1.getAge());
		System.out.println("키: "+m1.getHeight());
		System.out.println("몸무게: "+m1.getWeight());
	}

}
