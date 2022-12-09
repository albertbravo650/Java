package com.albertbravo.wednesdayweek2demo.main;

import com.albertbravo.wednesdayweek2demo.models.Home;
import com.albertbravo.wednesdayweek2demo.models.Mansion;

public class InheritanceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Home myHome = new Home(1500, 2, 3, 1);
		System.out.println(myHome.getSquareFootage());
		myHome.addBedroom();
		System.out.println(myHome.getNumberBedrooms());
		
		Mansion myMansion = new Mansion(25000, 8, 15, 4, true, true, "Bravo Fountain");
		System.out.println(myMansion.getFountainName());
		myMansion.addBedroom();
		System.out.println(myMansion.getNumberBedrooms());

	}

}
