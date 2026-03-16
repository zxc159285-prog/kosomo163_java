package com.karina.ex1;

public class Marine {
	String type;
	int damage;
	int speed;
	int hp;
	
	//공격
	//이동
	public void attack() {
		int power=30;
		System.out.println(power+"마력으로 뒷통수를 세게 갈긴다");
	}
	public void move() {
		int a=100;
		System.out.println(a+"마일의 속도로 은밀하게 이동한다");
	}
}
