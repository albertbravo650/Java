package com.albertbravo.zookeeper.models;

public class Gorilla extends Mammal {
	
	public Gorilla() {
		
	}
	
	public void throwSomething() {
		System.out.println("Gorilla has thrown something!");
		energyLevel -= 5;
	}
	
	public void eatBananas() {
		System.out.println("Eating bananas.. yum yum");
		energyLevel += 10;
	}
	
	public void climb() {
		System.out.println("Gorilla has climbed a tree");
		energyLevel -= 10;
	}

}
