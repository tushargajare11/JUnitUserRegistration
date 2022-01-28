package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	private static final String FirstName = "^[A-Z][a-z]{2,}";
	private static final String LastName = "^[A-Z][a-z]{2,}";
	private static final String EmailRegex = "^[a-zA-Z0-9]+([+_.-][a-zA-Z0-9]+)*[@][a-zA-Z0-9]+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?";
	private static final String PhoneNoRegex = "^[0-9]{2}[0-9]{10}";
	private static final String PasswordRegex = ("^(?=.*[@#$%^&+=])(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{8,}$");

	static IUserRegistration validateFirstName1 = firstName -> {

		Pattern pattern = Pattern.compile(FirstName);
		Matcher matcher = pattern.matcher(firstName);

		return matcher.matches();

	};

	static IUserRegistration validateLastName = lastName -> {

		Pattern pattern = Pattern.compile(LastName);
		Matcher matcher = pattern.matcher(lastName);

		return matcher.matches();

	};

	static IUserRegistration validateMail = email -> {

		Pattern pattern = Pattern.compile(EmailRegex);
		Matcher matcher = pattern.matcher(email);

		return matcher.matches();
	};

	static IUserRegistration validatePhone = phone -> {

		Pattern pattern = Pattern.compile(PhoneNoRegex);
		Matcher matcher = pattern.matcher(phone);

		return matcher.matches();
	};

	static IUserRegistration validatePassword = password -> {
		Pattern pattern = Pattern.compile(PasswordRegex);
		Matcher matcher = pattern.matcher(password);

		return matcher.matches();
	};
}
