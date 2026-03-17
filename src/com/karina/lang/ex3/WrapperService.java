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

	public void ageCount3(Scanner sc) {
		System.out.println("생년월일을 입력하세요 : xxxxxx-xxxxxxx");
		String data = sc.next();

		String[] y = data.split("-");
		String y1=y[0]+y[1];
		System.out.println(y1);
		int totalSum = 0; // 곱한 값들을 더할 변수
	    int gob = 2;      // 곱할 숫자 시작값

	    // 마지막 13번째 숫자는 검증용이므로 12번째까지만 반복합니다.
	    for (int i = 0; i < y1.length() - 1; i++) {
	        
	        // 1. y1(전체 문자열)에서 한 글자씩 숫자로 변환
	        int num = Integer.parseInt(String.valueOf(y1.charAt(i)));
	        
	        // 2. 숫자와 gob을 곱함
	        totalSum += num * gob;
	        
	        System.out.println(i + "번째 숫자(" + num + ") * " + gob + " = " + (num * gob));

	        // 3. gob을 1씩 증가시키고, 10이 되면 다시 2로 변경
	        gob++;
	        if (gob == 10) {
	            gob = 2;
	        }
	    }
	    
	    System.out.println("총 합계: " + totalSum);
	    
	    totalSum=totalSum%11;
	    totalSum=11-totalSum;
	    if (totalSum>9) {
	    	totalSum=totalSum%10;
	    }
	    System.out.println(totalSum);
	    char check=y[1].charAt(6);
	    Integer.parseInt(String.valueOf(check));
	    System.out.println(check);
	    
	    if(check==totalSum) {System.out.println("맞아요");}
	    	
	    
	}
	

}
	

