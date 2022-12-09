package com.albertbravo.thursdayweek2demo.test;

import java.util.HashMap;

import com.albertbravo.thursdayweek2demo.models.SnackMachine;

public class MachineTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SnackMachine schoolMachine = new SnackMachine(true, true, new HashMap<String, Integer>(), new HashMap<String, Double>());
		
		schoolMachine.restockItem("M&Ms", 20, 1.49);
		schoolMachine.buyItem("M&Ms", 2.00);
		System.out.println(schoolMachine.getAllItems());
		System.out.println(schoolMachine.getAllPrices());
	}

}
