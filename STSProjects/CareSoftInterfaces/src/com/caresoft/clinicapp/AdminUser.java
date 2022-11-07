package com.caresoft.clinicapp;

import java.util.ArrayList;
import java.util.Date;

public class AdminUser extends User implements HIPAACompliantUser, HIPAACompliantAdmin {
	private String role;
	private ArrayList<String> securityIncidents = new ArrayList<String>();
	
	public AdminUser(Integer id, String role) {
		super(id);
		this.role = role;
	}
	
	public boolean assignPin(int pin) {
		if(pin < 100000) {
			return false;
		}
		else {
			setPin(pin);
			return true;
		}
	}
	
	public boolean accessAuthorized(Integer confirmedAuthID) {
		if(id == confirmedAuthID) {
			System.out.println();
			return true;
		}
		else {
			authIncident();
			return false;
		}
	}
	
	public ArrayList<String> reportSecurityIncidents() {
		return securityIncidents;
	}
	
	public void newIncident(String notes) {
		String report = String.format(
				"Datetime Submitted: %s \n, Reported By ID: %s\n Notes: %s \n", new Date(),
				this.id, notes);
		securityIncidents.add(report);
	}
	
	public void authIncident() {
		String report = String.format(
				"Datetime Submitted: %s \n, ID: %s\n Notes: %s \n", new Date(), this.id,
				"Authorization Attempt Failed For This User");
//		System.out.println(report);
//		System.out.println(securityIncidents);
		securityIncidents.add(report);
//		System.out.println(securityIncidents);
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public ArrayList<String> getSecurityIncidents() {
		return securityIncidents;
	}

	public void setSecurityIncidents(ArrayList<String> securityIncidents) {
		this.securityIncidents = securityIncidents;
	}
	
	
}
