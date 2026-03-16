package com.karina.star;
import com.karina.star.zerg.Drone;

public class StarMain {

	public static void main(String[] args) {
		Drone d1=new Drone();
		d1.work();
		d1.hp=40;
		d1.damage=5;
		d1.work();
	}

}
