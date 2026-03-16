package com.karina.star.zerg;

public class Drone {
	
	public int hp;
	public int damage;
	private String color;
	String name;
	
	public void work() {
		System.out.println("드론이 일합니다.");
		this.info();
	}
	public void info() {
		System.out.println("체력: "+hp);
		System.out.println("공격력: "+damage);
		System.out.println("색깔: "+color);
		System.out.println("이름: "+name);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
