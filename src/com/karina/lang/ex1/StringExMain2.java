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
	
	
	
	
	}
}
}