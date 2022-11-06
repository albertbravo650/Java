package com.albertbravo.zookeeper.models;

public class Bat extends Mammal {

	public Bat() {
		// TODO Auto-generated constructor stub
		energyLevel = 300;
	}
	
	public void fly() {
		System.out.println("Swooooshhh!!");
		energyLevel -= 50;
	}
	
	public void eatHumans() {
		System.out.println("Chomp!!!");
		energyLevel += 25;
	}
	
	public void attackTown() {
		System.out.println("'crackle' 'crackle' Fireeee!!!");
		energyLevel -= 100;
	}

}
