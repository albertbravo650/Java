package com.albertbravo.zookeeper.models;

public class Mammal {
	public int energyLevel = 100;
	
	public Mammal() {
		
	}
	
	public int displayEnergy() {
		System.out.println(energyLevel);
		return energyLevel;
	}

}
