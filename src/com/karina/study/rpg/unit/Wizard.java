package com.karina.study.rpg.unit;

import com.karina.study.rpg.weapon.Staff;

public class Wizard extends Character {
	//이름 
	Staff staff;
	
	
	
	public Wizard() {
	
		
		
	}
	
	
	//부모로부터 상속받은 메서드의 내용을 채정의 하는것
	//오버라이딩 overriding
	//메서드의 선언부는 부모와 동일해야함
	//단, 접근지정자는 같거나 더 넓은 범위로 설정해야함
	
	public void attack() {
		System.out.println("마법 공격");
	}
	
	public void info() {
		super.info();
		System.out.println(staff);
		
	}
	
	public void a( ) {
		System.out.println(this.name);
	}
	
}

