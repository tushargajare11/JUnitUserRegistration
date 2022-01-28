package com.bridgelabz;

import com.bridgelabz.UserRegistration;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

public class JUnitUserRegistration {
	@Test
	public void givenFirstName_WhenProper_ShouldReturnTrue() throws UserDefineException {
		UserRegistration user = new UserRegistration();
		boolean isValid = user.validateFirstName1.validate("Kamal");
		Assert.assertTrue(isValid);
	}

	@Test
	public void givenFirstName_WhenFirstLetterSmall_ShouldReturnFalse() throws UserDefineException {
		UserRegistration user = new UserRegistration();
		boolean isValid = user.validateFirstName1.validate("kamal");
		Assert.assertFalse(isValid);

	}

	@Test
	public void givenFirstName_WhenEmptyString_ShouldReturnFalse() throws UserDefineException {
		UserRegistration user = new UserRegistration();
		boolean isValid = user.validateFirstName1.validate("");
		Assert.assertFalse(isValid);

	}

	@Test
	public void givenFirstName_WhenShort_ShouldReturnFalse() throws UserDefineException {
		UserRegistration user = new UserRegistration();
		boolean isValid = user.validateFirstName1.validate("ka");
		Assert.assertFalse(isValid);

	}

	@Test
	public void givenFirstName_WhenHavingNumber_ShouldReturnFalse() throws UserDefineException {
		UserRegistration user = new UserRegistration();
		boolean isValid = user.validateFirstName1.validate("734");
		Assert.assertFalse(isValid);

	}

	@Test
	public void givenFirstName_WhenHavingSpecialChar_ShouldReturnFalse() throws UserDefineException {
		UserRegistration user = new UserRegistration();
		boolean isValid = user.validateFirstName1.validate("Kam@#");
		Assert.assertFalse(isValid);

	}

	@Test
	public void givenLastName_WhenProper_ShouldReturnTrue() throws UserDefineException {
		UserRegistration user = new UserRegistration();
		boolean isValid = user.validateLastName.validate("Rajput");
		assertTrue(isValid);
	}

	@Test
	public void givenLastName_WhenFirstLetterSmall_ShouldReturnFalse() throws UserDefineException {
		UserRegistration user = new UserRegistration();
		boolean isValid = user.validateLastName.validate("rajput");
		assertFalse(null, isValid);

	}

	@Test
	public void givenLastName_WhenEmptyString_ShouldReturnFalse() throws UserDefineException {
		UserRegistration user = new UserRegistration();
		boolean isValid = user.validateLastName.validate("");
		assertFalse(isValid);

	}

	@Test
	public void givenLastName_WhenShort_ShouldReturnFalse() throws UserDefineException {
		UserRegistration user = new UserRegistration();
		boolean isValid = user.validateLastName.validate("ra");
		assertFalse(isValid);

	}

	@Test
	public void givenLastName_WhenHavingNumber_ShouldReturnFalse() throws UserDefineException {
		UserRegistration user = new UserRegistration();
		boolean isValid = user.validateLastName.validate("4535");
		assertFalse(isValid);

	}

	@Test
	public void givenLastName_WhenHavingSpecialChar_ShouldReturnFalse() throws UserDefineException {
		UserRegistration user = new UserRegistration();
		boolean isValid = user.validateLastName.validate("r#@t");
		assertFalse(isValid);

	}

	@Test
	public void givenEmail_WhenProper_ShouldReturnTrue() throws UserDefineException {
		UserRegistration user = new UserRegistration();
		boolean isValid = user.validateMail.validate("kamal@gmail.com");
		Assert.assertTrue(isValid);
	}

	@Test
	public void givenEmail_WhenEmptyString_ShouldReturnFalse() throws UserDefineException {
		UserRegistration user = new UserRegistration();
		boolean isValid = user.validateMail.validate("");
		Assert.assertFalse(isValid);

	}

	@Test
	public void givenEmail_WhenShort_ShouldReturnFalse() throws UserDefineException {
		UserRegistration user = new UserRegistration();
		boolean isValid = user.validateMail.validate("fshg");
		Assert.assertFalse(isValid);

	}

	@Test
	public void givenPhoneNo_WhenProper_ShouldReturnTrue() throws UserDefineException {
		UserRegistration user = new UserRegistration();
		boolean isValid = user.validatePhone.validate("918806547659");
		Assert.assertTrue(isValid);
	}

	@Test
	public void givenPhoneNo_WhenShort_ShouldReturnFalse() throws UserDefineException {
		UserRegistration user = new UserRegistration();
		boolean isValid = user.validatePhone.validate("9188064");
		Assert.assertFalse(isValid);

	}

	@Test
	public void givenPassword_WhenOnespecialcharacter_ShouldReturnTrue() throws UserDefineException {
		UserRegistration user = new UserRegistration();
		boolean isValid = user.validatePassword.validate("pasW8rrd#");
		Assert.assertTrue(isValid);
	}

	@Test
	public void givenPassword_WhenShort_ShouldReturnFalse() throws UserDefineException {
		UserRegistration user = new UserRegistration();
		boolean isValid = user.validatePassword.validate("Pass");
		Assert.assertFalse(isValid);

	}

	@Test
	public void givenPassword_WhenNospecialcharacter_ShouldReturnFalse() throws UserDefineException {
		UserRegistration user = new UserRegistration();
		boolean isValid = user.validatePassword.validate("Password");
		Assert.assertFalse(isValid);

	}

}
