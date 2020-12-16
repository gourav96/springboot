package com.validate.model;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class LoginData {

	@NotBlank(message = "User Name Can't Be Empty...")
	@Size(min = 3, max = 12, message = "User Name Must Be Between 3 To 12 Characters")
	private String userName;
	
	@Email(regexp = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$"/* ,message = "Can't use ^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$" */)
	private String email;
	
	@AssertTrue(message = "Must Agree Terms And Condition...")
	private boolean agreed;

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
	
	public boolean isAgreed() {
		return agreed;
	}

	public void setAgreed(boolean agreed) {
		this.agreed = agreed;
	}

	@Override
	public String toString() {
		return "LoginData [userName=" + userName + ", email=" + email + "]";
	}

}
