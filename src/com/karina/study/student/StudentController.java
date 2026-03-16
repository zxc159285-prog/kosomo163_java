package com.karina.study.student;

import java.util.Scanner;

public class StudentController {
	//
	public void start(Student sta) {

		// 1.학생정보입력
		// 학생의 정보를 입력후 총점과 평균이 계산됨
		// 2.학생정보출력
		// 출력
		// 3.프로그램종료

		StudentTestJumsu tj = new StudentTestJumsu();
		StudentView sv = new StudentView();
		StudentInfut inf = new StudentInfut();

		
		boolean flag = true;
		Scanner sc = new Scanner(System.in);
		while (flag) {

			System.out.println("1.정보입력 " + "2.정보출력 " + "3.프로그램 종료");
			int pick = sc.nextInt();
			if (pick == 1) {
				inf.infut(sta);
				tj.t(sta);
			} else if (pick == 2) {
				sv.view(sta);
			} else {
				flag = false;
			}

		}
	}
}
