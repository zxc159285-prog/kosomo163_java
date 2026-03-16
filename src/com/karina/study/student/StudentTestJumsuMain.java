package com.karina.study.student;

import java.util.Scanner;

public class StudentTestJumsuMain {

	public static void main(String[] args) {
		StudentTestJumsu testjumsu=new StudentTestJumsu();
		Student student=new Student();
		student.kor=86;
		student.eng=89;
		student.math=70;
		
		
		testjumsu.t(student);
		System.out.println(student.total);
		System.out.println(student.avg);
		
		
		
		testjumsu.t2(student);
		System.out.println(student.total);
		System.out.println(student.avg);
		
		
		

	}

}
