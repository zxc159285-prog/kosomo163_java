package com.karina.study.rpg;

import com.karina.study.rpg.weapon.Staff;

public class Monster {
	
	
	String name;
	int hp;
	int damage;
	Staff staff;
	int gold=20;
	
	public Monster( ) {
		System.out.println("몬스터가 생성되었습니다.");
		this.name="슬라임";
	}

	public int check() {
		//hp가 0 이하인지 체크
		if(this.hp<1) {
			System.out.println("꾸엑");
		}
		
		
		return gold;
	}
}
