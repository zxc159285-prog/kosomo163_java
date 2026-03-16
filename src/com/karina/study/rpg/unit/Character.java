package com.karina.study.rpg.unit;

import com.karina.study.rpg.weapon.Staff;


//추상클래스 abstract class : 객체생성 불가, 상속을 목적으로 만들어진 클래스
public abstract class Character {
	
	String name;
	int damage;
	int hp;
	int mp;
	int gold=0;
	int level;
	
	//추상메서드 abstract method : 선언부만 있고 구현부가 없는 메서드 자식클레스에서 반드시 오버라이딩 해야하는 메서드
	public abstract void attack();
	
	public void info() {
		System.out.println(this);
		System.out.println("이름 : "+this.name);
		System.out.println("공격력 : "+this.damage);
		System.out.println("체력 : "+this.hp);
		System.out.println("마나 : "+this.mp);
		System.out.println("골드 : "+this.gold);
		System.out.println("레벨 : "+this.level);
		
	}
}
