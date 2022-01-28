package com.bridgelabz;


//customize Exception 
public class UserDefineException extends Exception {
	public String errormessage;
	
	
	//Initializing constructor
	public UserDefineException(String message) {
		this.errormessage = message;
	}
}
