package com.karina.exception;

public class ExceptionEx {
	
	public void ex2() throws Exception{
		String s="abc";
		String s2="def";
		String s3=s+s2;
		if(s3.isEmpty()) {
			throw new Exception(); //강제로 예외를 발생시키기!
		}
		System.out.println(s3);
	}
	
	public void ex() throws ArithmeticException,RuntimeException,Exception{
		
		
		int a = 10;
		int b = 0;
		int c = a/b;
	}
	
	
}
