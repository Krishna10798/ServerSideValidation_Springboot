package com.form.model;

import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class LoginData {
	@NotBlank(message = "UserName can't be empty!!")
	@Size(min=5,max=12,message = "UserName Contain 5 to 12 characters!!")
	private String userName;
	@Pattern(regexp = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$" ,message = "Invalid Email!!")
	private String email;
	@AssertTrue(message = "please check term & condition!!")
	private boolean aggred;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "LoginData [userName=" + userName + ", email=" + email + "]";
	}
	public boolean isAggred() {
		return aggred;
	}
	public void setAggred(boolean aggred) {
		this.aggred = aggred;
	}
	
	

}
