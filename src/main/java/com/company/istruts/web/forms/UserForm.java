package com.company.istruts.web.forms;

import org.apache.struts.action.ActionForm;
import org.apache.struts.validator.ValidatorForm;

public class UserForm extends ValidatorForm{ //3 Step Validation  //ActionForm{

	private String userName;
	
	private String password;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
