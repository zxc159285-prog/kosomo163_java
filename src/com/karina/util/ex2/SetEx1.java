package com.karina.util.ex2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class SetEx1 {

	public static void main(String[] args) {
		Random random = new Random();
		boolean flag = true;
		HashSet<Integer> set = new HashSet<>();

		while (set.size() != 6) {
			int n = random.nextInt(45) + 1; // 0~45미만의 랜덤한 수 +1

			set.add(n);

		}
		//이터레이터는 하나씩 꺼낼수없는 set의 데이터를 하나씩 꺼내게하는 메서드
		Iterator<Integer> it=set.iterator();
		while(it.hasNext()) {
			int n =it.next();
			System.out.println(n);
		}
		
		System.out.println(set);

	}

}
