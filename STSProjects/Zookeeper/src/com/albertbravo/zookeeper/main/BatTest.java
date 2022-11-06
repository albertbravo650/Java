package com.albertbravo.zookeeper.main;

import com.albertbravo.zookeeper.models.Bat;

public class BatTest {

	public static void main(String[] args) {
		Bat bat1 = new Bat();
		bat1.attackTown();
		bat1.displayEnergy();
		bat1.attackTown();
		bat1.displayEnergy();
		bat1.attackTown();
		bat1.displayEnergy();
		bat1.eatHumans();
		bat1.displayEnergy();
		bat1.eatHumans();
		bat1.displayEnergy();
		bat1.fly();
		bat1.displayEnergy();
		bat1.fly();
		bat1.displayEnergy();
		

	}

}
