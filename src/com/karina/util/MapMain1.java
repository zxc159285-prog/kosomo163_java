package com.karina.util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapMain1 {

	public static void main(String[] args) {
		//generic
		HashMap<String,Integer> map=new HashMap<>();
		map.put("일", 1);
		map.put("이", 2);
		
		System.out.println(map.get("이"));
		System.out.println(map.size());
		
		//반복문을 사용
		Set<String>set = map.keySet();
		
		Iterator<String> it=set.iterator();
		
		while (it.hasNext()) {
			String k = it.next();
			System.out.println("key ; "+k);
			System.out.println(map.get(k));
			
		}

	}

}
