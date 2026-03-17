package com.karina.lang.ex1;

import java.util.Scanner;

public class StudentController {

	public void start() {
		
		Scanner sc=new Scanner(System.in);
		StudentService ss=new StudentService();
		StudentDTO[]ar=null;
		StudentView sv=new StudentView();
		
		boolean flag=true;
		
		
		while(flag) {
			System.out.println("1.학생정보 초기화, 2.학생정보 출력, 3.종료");
			int i=sc.nextInt();
			
			if(i==1) {
				ar=ss.init();
				
			}else if (i==2) {
				sv.view(ar);
				
			}else break;
			
			
			
		}
	}
}
