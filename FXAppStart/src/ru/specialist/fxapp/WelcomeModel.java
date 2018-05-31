package ru.specialist.fxapp;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.binding.StringBinding;

public class WelcomeModel {
	
	//private String userName;
	private StringProperty userNameProperty = new SimpleStringProperty();
	private StringBinding welcomeStringBinding =
		new StringBinding() {
			{
				super.bind(userNameProperty);
			}
			protected String computeValue() {
				return String.format("Welcome, %s!", getUserName());
			}
		};


	public String getUserName() {
		//return userName;
		return userNameProperty.get();
	}

	public void setUserName(String userName) {
		//this.userName = userName;
		this.userNameProperty.set(userName);
	}
	
	public StringProperty userNameProperty( ) {
		return userNameProperty;
	}
	
	public String getWelcomeString()
	{
		return welcomeStringBinding.get();
	}
	
	public StringBinding welcomeStringProperty() {
		return welcomeStringBinding;
	}
}
