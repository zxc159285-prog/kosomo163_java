package com.karina.util;

import java.util.ArrayList;

public class ListMain1 {

	public static void main(String[] args) {
		//ArrayList 객체생성
		int[]ar=new int[2];
		ArrayList list = new ArrayList(); //기본생성자선언
		
		list.add(1); //1을 추가한것
		list.add("two");//안됨 꺼내면 오브젝트타입임
		list.add(true);//안됨
		list.add(3);
		
		list.add(1, 0);//1번칸에 0을넣고 기존걸 그뒤로 밀자
		
		list.set(0, 100);//0번칸에있는 1을 100으로 바꾸자
		
//		list.remove(1);
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		list.clear();
		System.out.println(list.size());
		

	}

}
