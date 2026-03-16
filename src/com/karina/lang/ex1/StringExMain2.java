package com.karina.lang.ex1;

public class StringExMain2 {
	public static void main(String[] args) {
	String str="Hellow World";
	char ch=str.charAt(0);
	int idx=str.indexOf("d");
	System.out.println(idx);
	idx=str.lastIndexOf('l');
	System.out.println(idx);
	
	// l 이 총 몇개인지 구하자
	int count=0;
	boolean flag=true;
	int index=-1;
	while(flag) {
		index=str.indexOf('l',index+1);
		if(index!=-1) {
			count++;
		
	}
		else {
			flag=false;
		}
	System.out.println(count);
	
	
	String st="한화, 기아 ,삼성,롯데,키움,SSG,두산,LG,NC,KT"; //기아 앞뒤로 띄어쓰기함
	String[] teams=st.split(",");
	for(int i=0;i<teams.length;i++) {
	
	
	System.out.println(teams[i]);
	}
	
	System.out.println(teams[1].trim().equals("기아"));//공백을 제거하기위해 trim사용
	
	
	
	
	}
}
}