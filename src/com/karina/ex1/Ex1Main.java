package com.karina.ex1;

import java.util.Scanner;

public class Ex1Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		Marine m1=new Marine();
		m1.damage=550;
		m1.speed=100;
		m1.type="teran";
		m1.hp=50;
	System.out.println(m1.type);
	System.out.println("1.공격 / 2.이동");
	int pick=sc.nextInt();
	
	if(pick==1) {
		m1.attack();
	}
	else {
	
	m1.move();
	}
	}

}
