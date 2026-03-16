package com.karina.daiso;

public class DaisoMain {

	public static void main(String[] args) {
	
		Notebook n1 = new Notebook();
		Keyboard k1 = new Keyboard();
		Mouse m1 = new Mouse();
		Tv t1 = new Tv();
		Mouse2 m2 = new Mouse2();
		
		Customer customer = new Customer();
		customer.money=10000000;
		customer.point=100;
		
		Electronics[] electronics = {n1, k1, m2,m1};
		customer.buy(electronics);
		

		
		
		}
	

	}


