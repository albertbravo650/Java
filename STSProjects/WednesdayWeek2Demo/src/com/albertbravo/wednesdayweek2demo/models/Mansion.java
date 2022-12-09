package com.albertbravo.wednesdayweek2demo.models;

public class Mansion extends Home {
	private boolean hasHelipad;
	private boolean hasSaunas;
	private String fountainName;
	
	public Mansion(int squareFootage, int numberBathrooms, int numberBedrooms, int numberStories, boolean hasHelipad,
			boolean hasSaunas, String fountainName) {
		super(squareFootage, numberBathrooms, numberBedrooms, numberStories);
		this.hasHelipad = hasHelipad;
		this.hasSaunas = hasSaunas;
		this.fountainName = fountainName;
	}
	
	public void addBedroom() {
		// add 2 bedrooms
		this.setNumberBedrooms(getNumberBedrooms() + 2);
		this.setSquareFootage(getSquareFootage() + 250);
	}

	public boolean isHasHelipad() {
		return hasHelipad;
	}

	public void setHasHelipad(boolean hasHelipad) {
		this.hasHelipad = hasHelipad;
	}

	public boolean isHasSaunas() {
		return hasSaunas;
	}

	public void setHasSaunas(boolean hasSaunas) {
		this.hasSaunas = hasSaunas;
	}

	public String getFountainName() {
		return fountainName;
	}

	public void setFountainName(String fountainName) {
		this.fountainName = fountainName;
	}
	
	

}
