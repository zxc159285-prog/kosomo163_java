package com.karina.study.rpg.unit;
import com.karina.study.rpg.weapon.Sword;
import com.karina.study.rpg.weapon.Action;
import com.karina.study.rpg.weapon.Staff;
public class CharacterMain {

	public static void main(String[] args) {
		Wizard w1 = new Wizard();
		w1.name="간달프";
		Warrior w2 = new Warrior();
		
	
		//다형성
		Character c1=w2;
		System.out.println(c1.name);
		
		Warrior w3= (Warrior)c1;
		w3.weapon= new Sword();
		w3.weapon= new Staff();
		
		Action a = new Sword();
		
		

}
}
