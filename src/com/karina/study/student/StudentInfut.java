package com.karina.study.student;

import java.util.Scanner;

public class StudentInfut {
	public void infut(Student st) {
		Scanner sc=new Scanner(System.in);
		System.out.println("이름입력");
		st.name=sc.next();
		System.out.println("국어점수 입력");
		st.kor=sc.nextInt();
		System.out.println("영어점수 입력");
		st.eng=sc.nextInt();
		System.out.println("수학점수 입력");
		st.math=sc.nextInt();
	}
			
}
