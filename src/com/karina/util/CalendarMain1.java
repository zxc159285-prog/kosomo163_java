package com.karina.util;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalendarMain1 {

	public static void main(String[] args) {
		//현재 날짜와 시간정보가 들어감
		Calendar calendar=Calendar.getInstance(); //이걸 쓰는순간 현재시간을 가져옴
		Calendar out = Calendar.getInstance();
		
//		calendar.set(Calendar.YEAR, 2030);
//		calendar.set(Calendar.MONTH,3);
		out.set(Calendar.HOUR,11);
		Date date=calendar.getTime();
		System.out.println(date);
		
		
		
		
		int m=calendar.get(Calendar.MONTH); //월만 1월이 0부터시작함
		int y=calendar.get(Calendar.YEAR);
		int h=calendar.get(Calendar.HOUR_OF_DAY);
		int s=calendar.get(Calendar.SECOND);
		System.out.println(m);
		System.out.println(y);
		System.out.println(h);
		System.out.println(s);
		
		//들어간시간
		long in=calendar.getTimeInMillis();
		long ou=out.getTimeInMillis();
		long result=ou-in;
		result=result/1000;
		result=result/60;
		result=result/60;
		System.out.println(result);
	}

}
