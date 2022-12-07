package com.albertbravo.loginregdemo.models;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

// annotations not needed
public class LoginUser {
	@NotEmpty(message="Email is required.")
	@Email(message="Enter a valid email.")
	private String loginEmail;
	@NotEmpty(message="Password is required.")
	@Size(min=8, message="Password must be atleast 8 characters.")
	private String loginPassword;
	
	public LoginUser() {
		
	}

	public String getLoginEmail() {
		return loginEmail;
	}

	public void setLoginEmail(String loginEmail) {
		this.loginEmail = loginEmail;
	}

	public String getLoginPassword() {
		return loginPassword;
	}

	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}

	
	
	

}
