package com.karina.study.student;

import java.lang.ModuleLayer.Controller;
import java.util.Scanner;

public class School {

	public static void main(String[] args) {
		// 학생1ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
//		StudentTestJumsu tj = new StudentTestJumsu();
//		StudentView sv=new StudentView();
//		Student st= new Student();
//		StudentInfut inf=new StudentInfut();
//		
//		inf.infut(st);
//		tj.t(st);
//		sv.view(st);

		// Student Controller start
		Student st = new Student();
		StudentController sta = new StudentController();
		
		sta.start(st);
		
			

		}
//		//학생2ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
//		Student st2=new Student();
//		st2.name="winter";
//		
//		//새로운 학생3명ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
//		Student [] students=new Student[3];
//		for(int i=0;i<students.length;i++) {
//			students[i]=new Student();
//		}
//		
//		System.out.println(students[0]);
//		
//		
//		
//				
//		//선생님ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
//		Teacher t=new Teacher();
//		t.name="종현";
//		t.st=st2;
//		
//		System.out.println(t.st.name);
//		
//		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
	}


