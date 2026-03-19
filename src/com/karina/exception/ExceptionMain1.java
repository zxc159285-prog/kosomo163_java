package com.karina.exception;

public class ExceptionMain1 {

	public static void main(String[] args) {
		ExceptionEx e1=new ExceptionEx();
		
		
		
		int a=10;
		int b=0;
		
		try {
		int c=a/b;
		String str=null;
		
		str.charAt(0);
		System.out.println(args[0]);
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}catch(RuntimeException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}catch(Throwable e) {
			e.printStackTrace();
		}finally {//예외가 발생하든 안하든 이 안에있는코드는 꼭 실행해라
			
		}
		System.out.println("종료");
	}

}
