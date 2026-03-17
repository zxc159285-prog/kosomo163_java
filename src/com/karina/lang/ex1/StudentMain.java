package com.karina.lang.ex1;

public class StudentMain {

	public static void main(String[] args) {
//		StudentService ss=new StudentService();
//		StudentView sv=new StudentView();
//		StudentDTO[]ar=ss.init();
//		sv.view(ar);
		StudentController con=new StudentController();
		con.start();
	}

}
