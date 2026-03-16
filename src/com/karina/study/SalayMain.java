package com.karina.study;

import java.util.Scanner;

public class SalayMain {

	public static void main(String[] args) {
		
		//멤버를 사용하려면 객체를 먼저 생성
		//변수선언 객체 생성
		//클래스는 데이터타입이다
		Scanner sc=new Scanner(System.in);
		Salay man=new Salay();
		
		//멤버사용
		//멤버 변수 사용
		//참조변수명.맴버변수명()
		System.out.println("급여를 입력하세요");
		int s=sc.nextInt();
		man.make(s,false);
		
		System.out.println("세전급여 : "+s);
		
		int [] nums = {1,2,3};
		
		man.test(nums);
		System.out.println(nums[0]);
	}

}
