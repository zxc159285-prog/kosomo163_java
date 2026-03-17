package com.karina.lang.ex1;

import java.util.StringTokenizer;

public class StudentService {

	private String data;
	
	public StudentService() {
	this.data="iu-50-68-90-winter-87-85-76-suji-87-67-95";
	}
	
	public StudentDTO[] init() {
		//data를 파싱작업
		
		StringTokenizer st=new StringTokenizer(this.data,"-");
		
		
		StudentDTO[]ar=new StudentDTO[3];
		
		int index=0;
		while(st.hasMoreTokens()) {
			StudentDTO dto=new StudentDTO();
			String s1=st.nextToken();
			String s2=st.nextToken();
			String s3=st.nextToken();
			String s4=st.nextToken();
			System.out.println(s1);
			System.out.println(s2);
			System.out.println(s3);
			System.out.println(s4);
			dto.setName(s1);
			dto.setKor(Integer.parseInt(s2));
			dto.setEng(Integer.parseInt(s3));
			dto.setMath(Integer.parseInt(s4));
			ar[index]=dto;
			index++;
		System.out.println("===============");
		}
		return ar;
	
	}
	//학생검색
		public void search(){
			StudentView sv=new StudentView();
			StudentView studentDTO=new StudentView();
			studentDTO.();
			
		
	}
		
		
}

