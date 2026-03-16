package com.karina.lang;

import java.util.Scanner;

public class StringMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name="winter";
		char ch=name.charAt(5);//charAt은 문자열에서 특정 위치의 문자를 가져오는 메소드이다. 0부터 시작한다
		System.out.println(ch);
		
		Object obj=new Object();//String은 Object의 자식이므로 가능하다
		String str1=obj.toString();
		String str2=name.toString();//Object는 String의 부모이므로 가능하다
	
		System.out.println(obj);
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(name);
		
		String s3=sc.toString();
		System.out.println(s3);
		
		Object obj2=new Object();
		boolean c = obj.equals(obj2); //obj==obj2 둘이 같냐? 라고 묻는것
		System.out.println(c);
		
		String name2="Winter";
		c=name.equals(name2);
		System.out.println(c);
		c=name.equalsIgnoreCase(name2); //대소문자 구분없이비교하는 메소드
		System.out.println(c);
	}

}
