package com.albertbravo.thursdayweek2demo.models;

import java.util.HashMap;

public class SnackMachine extends VendingMachine implements MachineInterface {
	private boolean isOn;

	public SnackMachine(boolean isOn) {
		this.isOn = isOn;
	}

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		if(isOn) {
			System.out.println("Already on");
		} else {
			isOn = true;
			System.out.println("Turning machine on");
		}

	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		if(!isOn) {
			System.out.println("Already off");
		} else {
			isOn = false;
			System.out.println("Turning machine off");
		}

	}

	@Override
	public void buyItem(String item, double payment) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> currentInventory = this.getAllItems();
		Integer currentQuantity = currentInventory.get(item);
		if(currentQuantity == null) {
			System.out.println("Item cannot be found");
		} else {
			currentInventory.put(item, currentQuantity - 1);
		}

	}

	@Override
	public void restockItem(String item, int quantity, double price) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> currentInventory = this.getAllItems();
		HashMap<String, Double> currentPrices = this.getAllPrices();
		Integer currentQuantity = currentInventory.get(item);
		if(currentQuantity == null) {
			currentInventory.put(item, quantity);
			currentPrices.put(item, price)
		} else {
			currentInventory.put(item, currentQuantity + quantity);
		}

	}

}
