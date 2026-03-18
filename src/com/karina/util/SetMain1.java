package com.karina.util;

import java.util.HashSet;

public class SetMain1 {

	public static void main(String[] args) {
		HashSet<Integer> set=new HashSet<>();
		set.add(2); //중복허용 x
		set.add(5); //넣은순서대로 출력 x
		set.add(1);
		set.add(2);
		System.out.println(set.size());
	}

}
