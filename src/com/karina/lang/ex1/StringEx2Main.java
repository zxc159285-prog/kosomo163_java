package com.karina.lang.ex1;

import java.util.Scanner;

public class StringEx2Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("파일명을 입력하세요");
		String fileName=sc.next();
		
		//파일명 >>>>파일이름.확장자
		//이미지 파일인지 체크,jpg,png,gif,jpeg
		//abc.png,test.txt
		//이미지파일입니다 or 이미지 파일이 아닙니다 를 출력
		
		
		
		int idx=fileName.lastIndexOf('.');
		System.out.println(idx);	//마지막.까지를 찾기
		
		String name=fileName.substring(idx+1); //.이후글자를 잘라내기
		System.out.println(name);
		
		//판별
		if(name.equalsIgnoreCase("jpg")) {
			System.out.println("이미지파일입니다");
		}
		else if(name.equalsIgnoreCase("jpg")) {
			System.out.println("이미지파일입니다");
		}
		else {
			System.out.println("이미지 파일이 아니다");
		}
		
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ다른방법
		String[]files= {"jpg","gif","png","jpeg"};
		
		String result="이미지 파일이 아니다";
		for(int i=0;i<files.length;i++) {
			if(name.equalsIgnoreCase(files[i])) {
				result="이미지파일입니다";
				break;
			}
		}
		
		System.out.println(result);

	}

}
