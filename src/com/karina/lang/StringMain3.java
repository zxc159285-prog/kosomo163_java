package com.karina.lang;

public class StringMain3 {

	public static void main(String[] args) {
		String n1="abc";
		String n2="abc";
		String n3=new String("abc");
		String n4=new String("abc");
		//참조변수를 출력하면 내부에있는 tostring이 자동으로 호출됨
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n1==n2);
		System.out.println(n3==n4);
		System.out.println(n3.equals(n4));
		//문자열은 불변성
		n3=n3+" : "+n4;
		
		StringBuffer sb=new StringBuffer();
		sb.append("1");
		sb.append(2);
		
		System.out.println(sb);
		
	}

}
