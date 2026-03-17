package com.karina.lang.ex3;

import java.util.Scanner;

public class WrapperService {

	public void ageCount2(Scanner sc) {
		System.out.println("주민번호를 입력하세요 : xxxxxx-xxxxxxx");
		String data = sc.next();
		System.out.println(data);

		int year = 2026;

		String[] y = data.split("-");
		String yn = y[0].substring(0, 2);
		String yn2 = y[1].substring(0, 1);
		System.out.println(yn2);

		System.out.println(yn + "년생이시군요");
		System.out.println(yn2.substring(0, 1).equals("1"));

		if (yn2.equals("1")) {
			yn = "19" + yn;
		} else if (yn2.equals("2")) {
			yn = "19" + yn;
		} else {
			yn = "20" + yn;
		}
		System.out.println(yn);
		int years = Integer.parseInt(yn);
		int age = year - years;
		System.out.println("당신의 나이는 " + age + "세 입니다.");
//		
	}

	public void ageCount(Scanner sc) {
		System.out.println("생년월일을 입력하세요 : xxxx-xx-xx");
		String data = sc.next();

		int year = 2026;

		// 1.Substring 으로 년, 월, 일 나누기 할수있음
		// 2. split으로 나누기
		String[] y = data.split("-");
		System.out.println(y[0] + "년생이시군요");

		int age = year - Integer.parseInt(y[0]);
		System.out.println("당신의 나이는 " + age + "세 입니다.");

		System.out.println("생일은 " + y[1] + " 월 " + y[2] + " 일 입니다.");
	}

}
