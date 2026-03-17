package com.karina.lang;

public class WrapperMain1 {

	public static void main(String[] args) {
		String n="123";
		Integer integer=new Integer(n);
		
		integer=Integer.valueOf(n);
		Long l=Long.valueOf(n);
		System.out.println(integer+1);
		
		//autu-boxing , auto-unboxing
		int num=3;
		integer=num;//auto-boxing
		num=integer;//auto-boxing
	
			long number=3L;
			integer=(int)number;//	auto-boxing
			//num=l;
			//parsing
			Integer.parseInt("123");
			

	}

}
